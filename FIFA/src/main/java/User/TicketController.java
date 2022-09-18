package User;

import Admin.LiveController;
import Admin.Us;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.*;
import java.util.Objects;

public class TicketController {
    public AnchorPane TicketRoot;
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
    private Label buticketsLabel;
    @FXML
    private ImageView buyTo;

    @FXML
    private TextField codeText;

    @FXML
    private ImageView shoppingCart;

    @FXML
    private ListView<String> showavbMatches;

    @FXML
    private ListView<String> showavbTickets;

    @FXML
    private DatePicker ticketsDate;
    boolean buy = true;
    boolean found = false;

    String match_name;
    String path = "Files/availableMatch.txt";

    @FXML
    void initialize() {
        ticketsDate.getEditor().appendText("MM/DD/YYYY");
        ticketsDate.setOnAction(this::readFile);
        buyTo.setOnMouseClicked(mouseEvent -> {
            if (buy) {
                if (Objects.equals(codeText.getText(), "")) {
                    Alert alert = new Alert(Alert.AlertType.NONE);
                    alert.setAlertType(Alert.AlertType.WARNING);
                    alert.setContentText("Ticket not found");
                    alert.show();
                } else {
                    readToken();
                    if (found) {
                        try {
                            found = false;
                            buyTo.setImage(new Image(new FileInputStream("Images/icons8-buy-done-100.png")));
                            Stage mainStage = (Stage) TicketRoot.getScene().getWindow();
                            FXMLScene scene = FXMLScene.load("TicketSubmitForm.fxml");
                            Parent root = scene.root;
                            TicketSubmitFormController tc = (TicketSubmitFormController) scene.controller;
                            tc.setM("T.I. of " + match_name);
                            tc.setTk(codeText.getText());
                            mainStage.setScene(new Scene(root));
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    } else {
                        Alert alert = new Alert(Alert.AlertType.NONE);
                        alert.setAlertType(Alert.AlertType.WARNING);
                        alert.setContentText("Ticket not found");
                        alert.show();

                    }
                    buy = false;
                }

            } else {
                try {
                    buyTo.setImage(new Image(new FileInputStream("Images/icons8-buy-100.png")));
                } catch (FileNotFoundException e) {
                    System.out.println(e);
                }
                buy = true;
            }
        });

    }

    private void readToken() {
        try {
            BufferedReader bf = new BufferedReader(new FileReader(path));
            String line;
            while ((line = bf.readLine()) != null) {
                String[] parts = line.split("___");
                if (codeText.getText().equals(parts[2])) {
                    match_name = parts[1];
                    found = true;
                }
            }
            bf.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    private void readFile(ActionEvent actionEvent) {
        try {
            showavbMatches.getItems().clear();
            showavbTickets.getItems().clear();
            BufferedReader bf = new BufferedReader(new FileReader(path));
            String line;
            while ((line = bf.readLine()) != null) {
                String[] parts = line.split("___");
                if (parts[0].equals(String.valueOf(ticketsDate.getValue()))) {
                    showavbMatches.getItems().add("\t\t" + parts[1] + "\t\t" + parts[2]);
                    showavbTickets.getItems().add(String.valueOf(parts[3]));
                }
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
        Stage mainStage = (Stage) TicketRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Feed.fxml");
        Parent root = scene.root;
        FeedController feed = (FeedController) scene.controller;
        mainStage.setScene(new Scene(root));


    }

    @FXML
    void logoutOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) TicketRoot.getScene().getWindow(); // then cast to stage to get the window
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
        Stage mainStage = (Stage) TicketRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("liveScore.fxml");
        Parent root = scene.root;
        ViewLiveScoreController feed = (ViewLiveScoreController) scene.controller;
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
        Stage mainStage = (Stage) TicketRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Ticket.fxml");
        Parent root = scene.root;
        TicketController tc = (TicketController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void checkBMIOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) TicketRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("BMI.fxml");
        Parent root = scene.root;
        BMIController bmi = (BMIController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void gMatchesOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) TicketRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Matches.fxml");
        Parent root = scene.root;
        MatchesController mc = (MatchesController) scene.controller;
        mainStage.setScene(new Scene(root));

    }

    @FXML
    void groupsOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) TicketRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Teams.fxml");
        Parent root = scene.root;
        TeamsController tc = (TeamsController) scene.controller;
        mainStage.setScene(new Scene(root));

    }

    @FXML
    void howToOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) TicketRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("HowTo.fxml");
        Parent root = scene.root;
        HowToController tc = (HowToController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void mTreeOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) TicketRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("UserMatchTree.fxml");
        Parent root = scene.root;
        UserMatchTreeController um = (UserMatchTreeController) scene.controller;
        mainStage.setScene(new Scene(root));

    }

    @FXML
    void matchScoreOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) TicketRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Feed.fxml");
        Parent root = scene.root;
        FeedController feed = (FeedController) scene.controller;
        mainStage.setScene(new Scene(root));

    }

    @FXML
    void pProfilesOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) TicketRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Player.fxml");
        Parent root = scene.root;
        PlayerController pc = (PlayerController) scene.controller;
        mainStage.setScene(new Scene(root));

    }

    @FXML
    void profileOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) TicketRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("profile-view.fxml");
        Parent root = scene.root;
        ProfileController pc = (ProfileController) scene.controller;
        mainStage.setScene(new Scene(root));


    }

}
