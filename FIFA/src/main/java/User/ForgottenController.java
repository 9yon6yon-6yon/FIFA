package User;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class ForgottenController {

    @FXML
    private Button button;

    @FXML
    private PasswordField confirmpassword;

    @FXML
    private TextField createpassword;

    @FXML
    private Label hidelabel;

    @FXML
    void change(ActionEvent event) {

    }

    @FXML
    void modifypass(ActionEvent event) {

    }

    @FXML
    void backmethod(MouseEvent event) throws IOException {

        Main m = new Main();
        m.changeScene("sample.fxml");


    }





}
