package User;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;

import Admin.About.UsController;
import MatchDetails.Groups;
import MatchDetails.flags;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MatchesController {
    public AnchorPane Forgottenroot;
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
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    private ImageView flag1;


    @FXML
    private ImageView flag2;

    @FXML
    private ImageView flag3;

    @FXML
    private ImageView flag4;

    @FXML
    private ImageView flag5;

    @FXML
    private ImageView flag6;

    @FXML
    private ImageView flag7;

    @FXML
    private ImageView flag8;

    @FXML
    private ImageView flag9;

    @FXML
    private ImageView flag10;

    @FXML
    private ImageView flag11;

    @FXML
    private ImageView flag12;
    @FXML
    private Label vs1;

    @FXML
    private Label vs2;

    @FXML
    private Label vs3;

    @FXML
    private Label vs4;

    @FXML
    private Label vs5;

    @FXML
    private Label vs6;


    @FXML
    private ChoiceBox<String> gamesGroup;
    private final String[] groupN = Groups.groupN;
    private static final ArrayList<String> arrayList = new ArrayList<>();

    @FXML
    void initialize() {
        gamesGroup.getItems().addAll(groupN);
        gamesGroup.setValue("none");
        gamesGroup.setOnAction(this::matchDates);

    }


    public void matchDates(ActionEvent e) {
        String val = gamesGroup.getValue();
        if (Objects.equals(val, groupN[0])) {
            readFileAndShow(0, vs1, vs2, vs3, vs4, vs5, vs6);

            flag1.setImage(flags.Qatar);
            flag3.setImage(flags.Qatar);
            flag11.setImage(flags.Qatar);

            flag6.setImage(flags.Ecuador);
            flag7.setImage(flags.Ecuador);
            flag10.setImage(flags.Ecuador);


            flag4.setImage(flags.Netherlands);
            flag5.setImage(flags.Netherlands);
            flag8.setImage(flags.Netherlands);


            flag2.setImage(flags.Senegal);
            flag9.setImage(flags.Senegal);
            flag12.setImage(flags.Senegal);


        }
        if (Objects.equals(val, groupN[1])) {
            readFileAndShow(6, vs1, vs2, vs3, vs4, vs5, vs6);
            flag1.setImage(flags.England);
            flag3.setImage(flags.England);
            flag11.setImage(flags.England);

            flag6.setImage(flags.Iran);
            flag7.setImage(flags.Iran);
            flag10.setImage(flags.Iran);


            flag4.setImage(flags.Wales);
            flag5.setImage(flags.Wales);
            flag8.setImage(flags.Wales);


            flag2.setImage(flags.USA);
            flag9.setImage(flags.USA);
            flag12.setImage(flags.USA);

        }
        if (Objects.equals(val, groupN[2])) {
            readFileAndShow(12, vs1, vs2, vs3, vs4, vs5, vs6);
            flag1.setImage(flags.Argentina);
            flag3.setImage(flags.Argentina);
            flag11.setImage(flags.Argentina);

            flag6.setImage(flags.SaudiArabia);
            flag7.setImage(flags.SaudiArabia);
            flag10.setImage(flags.SaudiArabia);


            flag4.setImage(flags.Poland);
            flag5.setImage(flags.Poland);
            flag8.setImage(flags.Poland);


            flag2.setImage(flags.Mexico);
            flag9.setImage(flags.Mexico);
            flag12.setImage(flags.Mexico);

        }
        if (Objects.equals(val, groupN[3])) {
            readFileAndShow(18, vs1, vs2, vs3, vs4, vs5, vs6);
            flag1.setImage(flags.France);
            flag3.setImage(flags.France);
            flag11.setImage(flags.France);

            flag6.setImage(flags.Australia);
            flag7.setImage(flags.Australia);
            flag10.setImage(flags.Australia);


            flag4.setImage(flags.Tunisia);
            flag5.setImage(flags.Tunisia);
            flag8.setImage(flags.Tunisia);


            flag2.setImage(flags.Denmark);
            flag9.setImage(flags.Denmark);
            flag12.setImage(flags.Denmark);
        }
        if (Objects.equals(val, groupN[4])) {
            readFileAndShow(24, vs1, vs2, vs3, vs4, vs5, vs6);
            flag1.setImage(flags.Spain);
            flag3.setImage(flags.Spain);
            flag11.setImage(flags.Spain);

            flag6.setImage(flags.CostaRica);
            flag7.setImage(flags.CostaRica);
            flag10.setImage(flags.CostaRica);


            flag4.setImage(flags.Japan);
            flag5.setImage(flags.Japan);
            flag8.setImage(flags.Japan);


            flag2.setImage(flags.Germany);
            flag9.setImage(flags.Germany);
            flag12.setImage(flags.Germany);

        }
        if (Objects.equals(val, groupN[5])) {
            readFileAndShow(30, vs1, vs2, vs3, vs4, vs5, vs6);
            flag1.setImage(flags.Belgium);
            flag3.setImage(flags.Belgium);
            flag11.setImage(flags.Belgium);

            flag6.setImage(flags.Canada);
            flag7.setImage(flags.Canada);
            flag10.setImage(flags.Canada);


            flag4.setImage(flags.Croatia);
            flag5.setImage(flags.Croatia);
            flag8.setImage(flags.Croatia);


            flag2.setImage(flags.Morocco);
            flag9.setImage(flags.Morocco);
            flag12.setImage(flags.Morocco);

        }
        if (Objects.equals(val, groupN[6])) {
            readFileAndShow(36, vs1, vs2, vs3, vs4, vs5, vs6);
            flag1.setImage(flags.Brazil);
            flag3.setImage(flags.Brazil);
            flag11.setImage(flags.Brazil);

            flag6.setImage(flags.Serbia);
            flag7.setImage(flags.Serbia);
            flag10.setImage(flags.Serbia);


            flag4.setImage(flags.Cameroon);
            flag5.setImage(flags.Cameroon);
            flag8.setImage(flags.Cameroon);


            flag2.setImage(flags.Switzerland);
            flag9.setImage(flags.Switzerland);
            flag12.setImage(flags.Switzerland);

        }
        if (Objects.equals(val, groupN[7])) {
            readFileAndShow(42, vs1, vs2, vs3, vs4, vs5, vs6);
            flag1.setImage(flags.Portugal);
            flag3.setImage(flags.Portugal);
            flag11.setImage(flags.Portugal);

            flag6.setImage(flags.Ghana);
            flag7.setImage(flags.Ghana);
            flag10.setImage(flags.Ghana);


            flag4.setImage(flags.SouthKorea);
            flag5.setImage(flags.SouthKorea);
            flag8.setImage(flags.SouthKorea);


            flag2.setImage(flags.Uruguay);
            flag9.setImage(flags.Uruguay);
            flag12.setImage(flags.Uruguay);

        }

    }

    private void readFileAndShow(int start, Label l1, Label l2, Label l3, Label l4, Label l5, Label l6) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("Files/Scores.txt")));

            String line;
            while ((line = bufferedReader.readLine()) != null)
                arrayList.add(line);

            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
        String[] parts1 = arrayList.get(start).split("_");
        l1.setText(parts1[0] + " " + parts1[1] + " : " + parts1[2] + " " + parts1[3]);
        String[] parts2 = arrayList.get(start + 1).split("_");
        l2.setText(parts2[0] + " " + parts2[1] + " : " + parts2[2] + " " + parts2[3]);
        String[] parts3 = arrayList.get(start + 2).split("_");
        l3.setText(parts3[0] + " " + parts3[1] + " : " + parts3[2] + " " + parts3[3]);
        String[] parts4 = arrayList.get(start + 3).split("_");
        l4.setText(parts4[0] + " " + parts4[1] + " : " + parts4[2] + " " + parts4[3]);
        String[] parts5 = arrayList.get(start + 4).split("_");
        l5.setText(parts5[0] + " " + parts5[1] + " : " + parts5[2] + " " + parts5[3]);
        String[] parts6 = arrayList.get(start + 5).split("_");
        l6.setText(parts6[0] + " " + parts6[1] + " : " + parts6[2] + " " + parts6[3]);

    }

    @FXML
    void closeOnAction(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void feedOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) Forgottenroot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Feed.fxml");
        Parent root = scene.root;
        FeedController feed = (FeedController) scene.controller;
        mainStage.setScene(new Scene(root));


    }

    @FXML
    void logoutOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) Forgottenroot.getScene().getWindow(); // then cast to stage to get the window
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
        Stage mainStage = (Stage) Forgottenroot.getScene().getWindow(); // then cast to stage to get the window
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
        Stage mainStage = (Stage) Forgottenroot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Ticket.fxml");
        Parent root = scene.root;
        TicketController tc = (TicketController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void checkBMIOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) Forgottenroot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("BMI.fxml");
        Parent root = scene.root;
        BMIController bmi = (BMIController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void gMatchesOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) Forgottenroot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Matches.fxml");
        Parent root = scene.root;
        MatchesController mc = (MatchesController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void groupsOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) Forgottenroot.getScene().getWindow(); // then cast to stage to get the window
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
        Stage mainStage = (Stage) Forgottenroot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("UserMatchTree.fxml");
        Parent root = scene.root;
        UserMatchTreeController um = (UserMatchTreeController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void matchScoreOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) Forgottenroot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Feed.fxml");
        Parent root = scene.root;
        FeedController feed = (FeedController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void pProfilesOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) Forgottenroot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Player.fxml");
        Parent root = scene.root;
        PlayerController pc = (PlayerController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void profileOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) Forgottenroot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("profile-view.fxml");
        Parent root = scene.root;
        ProfileController pc = (ProfileController) scene.controller;
        mainStage.setScene(new Scene(root));

    }

}
