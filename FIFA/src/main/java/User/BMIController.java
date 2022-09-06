package User;


import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;

import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class BMIController {
    public AnchorPane BMIroot;
    @FXML
    private MenuItem aboutUs1;

    @FXML
    private Label ageVal;

    @FXML
    private MenuItem buyTicket1;

    @FXML
    private Button calculateButton;

    @FXML
    private MenuItem checkBMI1;

    @FXML
    private MenuItem close1;

    @FXML
    private MenuItem feed1;

    @FXML
    private ImageView femaleIcon;

    @FXML
    private MenuItem groupMatches1;

    @FXML
    private MenuItem groups1;

    @FXML
    private Slider heightSet;

    @FXML
    private Label heightinCm;

    @FXML
    private MenuItem howTo1;

    @FXML
    private Label labelFemale;

    @FXML
    private Label labelMale;

    @FXML
    private MenuItem liveMatch1;

    @FXML
    private MenuItem logOut1;

    @FXML
    private ImageView maleIcon;

    @FXML
    private MenuItem matchScores1;

    @FXML
    private MenuItem matchtree1;

    @FXML
    private ImageView minageKey;

    @FXML
    private ImageView minweightKey;

    @FXML
    private MenuItem pProfiles1;

    @FXML
    private ImageView plusageKey;

    @FXML
    private ImageView plusweightKey;

    @FXML
    private MenuItem profile1;

    @FXML
    private MenuItem refresh1;

    @FXML
    private Label weightVal;

    private int age = 20;
    private double weight = 55.00;
    private String gender;

    protected double calculateBMI(double mass, double height) {
        return mass / Math.pow(height / 100.0, 2.0);
    }


    @FXML
    void onCalculate(ActionEvent event) {
        double height = Double.parseDouble(heightinCm.getText());
        double mass = Double.parseDouble(weightVal.getText());
        checkBMIRules(calculateBMI(mass, height));
        labelFemale.setDisable(false);
        femaleIcon.setDisable(false);
        labelMale.setDisable(false);
        maleIcon.setDisable(false);


    }

    @FXML
    void initialize() {
        heightinCm.setText("150");
        weightVal.setText(String.format("%.2f", weight));
        ageVal.setText(String.valueOf(age));
        heightSet.valueProperty().addListener((observableValue, number, t1) -> heightinCm.setText(String.format("%.2f", heightSet.getValue())));
        calculateButton.setOnAction(this::onCalculate);

        maleIcon.setOnMousePressed(mouseEvent -> {
            gender = "Male";
            labelFemale.setDisable(true);
            femaleIcon.setDisable(true);
        });
        femaleIcon.setOnMousePressed(mouseEvent -> {
            gender = "Female";
            labelMale.setDisable(true);
            maleIcon.setDisable(true);

        });
        minageKey.setOnMouseClicked(mouseEvent -> {
            if (age < 0) ageVal.setText("0");
            age--;
            ageVal.setText(String.valueOf(age));


        });
        plusageKey.setOnMouseClicked(mouseEvent -> {
            age++;
            ageVal.setText(String.valueOf(age));

        });
        minweightKey.setOnMouseClicked(mouseEvent -> {
            if (weight < 0) weightVal.setText("0.0");
            weight -= 1;
            weightVal.setText(String.format("%.2f", weight));


        });
        plusweightKey.setOnMouseClicked(mouseEvent -> {
            weight += 1;
            weightVal.setText(String.format("%.2f", weight));
        });


    }

    private void checkBMIRules(double bmi) {
        if (bmi < 18.5) {
            System.out.println("Under Weight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Healthy Weight");
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            System.out.println("Over Weight");
        } else
            System.out.println("Obesity");

    }

    @FXML
    void closeOnAction(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void feedOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) BMIroot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Feed.fxml");
        Parent root = scene.root;
        FeedController feed = (FeedController) scene.controller;
        mainStage.setScene(new Scene(root));


    }

    @FXML
    void logoutOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage)  BMIroot.getScene().getWindow(); // then cast to stage to get the window
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
        Stage mainStage = (Stage)  BMIroot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Feed.fxml");
        Parent root = scene.root;
        FeedController feed = (FeedController) scene.controller;
        mainStage.setScene(new Scene(root));//need to add new live fxml here
    }

    @FXML
    void aboutOnAction(ActionEvent event) throws IOException {

    }

    @FXML
    void buyTicketOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage)  BMIroot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Ticket.fxml");
        Parent root = scene.root;
        TicketController tc = (TicketController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void checkBMIOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage)  BMIroot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("BMI.fxml");
        Parent root = scene.root;
        BMIController bmi = (BMIController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void gMatchesOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage)  BMIroot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Matches.fxml");
        Parent root = scene.root;
        MatchesController mc = (MatchesController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void groupsOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage)  BMIroot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Teams.fxml");
        Parent root = scene.root;
        TeamsController tc = (TeamsController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void howToOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage)  BMIroot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("HowTo.fxml");
        Parent root = scene.root;
        HowToController tc = (HowToController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void mTreeOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage)  BMIroot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("UserMatchTree.fxml");
        Parent root = scene.root;
        UserMatchTreeController um = (UserMatchTreeController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void matchScoreOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage)  BMIroot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Feed.fxml");
        Parent root = scene.root;
        FeedController feed = (FeedController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void pProfilesOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage)  BMIroot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Player.fxml");
        Parent root = scene.root;
        PlayerController pc = (PlayerController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void profileOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage)  BMIroot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("profile-view.fxml");
        Parent root = scene.root;
        ProfileController pc = (ProfileController) scene.controller;
        mainStage.setScene(new Scene(root));

    }


}
