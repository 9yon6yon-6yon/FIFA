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

import java.io.FileWriter;
import java.io.IOException;

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
    void backlogin(MouseEvent event) throws IOException {
        Stage mainStage = (Stage) ((Node) (event.getSource())).getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("sample.fxml");
        Parent root = scene.root;
        Login main = (Login) scene.controller;
        mainStage.setScene(new Scene(root));//need to add new live fxml here




    }

    @FXML
    void signupComplete(ActionEvent event) throws IOException {
        FileWriter fw= new FileWriter("login.txt",true);
        fw.write(smail.getText()+"\t"+spassword.getText()+"\n");
        fw.close();



        FileWriter w= new FileWriter("Files/otherlogin.txt",true);
        w.write(sname.getText()+"\t"+sdof.getText()+"\t"+scountry.getText()+"\n");
        w.close();






    }

}

