package User;

import Admin.Live;
import Admin.LiveController;
import Admin.Us;
import MatchDetails.Groups;
import MatchDetails.flags;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;

public class FeedController {

    public AnchorPane FeedRoot;
    @FXML
    private TextArea news;
    @FXML
    private Button button;
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
    private TextField inputField;

    @FXML
    private TextArea showArea;


    @FXML
    private Label postlabel;

    BufferedReader areader;
    BufferedWriter awriter;

    public FeedController() {
        try {
            Socket sc = new Socket("localhost", 1234);
            OutputStreamWriter o = new OutputStreamWriter(sc.getOutputStream());
            awriter = new BufferedWriter(o);

            InputStreamReader isr = new InputStreamReader(sc.getInputStream());
            areader = new BufferedReader(isr);
            Thread sl = new Thread() {

                @Override
                public void run() {
                    while (true) {
                        try {
                            String s1 = areader.readLine();
                            news.appendText(s1);
                        } catch (SocketException e) {
                            System.out.println(e);
                            break;
                        } catch (IOException e) {

                            System.out.println(e);
                        }
                    }
                }
            };
            sl.start();
        } catch (IOException e) {
            System.out.println(e);
        }


    }

    @FXML
    void closeOnAction(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void feedOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Feed.fxml");
        Parent root = scene.root;
        FeedController feed = (FeedController) scene.controller;
        mainStage.setScene(new Scene(root));


    }

    @FXML
    void logoutOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
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
        Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
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

        Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Ticket.fxml");
        Parent root = scene.root;
        TicketController tc = (TicketController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void checkBMIOnAction(ActionEvent event) throws IOException {

        Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("BMI.fxml");
        Parent root = scene.root;
        BMIController bmi = (BMIController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void gMatchesOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Matches.fxml");
        Parent root = scene.root;
        MatchesController mc = (MatchesController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void groupsOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Teams.fxml");
        Parent root = scene.root;
        TeamsController tc = (TeamsController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void howToOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("HowTo.fxml");
        Parent root = scene.root;
        HowToController tc = (HowToController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void mTreeOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("UserMatchTree.fxml");
        Parent root = scene.root;
        UserMatchTreeController um = (UserMatchTreeController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void matchScoreOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Feed.fxml");
        Parent root = scene.root;
        FeedController feed = (FeedController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void pProfilesOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Player.fxml");
        Parent root = scene.root;
        PlayerController pc = (PlayerController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void profileOnAction(ActionEvent event) throws IOException {

        Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("profile-view.fxml");
        Parent root = scene.root;
        ProfileController pc = (ProfileController) scene.controller;
        mainStage.setScene(new Scene(root));

    }

    @FXML
    void rankOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Ranking.fxml");
        Parent root = scene.root;
        RankingController rc = (RankingController) scene.controller;
        mainStage.setScene(new Scene(root));
    }


    boolean isConnected = false;
    BufferedReader reader;
    BufferedWriter writer;

    @FXML
    void buttonPressed(ActionEvent event) {

        if (!isConnected) {

            String inputName = inputField.getText();

            if (inputName == null || inputName.length() == 0) {
                showArea.appendText("Enter a valid name!\n");
                return;
            }

            try {
                Socket sc = new Socket("127.0.0.1", 33333);
                OutputStreamWriter o = new OutputStreamWriter(sc.getOutputStream());
                writer = new BufferedWriter(o);
                writer.write(inputName + "\n");
                writer.flush();
                InputStreamReader isr = new InputStreamReader(sc.getInputStream());
                reader = new BufferedReader(isr);
                Thread serverListener = new Thread() {

                    @Override
                    public void run() {
                        while (true) {
                            try {
                                String data = reader.readLine() + "\n";
                                showArea.appendText(data);
                            } catch (SocketException e) {
                                showArea.appendText("Connection lost!\n");
                                break;
                            } catch (IOException e) {
                                System.out.println(e);
                            }
                        }
                    }


                };
                serverListener.start();
                showArea.appendText("Connection established!\n");
                button.setText("Send");
                inputField.clear();
                inputField.setPromptText("Write your message");
                showArea.clear();
                isConnected = true;

            } catch (IOException e) {
                System.out.println(e);
            }

        } else {
            try {
                String msg = inputField.getText();
                inputField.clear();
                if (msg == null || msg.length() == 0) {
                    return;
                }
                writer.write(msg + "\n");
                writer.flush();

            } catch (IOException e) {
                System.out.println(e);

            }
        }
    }

}
