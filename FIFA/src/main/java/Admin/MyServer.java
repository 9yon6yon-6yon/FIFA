package Admin;

import User.Client;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Objects;

public class MyServer {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(33333);
             new Server2();

            while (true) {
                Socket sc = serverSocket.accept();
                Thread t = new Thread(new Client(sc));
                t.start();
            }

        } catch (IOException e) {
            System.out.println(e);
        }

    }

}
