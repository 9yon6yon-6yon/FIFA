package User;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;

public class Client implements Runnable {
    String clientName;
    BufferedReader reader;
    BufferedWriter writer;

    final static ArrayList<Client> clients = new ArrayList<>();

    public Client(Socket sc) {
        try {
            OutputStreamWriter osr = new OutputStreamWriter(sc.getOutputStream());
            writer = new BufferedWriter(osr);
            InputStreamReader isr = new InputStreamReader(sc.getInputStream());
            reader = new BufferedReader(isr);
            clientName = reader.readLine();
            clients.add(this);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
    @Override
    public void run() {
        while (true) {
            try {
                String data = reader.readLine();
                data = clientName + " ->  " + data + "\n";
                synchronized (clients) {
                    for (Client client : clients) {
                        client.writer.write(data);
                        client.writer.flush();
                    }
                }
            } catch (SocketException e) {
                System.out.println(e);
                break;
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
