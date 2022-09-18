package Admin;

import User.Client;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(33333);
            while (true) {
                Socket sc = serverSocket.accept();
                Client client = new Client(sc);
                //LiveController licnt=new LiveController(sc);
                //Thread t2 = new Thread(licnt);
                Thread t = new Thread(client);
                t.start();
            }

        } catch (IOException e) {
            System.out.println(e);
        }

    }

}
