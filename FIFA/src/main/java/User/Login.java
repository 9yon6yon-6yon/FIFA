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

        Stage mainStage = (Stage) ((Node) (event.getSource())).getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Feed.fxml");
        Parent root = scene.root;
        FeedController main = (FeedController) scene.controller;
        String user1 = username.getText();
        String user2 = password.getText();

        FileReader fr = new FileReader("Files/login.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            String[] part = line.split(" ");
            if (user1.equals(part[0]) && user2.equals(part[1])) {
                mainStage.setScene(new Scene(root));
                break;
            }
        }


        if (username.getText().isEmpty() && password.getText().isEmpty()) {

            wronglogin.setText("Please enter your data.");


        } else wronglogin.setText("Wrong username or password!");

        fr.close();


    }

    @FXML
    void userSignup(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) ((Node) (event.getSource())).getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("signUp.fxml");
        Parent root = scene.root;
        signUp main = (signUp) scene.controller;
        mainStage.setScene(new Scene(root));


    }

    @FXML
    void forgetmethod(MouseEvent event) throws IOException {

        Stage mainStage = (Stage) ((Node) (event.getSource())).getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Forgotten.fxml");
        Parent root = scene.root;
        ForgottenController main = (ForgottenController) scene.controller;
        mainStage.setScene(new Scene(root));//need to add new live fxml here

    }


}
