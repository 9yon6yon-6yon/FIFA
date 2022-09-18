package Admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.io.*;
import java.net.Socket;

public class PostController {

    @FXML
    private TextArea textfield;

    BufferedReader areader;
    BufferedWriter awriter;


    public PostController() {

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
    void post(ActionEvent event) {

        String s1=textfield.getText();
        try{
            awriter.write("post\n");
            awriter.write(s1+"\n");

            awriter.flush();



        }

        catch (IOException e){

            e.printStackTrace();
        }






    }

}

