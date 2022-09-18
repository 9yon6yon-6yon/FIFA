package User;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;

public class ViewLiveScoreController {


    @FXML
    private Label team1;

    @FXML
    private Label team1goal;

    @FXML
    private Label team2;

    @FXML
    private Label team2goal;


    BufferedReader areader;
    BufferedWriter awriter;

    public ViewLiveScoreController() {

        try{
            Socket sc=new Socket("localhost",1234);
            OutputStreamWriter o=new OutputStreamWriter(sc.getOutputStream());
            awriter=new BufferedWriter(o);

            InputStreamReader isr=new InputStreamReader(sc.getInputStream());
            areader=new BufferedReader(isr);

            Thread sl= new Thread(){

                @Override
                public void run() {
                    while(true){

                       try{

                           String s1 = areader.readLine();
                           String s2 = areader.readLine();
                           String s3 = areader.readLine();
                           String s4 = areader.readLine();

                           System.out.printf(s1+"\n");
                           System.out.printf(s2+"\n");
                           System.out.printf(s3+"\n");
                           System.out.printf(s4+"\n");


                           team1.setText(s1);
                           team1goal.setText(s2);
                           team2.setText(s3);
                           team2goal.setText(s4);

                       }

                       catch (SocketException e){

                           break;
                       }

                       catch (IOException e){

                           e.printStackTrace();
                       }

                    }
                }
            };

            sl.start();





        }
        catch (IOException e){

            e.printStackTrace();
        }











    }
}
