package sockets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class msgWriteThread extends Thread {

    private Socket socket;
    private Scanner in;
    private PrintWriter out;

    public msgWriteThread(Socket socket) throws IOException {
        this.socket = socket;
        in = new Scanner(System.in);
        out = new PrintWriter(socket.getOutputStream());
    }

    @Override
    public void run() {
        String userMsg;
        while (true) {
            if (in.hasNext()) {
                userMsg = in.nextLine();
                out.write(socket + ": " + userMsg + "\n");
            }
            out.flush();
        }

    }

}
