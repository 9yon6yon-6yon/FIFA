package User;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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

public class ForgottenController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button button;

    @FXML
    private PasswordField confirmpassword;

    @FXML
    private TextField createpassword;

    @FXML
    private Label hidelabel;

    @FXML
    void backmethod(MouseEvent event) throws IOException {
        Stage mainStage = (Stage) ((Node) (event.getSource())).getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("sample.fxml");
        Parent root = scene.root;
        Login main = (Login) scene.controller;
        mainStage.setScene(new Scene(root));//need to add new live fxml here

    }

    @FXML
    void change(ActionEvent event) {

    }

    @FXML
    void modifypass(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }

}
