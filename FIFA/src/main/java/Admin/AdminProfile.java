package Admin;

import User.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminProfile {

    @FXML
    void Groupmatches(ActionEvent event) {

    }

    @FXML
    void about(ActionEvent event) {

    }

    @FXML
    void adminprofile(ActionEvent event) {

    }

    @FXML
    void closeOnAction(ActionEvent event) {
        System.exit(0);

    }

    @FXML
    void font(ActionEvent event) {

    }

    @FXML
    void groupsOnAction(ActionEvent event) {

    }

    @FXML
    void howto(ActionEvent event) {

    }

    @FXML
    void logoutOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) ((Node) (event.getSource())).getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Main.fxml");
        Parent root = scene.root;
        Main main = (Main) scene.controller;
        mainStage.setScene(new Scene(root));

    }

    @FXML
    void matchScoreOnAction(ActionEvent event) {

    }

    @FXML
    void matchnews(ActionEvent event) {

    }

    @FXML
    void pProfilesOnAction(ActionEvent event) {

    }

    @FXML
    void sports(ActionEvent event) {

    }

    @FXML
    void streamlive(ActionEvent event) {

    }

    @FXML
    void uploadToFeed(ActionEvent event) {

    }

}
