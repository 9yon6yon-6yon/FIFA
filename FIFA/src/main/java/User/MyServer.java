package User;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

    public static void main(String[] args) {

        try{

            ServerSocket serverSocket=new ServerSocket(33333);
            while (true){

                Socket sc=serverSocket.accept();
                Client client = new Client(sc);
                Thread t = new Thread(client);
                t.start();


            }


        }


        catch(IOException e){

            e.printStackTrace();
        }

    }

}
