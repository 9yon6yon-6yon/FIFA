package Admin;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {

    public static void main(String[] args) {
        try {
            ServerSocket sc = new ServerSocket(1234);
            Socket sc1 = sc.accept();
            OutputStreamWriter o = new OutputStreamWriter(sc1.getOutputStream());
            BufferedWriter awriter = new BufferedWriter(o);
            InputStreamReader isr = new InputStreamReader(sc1.getInputStream());
            BufferedReader areader = new BufferedReader(isr);
            while (true) {
                String st = areader.readLine();
                if (st.equals("update")) {
                    String s1 = areader.readLine();
                    String s2 = areader.readLine();
                    String s3 = areader.readLine();
                    String s4 = areader.readLine();

                    System.out.printf(s1 + "\n");
                    System.out.printf(s2 + "\n");
                    System.out.printf(s3 + "\n");
                    System.out.printf(s4 + "\n");

                    awriter.write(s1 + "\n");
                    awriter.write(s2 + "\n");
                    awriter.write(s3 + "\n");
                    awriter.write(s4 + "\n");
                    awriter.flush();

                }
                if (st.equals("post")) {
                    areader.readLine();
                    System.out.printf(areader.readLine() + "\n");
                    awriter.write("\n");
                    awriter.flush();
                }
            }
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
