package User;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

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

        checkLoging();

    }


    private void checkLoging() throws IOException {

        Main mn = new Main();
        boolean matched = false;

        String user1 = username.getText();
        String user2 = password.getText();

        FileReader fr = new FileReader("Files/login.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            if (line.equals(user1 + "\t" + user2)) {
                matched = true;

                mn.changeScene("afterLoging.fxml");

            }
        }


        if (username.getText().isEmpty() && password.getText().isEmpty()) {

            wronglogin.setText("Please enter your data.");


        } else wronglogin.setText("Wrong username or password!");

        fr.close();


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
