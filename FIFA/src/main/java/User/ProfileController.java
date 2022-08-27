package User;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class ProfileController {

    @FXML
    private Label FullNameLabel;

    @FXML
    private TextField cinfoField;

    @FXML
    private TextField dobfield;

    @FXML
    private Button edit;

    @FXML
    private TextField emailfield;

    @FXML
    private ImageView goBack;

    @FXML
    private ImageView keyimg;

    @FXML
    private TextField nameField;

    @FXML
    private Label passwordLabel;

    @FXML
    private ImageView pimg;

    @FXML
    private ImageView privacyimg;

    @FXML
    private Label privacylabel;

    @FXML
    private Label profileLabel;

    @FXML
    private ImageView profilePic;

    @FXML
    private Button saveChanges1;

    @FXML
    private ImageView setimg;

    @FXML
    private Label settingsLabel;

    @FXML
    private TextField userNameField;

    @FXML
    void initialize() {

        goBack.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                try {
                    Stage mainStage = (Stage) ((Node) (mouseEvent.getSource())).getScene().getWindow(); // then cast to stage to get the window
                    FXMLScene scene = FXMLScene.load("Feed.fxml");
                    Parent root = scene.root;
                   FeedController fc = (FeedController) scene.controller;
                    mainStage.setScene(new Scene(root));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

    }

}
