package User;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class ProfileController {
    @FXML
    private Label welcomeText;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button edit;

    @FXML
    void edit(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert edit != null : "fx:id=\"edit\" was not injected: check your FXML file 'profile-view.fxml'.";

    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

}
