package User;

import Admin.About.UsController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class FeedController {

    public AnchorPane FeedRoot;
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
    void closeOnAction(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void feedOnAction(ActionEvent event) throws IOException {

        Main mn=new Main();
        mn.changeScene("Feed.fxml");

        /*Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Feed.fxml");
        Parent root = scene.root;
        FeedController feed = (FeedController) scene.controller;
        mainStage.setScene(new Scene(root));*/


    }

    @FXML
    void logoutOnAction(ActionEvent event) throws IOException {

        Main mn=new Main();
        mn.changeScene("sample.fxml");


        /*Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("sample.fxml");
        Parent root = scene.root;
        Login login = (Login) scene.controller;
        mainStage.setScene(new Scene(root));*/


    }

    @FXML
    void refreshOnAction(ActionEvent event) {

    }

    @FXML
    void LiveOnAction(ActionEvent event) throws IOException {


        Main mn=new Main();
        mn.changeScene("Feed.fxml");

        /*Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Feed.fxml");
        Parent root = scene.root;
        FeedController feed = (FeedController) scene.controller;
        mainStage.setScene(new Scene(root));//need to add new live fxml here*/
    }

    @FXML
    void aboutOnAction(ActionEvent event) throws IOException {

    }

    @FXML
    void buyTicketOnAction(ActionEvent event) throws IOException {

        Main mn=new Main();
        mn.changeScene("Ticket.fxml");




        /*Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Ticket.fxml");
        Parent root = scene.root;
        TicketController tc = (TicketController) scene.controller;
        mainStage.setScene(new Scene(root));*/
    }

    @FXML
    void checkBMIOnAction(ActionEvent event) throws IOException {

        Main mn=new Main();
        mn.changeScene("BMI.fxml");

        /*Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("BMI.fxml");
        Parent root = scene.root;
        BMIController bmi = (BMIController) scene.controller;
        mainStage.setScene(new Scene(root));*/
    }

    @FXML
    void gMatchesOnAction(ActionEvent event) throws IOException {
        Main mn=new Main();
        mn.changeScene("Matches.fxml");



        /*Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Matches.fxml");
        Parent root = scene.root;
        MatchesController mc = (MatchesController) scene.controller;
        mainStage.setScene(new Scene(root));*/
    }

    @FXML
    void groupsOnAction(ActionEvent event) throws IOException {

        Main mn=new Main();
        mn.changeScene("Teams.fxml");

        /*Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Teams.fxml");
        Parent root = scene.root;
        TeamsController tc = (TeamsController) scene.controller;
        mainStage.setScene(new Scene(root));*/
    }

    @FXML
    void howToOnAction(ActionEvent event) throws IOException {

    }

    @FXML
    void mTreeOnAction(ActionEvent event) throws IOException {

        Main mn=new Main();
        mn.changeScene("UserMatchTree.fxml");

        /*Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("UserMatchTree.fxml");
        Parent root = scene.root;
        UserMatchTreeController um = (UserMatchTreeController) scene.controller;
        mainStage.setScene(new Scene(root));*/
    }

    @FXML
    void matchScoreOnAction(ActionEvent event) throws IOException {

        Main mn=new Main();
        mn.changeScene("Feed.fxml");



        /*Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Feed.fxml");
        Parent root = scene.root;
        FeedController feed = (FeedController) scene.controller;
        mainStage.setScene(new Scene(root));*/
    }

    @FXML
    void pProfilesOnAction(ActionEvent event) throws IOException {

        Main mn=new Main();
        mn.changeScene("player.fxml");





        /*Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Player.fxml");
        Parent root = scene.root;
        PlayerController pc = (PlayerController) scene.controller;
        mainStage.setScene(new Scene(root));*/
    }

    @FXML
    void profileOnAction(ActionEvent event) throws IOException {

        Main mn=new Main();
        mn.changeScene("profile-view.fxml");




        /*Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("profile-view.fxml");
        Parent root = scene.root;
        ProfileController pc = (ProfileController) scene.controller;
        mainStage.setScene(new Scene(root));*/

    }
}
