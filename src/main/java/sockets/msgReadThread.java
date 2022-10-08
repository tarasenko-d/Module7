package sockets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class msgReadThread extends Thread {

    private Socket socket;
    private Scanner inServ;
    private int x=3;

    public msgReadThread(Socket socket) throws IOException {
        this.socket = socket;
        inServ = new Scanner(socket.getInputStream());
    }

    @Override
    public void run() {
        String incomingMsg;
        while (true) {
            System.out.println("Read cycle");
            if (x==3) {
                incomingMsg = inServ.nextLine();
                System.out.println(incomingMsg);
            }

        }
    }
}

