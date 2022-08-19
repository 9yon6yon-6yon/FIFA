package LoginUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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

     checkLoging();

    }


    private void checkLoging() throws IOException{

        Main m = new Main();
        if(username.getText().toString().equals("javacoding")&& password.getText().toString().equals("123")){
            wronglogin.setText("Success!");

            m.changeScene("AfterLogin.fxml");
        }

        else if(username.getText().isEmpty()&& password.getText().isEmpty()){

            wronglogin.setText("Please enter your data.");



        }
        else wronglogin.setText("Wrong username or password!");



    }



    @FXML
    void userSignup(ActionEvent event) throws IOException{
      Main m = new Main();
       m.changeScene("signUp.fxml");



    }

}
