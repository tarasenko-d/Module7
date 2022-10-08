package sockets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientSocket {

    private Socket socket;
    private msgReadThread treadIn;
    private msgWriteThread treadOut;

    public ClientSocket(String host, int port) {
        try {
            socket = new Socket(host, port);
            treadIn = new msgReadThread(socket);
            treadIn.start();
            treadOut = new msgWriteThread(socket);
            treadOut.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
