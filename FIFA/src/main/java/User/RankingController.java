package User;

import Admin.Us;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RankingController {
    public AnchorPane rankc;
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
    private MenuItem howTo;

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
    private Button point;

    @FXML
    private ListView<String> pointShow;

    @FXML
    private Button position;

    @FXML
    private MenuItem profile;

    @FXML
    private MenuItem rank;

    @FXML
    private ListView<String> rankShow;

    @FXML
    private MenuItem refresh;

    @FXML
    private Button teamName;

    @FXML
    private ListView<String> teamShow;

    @FXML
    void initialize() {
        readSquad();

    }

    private void readSquad() {
        rankShow.getItems().clear();
        teamShow.getItems().clear();
        pointShow.getItems().clear();
        String fileName = "Files/ranking.txt";
        try {
            BufferedReader bf = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = bf.readLine()) != null) {
                String[] parts = line.split("_");
                rankShow.getItems().addAll(parts[0]);
                teamShow.getItems().addAll(parts[1]);
                pointShow.getItems().addAll(parts[2]);

            }
            bf.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void closeOnAction(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void feedOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) rankc.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Feed.fxml");
        Parent root = scene.root;
        FeedController feed = (FeedController) scene.controller;
        mainStage.setScene(new Scene(root));


    }

    @FXML
    void logoutOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) rankc.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Main.fxml");
        Parent root = scene.root;
        Login login = (Login) scene.controller;
        mainStage.setScene(new Scene(root));


    }

    @FXML
    void refreshOnAction(ActionEvent event) {

    }

    @FXML
    void LiveOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) rankc.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Feed.fxml");
        Parent root = scene.root;
        FeedController feed = (FeedController) scene.controller;
        mainStage.setScene(new Scene(root));//need to add new live fxml here
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
    void buyTicketOnAction(ActionEvent event) throws IOException {

        Stage mainStage = (Stage) rankc.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Ticket.fxml");
        Parent root = scene.root;
        TicketController tc = (TicketController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void checkBMIOnAction(ActionEvent event) throws IOException {

        Stage mainStage = (Stage) rankc.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("BMI.fxml");
        Parent root = scene.root;
        BMIController bmi = (BMIController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void gMatchesOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) rankc.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Matches.fxml");
        Parent root = scene.root;
        MatchesController mc = (MatchesController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void groupsOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) rankc.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Teams.fxml");
        Parent root = scene.root;
        TeamsController tc = (TeamsController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void howToOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) rankc.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("HowTo.fxml");
        Parent root = scene.root;
        HowToController tc = (HowToController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void mTreeOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) rankc.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("UserMatchTree.fxml");
        Parent root = scene.root;
        UserMatchTreeController um = (UserMatchTreeController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void matchScoreOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) rankc.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Feed.fxml");
        Parent root = scene.root;
        FeedController feed = (FeedController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void pProfilesOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) rankc.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Player.fxml");
        Parent root = scene.root;
        PlayerController pc = (PlayerController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void profileOnAction(ActionEvent event) throws IOException {

        Stage mainStage = (Stage) rankc.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("profile-view.fxml");
        Parent root = scene.root;
        ProfileController pc = (ProfileController) scene.controller;
        mainStage.setScene(new Scene(root));

    }

    @FXML
    void rankOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) rankc.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Ranking.fxml");
        Parent root = scene.root;
        RankingController rc = (RankingController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void buyJercyOnAction(ActionEvent event) throws IOException {
//        Stage mainStage = (Stage) rankc.getScene().getWindow(); // then cast to stage to get the window
//        FXMLScene scene = FXMLScene.load("market.fxml");
//        Parent root = scene.root;
//        MarketController mc = (MarketController) scene.controller;
//        mainStage.setScene(new Scene(root));
    }

}
