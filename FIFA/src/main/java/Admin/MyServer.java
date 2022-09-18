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
            while (true) {
                Socket sc = serverSocket.accept();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(sc.getOutputStream());
                BufferedWriter bw = new BufferedWriter(outputStreamWriter);
                InputStreamReader isr = new InputStreamReader(sc.getInputStream());
                BufferedReader br = new BufferedReader(isr);
                String op = br.readLine();
                if(Objects.equals(op, "BMI")){
                    double m = Double.parseDouble(br.readLine());
                    double h = Double.parseDouble(br.readLine());
                    double ans = calculateBMI(m,h);
                    bw.write(ans+"\n");
                    bw.flush();
                }
                Thread t = new Thread( new Client(sc));
                t.start();
            }

        } catch (IOException e) {
            System.out.println(e);
        }

    }
    public static double calculateBMI(double mass, double height) {
        return mass / Math.pow(height / 100.0, 2.0);
    }

}
