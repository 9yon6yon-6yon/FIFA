package Admin;

import java.io.IOException;

import User.Login;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AdminProfileController {

    public AnchorPane adminProfile;
    @FXML
    private MenuItem aboutUs;

    @FXML
    private MenuItem buyTicket1;

    @FXML
    private MenuItem buyjercy;

    @FXML
    private MenuItem checkBMI;

    @FXML
    private MenuItem close;

    @FXML
    private MenuItem feed;

    @FXML
    private MenuItem groupMatches;

    @FXML
    private MenuItem groups;


    @FXML
    private MenuItem liveMatch;

    @FXML
    private MenuItem logOut;

    @FXML
    private MenuItem matchScores;

    @FXML
    private MenuItem matchtree;

    @FXML
    private MenuItem pProfiles;

    @FXML
    private MenuItem profile;

    @FXML
    private MenuItem rank;

    @FXML
    private MenuItem refresh;

    @FXML
    void LiveOnAction(ActionEvent event) throws IOException {
//        Stage stage = (Stage) adminProfile.getScene().getWindow();
//        FXMLScene scene = FXMLScene.load("");
//        Parent root = scene.root;
    }

    @FXML
    void aboutOnAction(ActionEvent event) {
        Us us = new Us();
        try {
            us.start(new Stage());
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @FXML
    void buyJercyOnAction(ActionEvent event) {

    }

    @FXML
    void buyTicketOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) adminProfile.getScene().getWindow();
        FXMLScene scene = FXMLScene.load("AddTickets.fxml");
        Parent root = scene.root;
        AddTicketsController adc = (AddTicketsController) scene.controller;
        stage.setScene(new Scene(root));

    }

    @FXML
    void closeOnAction(ActionEvent event) {
        System.exit(0);

    }

    @FXML
    void feedOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) adminProfile.getScene().getWindow();
        FXMLScene scene = FXMLScene.load("adminProfile.fxml");
        Parent root = scene.root;
    }

    @FXML
    void gMatchesOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) adminProfile.getScene().getWindow();
        FXMLScene scene = FXMLScene.load("MatchTree.fxml");
        Parent root = scene.root;
    }

    @FXML
    void groupsOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) adminProfile.getScene().getWindow();
        FXMLScene scene = FXMLScene.load("MatchTree.fxml");
        Parent root = scene.root;
    }


    @FXML
    void logoutOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) adminProfile.getScene().getWindow();
        FXMLScene scene = FXMLScene.load("/User/Main.fxml");
        Parent root = scene.root;
        Login  l = (Login) scene.controller;
        stage.setScene(new Scene(root));
    }

    @FXML
    void mTreeOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) adminProfile.getScene().getWindow();
        FXMLScene scene = FXMLScene.load("MatchTree.fxml");
        Parent root = scene.root;
        MatchTreeController mtc = (MatchTreeController) scene.controller;
        stage.setScene(new Scene(root));
    }

    @FXML
    void matchScoreOnAction(ActionEvent event) throws IOException {
//        Stage stage = (Stage) adminProfile.getScene().getWindow();
//        FXMLScene scene = FXMLScene.load("");
//        Parent root = scene.root;
    }

    @FXML
    void pProfilesOnAction(ActionEvent event) throws IOException {
//        Stage stage = (Stage) adminProfile.getScene().getWindow();
//        FXMLScene scene = FXMLScene.load("");
//        Parent root = scene.root;
    }

    @FXML
    void profileOnAction(ActionEvent event) throws IOException {
        try {
            logs logs = new logs();
            logs.start(new Stage());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @FXML
    void rankOnAction(ActionEvent event) throws IOException {
//        Stage stage = (Stage) adminProfile.getScene().getWindow();
//        FXMLScene scene = FXMLScene.load("");
//        Parent root = scene.root;
    }

    @FXML
    void refreshOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) adminProfile.getScene().getWindow();
        FXMLScene scene = FXMLScene.load("adminProfile.fxml");
        Parent root = scene.root;
        AdminProfileController adc = (AdminProfileController) scene.controller;
        stage.setScene(new Scene(root));
    }


}
