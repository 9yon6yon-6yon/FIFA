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

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class signUp {

    @FXML
    private TextField scountry;


    @FXML
    private TextField sdof;

    @FXML
    private Label signbackLabel;

    @FXML
    private Button signbutton;

    @FXML
    private TextField smail;

    @FXML
    private TextField sname;

    @FXML
    private PasswordField spassword;
    @FXML
    private PasswordField sconfirmpass;

    @FXML
    void backlogin(MouseEvent event) throws IOException {
        Stage mainStage = (Stage) ((Node) (event.getSource())).getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Main.fxml");
        Parent root = scene.root;
        Login main = (Login) scene.controller;
        mainStage.setScene(new Scene(root));//need to add new live fxml here


    }

    @FXML
    void signupComplete(ActionEvent event) {
        try {

            BufferedWriter fw = new BufferedWriter(new FileWriter("Files/login.txt", true));
            fw.append(smail.getText()).append("___").append(spassword.getText()).append("\n");
            fw.flush();
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            BufferedWriter w = new BufferedWriter(new FileWriter("Files/Users.txt", true));
            w.write(sname.getText() + "___" + sdof.getText() + "___" + scountry.getText() + "___" + smail.getText() + "___" + spassword.getText() + "___" + formatter.format(date) + "\n");
            w.flush();

        } catch (IOException e) {
            System.out.println(e);

        }
        try {
            Stage mainStage = (Stage) ((Node) (event.getSource())).getScene().getWindow(); // then cast to stage to get the window
            FXMLScene scene = FXMLScene.load("Main.fxml");
            Parent root = scene.root;
            Login main = (Login) scene.controller;
            mainStage.setScene(new Scene(root));
        } catch (IOException e) {
            System.out.println(e);

        }
    }

}

