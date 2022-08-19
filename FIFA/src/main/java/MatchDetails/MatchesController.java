package MatchDetails;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.ImageView;

public class MatchesController {

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
    private ChoiceBox<String> gamesGroup;
    private String[] groupN = {"Group A", "Group B", "Group C", "Group D", "Group E", "Group F", "Group G", "Group H"};
    private String[] GroupA = {"Qatar", "Ecuador", "Senegal", "Netherlands"};
    private String[] GroupB = {"England", "Iran", "USA", "Wales"};
    private String[] GroupC = {"Argentina", "Saudi Arabia", "Mexico", "Poland"};
    private String[] GroupD = {"France", "Australia", "Denmark", "Tunisia"};
    private String[] GroupE = {"Spain", "Costa Rica", "Germany", "Japan"};
    private String[] GroupF = {"Belgium", "Canada", "Morocco", "Croatia"};
    private String[] GroupG = {"Brazil", "Serbia", "Switzerland", "Cameroon"};
    private String[] GroupH = {"Portugal", " Ghana", "Uruguay", "South Korea"};

    @FXML
    void initialize() {
        gamesGroup.getItems().addAll(groupN);
        gamesGroup.setValue("Group A");

    }

}
