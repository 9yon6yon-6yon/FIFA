package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;



public class signUp {



    @FXML
    private Label signbackLabel;

    @FXML
    private Button signbutton;



    @FXML
    void signupComplete(ActionEvent event) throws IOException {

        Main m = new Main();
        m.changeScene("sample.fxml");



    }

}
