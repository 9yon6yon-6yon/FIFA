package User;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Login {

    @FXML
    private Button button;

    @FXML
    private Button button2;

    @FXML
    private Label forgottenLabel;

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

    @FXML
    private Label wronglogin;

    @FXML
    void userLogin(ActionEvent event) throws IOException {
        checkLoging(event);

    }


    private void checkLoging(ActionEvent event) throws IOException {


        Main mn=new Main();

        boolean matched=false;

        String user1 = username.getText();
        String user2 = password.getText();
        String line;


        FileReader fr = new FileReader("Files/login.txt");
        BufferedReader br = new BufferedReader(fr);

        while ((line = br.readLine()) != null) {
            if (line.equals(user1 + "\t" + user2)) {
                matched=true;


                mn.changeScene("Feed.fxml");

            }
        }
        if (username.getText().isEmpty() && password.getText().isEmpty()) {

            wronglogin.setText("Please enter your data.");


        } else wronglogin.setText("Wrong username or password!");


        fr.close();


    }

    @FXML
    void adminloginbutton(ActionEvent event)throws IOException {




        if(username.getText().toString().equals("admin@gmail.com") && password.getText().toString().equals("88991010") ){
            Main mn=new Main();
            mn.changeScene("adminProfile.fxml");


        }
        else if (username.getText().isEmpty() && password.getText().isEmpty()) {

            wronglogin.setText("Please enter your data.");



        }

        else wronglogin.setText("Wrong username or password!");



    }

    @FXML
    void userSignup(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("signUp.fxml");


    }

    @FXML
    void forgetmethod(MouseEvent event) throws IOException {

        Main m = new Main();
        m.changeScene("Forgotten.fxml");

    }


}
