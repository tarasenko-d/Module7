package main;

import sockets.ClientSocket;

public class Main {

    private static final int PORT = 5051;
    private static final String HOST="localhost";

    public static void main(String[] args) {
        ClientSocket clientSocket = new ClientSocket(HOST,PORT);
    }

}
