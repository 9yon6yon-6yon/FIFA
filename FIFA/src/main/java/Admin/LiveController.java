package Admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.*;
import java.net.Socket;

public class LiveController {


    @FXML
    private TextField team1;

    @FXML
    private TextField team1Goal;

    @FXML
    private TextField team2;

    @FXML
    private TextField team2Goal;

    BufferedReader areader;
    BufferedWriter awriter;

    public LiveController(){




    }

    @FXML
    void start(ActionEvent event) {

        try{
            Socket sc=new Socket("localhost",1234);
            OutputStreamWriter o=new OutputStreamWriter(sc.getOutputStream());
            awriter=new BufferedWriter(o);

            InputStreamReader isr=new InputStreamReader(sc.getInputStream());
            areader=new BufferedReader(isr);


        }
        catch (IOException e){

            e.printStackTrace();
        }






    }

    @FXML
    void update(ActionEvent event) {






        String s1=team1.getText();
        String s2=team1Goal.getText();
        String s3=team2.getText();
        String s4=team2Goal.getText();


        try{
            awriter.write("update\n");
            awriter.write(s1+"\n");
            awriter.write(s2+"\n");
            awriter.write(s3+"\n");
            awriter.write(s4+"\n");
            awriter.flush();



        }

        catch (IOException e){

            e.printStackTrace();
        }



    }



    @FXML
    void stop(ActionEvent event) {

    }

}
