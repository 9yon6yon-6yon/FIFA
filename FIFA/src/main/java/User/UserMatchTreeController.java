package User;

import Admin.About.UsController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class UserMatchTreeController {
    public AnchorPane userTree;
    @FXML
    private MenuItem aboutUs;

    @FXML
    private MenuItem buyTicket;

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
    private MenuItem logOut;

    @FXML
    private MenuItem liveMatch;

    @FXML
    private MenuItem matchScores;

    @FXML
    private MenuItem matchtree;

    @FXML
    private MenuItem pProfiles;

    @FXML
    private MenuItem profile;

    @FXML
    private MenuItem refresh;


    @FXML
    private TextField finalMatch1;

    @FXML
    private TextField finalMatch2;


    @FXML
    private TextField quater1;

    @FXML
    private TextField quater2;

    @FXML
    private TextField quater3;

    @FXML
    private TextField quater4;

    @FXML
    private TextField quater5;

    @FXML
    private TextField quater6;

    @FXML
    private TextField quater7;

    @FXML
    private TextField quater8;


    @FXML
    private TextField round1;

    @FXML
    private TextField round10;

    @FXML
    private TextField round11;

    @FXML
    private TextField round12;

    @FXML
    private TextField round13;

    @FXML
    private TextField round14;

    @FXML
    private TextField round15;

    @FXML
    private TextField round16;

    @FXML
    private TextField round2;

    @FXML
    private TextField round3;

    @FXML
    private TextField round4;

    @FXML
    private TextField round5;

    @FXML
    private TextField round6;

    @FXML
    private TextField round7;

    @FXML
    private TextField round8;

    @FXML
    private TextField round9;

    @FXML
    private TextField semi1;

    @FXML
    private TextField semi2;

    @FXML
    private TextField semi3;

    @FXML
    private TextField semi4;
    @FXML
    private Label winnerText;

    @FXML
    void initialize() {
        try {
            BufferedReader bwRoundup = new BufferedReader(new FileReader("Files/RoundUp.txt"));
            BufferedReader bwqua = new BufferedReader(new FileReader("Files/quater.txt"));
            BufferedReader bwsemi = new BufferedReader(new FileReader("Files/semi.txt"));
            BufferedReader bwfinal = new BufferedReader(new FileReader("Files/finalMatch.txt"));
            BufferedReader bwinner = new BufferedReader(new FileReader("Files/won.txt"));

            ArrayList<String> rd = new ArrayList<>();
            String rdline;
            while ((rdline = bwRoundup.readLine()) != null) {
                rd.add(rdline);
            }

            ArrayList<String> qu = new ArrayList<>();
            String qLine;
            while ((qLine = bwqua.readLine()) != null) {
                qu.add(qLine);
            }
            ArrayList<String> sem = new ArrayList<>();
            String semLine;
            while ((semLine = bwsemi.readLine()) != null) {
                sem.add(semLine);
            }
            ArrayList<String> fin = new ArrayList<>();
            String finLine;
            while ((finLine = bwfinal.readLine()) != null) {
                fin.add(finLine);
            }
            round1.setText(rd.get(0));
            round2.setText(rd.get(1));
            round3.setText(rd.get(2));
            round4.setText(rd.get(3));
            round5.setText(rd.get(4));
            round6.setText(rd.get(5));
            round7.setText(rd.get(6));
            round8.setText(rd.get(7));
            round9.setText(rd.get(8));
            round10.setText(rd.get(9));
            round11.setText(rd.get(10));
            round12.setText(rd.get(11));
            round13.setText(rd.get(12));
            round14.setText(rd.get(13));
            round15.setText(rd.get(14));
            round16.setText(rd.get(15));


            quater1.setText(qu.get(0));
            quater2.setText(qu.get(1));
            quater3.setText(qu.get(2));
            quater4.setText(qu.get(3));
            quater5.setText(qu.get(4));
            quater6.setText(qu.get(5));
            quater7.setText(qu.get(6));
            quater8.setText(qu.get(7));

            semi1.setText(sem.get(0));
            semi2.setText(sem.get(1));
            semi3.setText(sem.get(2));
            semi4.setText(sem.get(3));

            finalMatch1.setText(fin.get(0));
            finalMatch2.setText(fin.get(1));


            winnerText.setText(bwinner.readLine());

            bwRoundup.close();
            bwqua.close();
            bwsemi.close();
            bwfinal.close();
            bwinner.close();

        } catch (IOException e) {
            System.out.println(e);
            ;
        }

    }
    @FXML
    void closeOnAction(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void feedOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) userTree.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Feed.fxml");
        Parent root = scene.root;
        FeedController feed = (FeedController) scene.controller;
        mainStage.setScene(new Scene(root));


    }

    @FXML
    void logoutOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) userTree.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("sample.fxml");
        Parent root = scene.root;
        Login login = (Login) scene.controller;
        mainStage.setScene(new Scene(root));


    }

    @FXML
    void refreshOnAction(ActionEvent event) {

    }

    @FXML
    void LiveOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) userTree.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Feed.fxml");
        Parent root = scene.root;
        FeedController feed = (FeedController) scene.controller;
        mainStage.setScene(new Scene(root));//need to add new live fxml here
    }

    @FXML
    void aboutOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) userTree.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Admin/About/Us.fxml");
        Parent root = scene.root;
        UsController us = (UsController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void buyTicketOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) userTree.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Ticket.fxml");
        Parent root = scene.root;
        TicketController tc = (TicketController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void checkBMIOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) userTree.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("BMI.fxml");
        Parent root = scene.root;
        BMIController bmi = (BMIController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void gMatchesOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) userTree.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Matches.fxml");
        Parent root = scene.root;
        MatchesController mc = (MatchesController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void groupsOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) userTree.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Teams.fxml");
        Parent root = scene.root;
        TeamsController tc = (TeamsController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void howToOnAction(ActionEvent event) throws IOException {

    }

    @FXML
    void mTreeOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) userTree.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("UserMatchTree.fxml");
        Parent root = scene.root;
        UserMatchTreeController um = (UserMatchTreeController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void matchScoreOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) userTree.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Feed.fxml");
        Parent root = scene.root;
        FeedController feed = (FeedController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void pProfilesOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) userTree.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Player.fxml");
        Parent root = scene.root;
        PlayerController pc = (PlayerController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void profileOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) userTree.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("profile-view.fxml");
        Parent root = scene.root;
        ProfileController pc = (ProfileController) scene.controller;
        mainStage.setScene(new Scene(root));

    }
}
