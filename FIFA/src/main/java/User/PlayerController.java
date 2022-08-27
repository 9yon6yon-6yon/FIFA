package User;

import MatchDetails.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class PlayerController {
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
    private ChoiceBox<String> countryNames;

    @FXML
    private ListView<String> playerLists;

    @FXML
    private ImageView showFlags;
    final String[] countries = Groups.countries;

    @FXML
    void initialize() {
        countryNames.getItems().addAll(countries);
        countryNames.setOnAction(this::getCountryName);


    }

    private void readSquad(String cName) {
        playerLists.setVisible(true);
        playerLists.getItems().clear();
        String fileName = "SquadDetails/" + cName + "Squad.txt";
        try {
            BufferedReader bf = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = bf.readLine()) != null) {
                playerLists.getItems().addAll(line);
            }
            bf.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void getCountryName(ActionEvent e) {
        String nameOfCountry = countryNames.getValue();
        if (nameOfCountry.equals(countries[0])) {
            showFlags.setImage(flags.Qatar);
            readSquad(nameOfCountry);
        }

        if (nameOfCountry.equals(countries[1])) {
            showFlags.setImage(flags.Ecuador);
            readSquad(nameOfCountry);


        }
        if (nameOfCountry.equals(countries[2])) {

            showFlags.setImage(flags.Senegal);
            readSquad(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[3])) {

            showFlags.setImage(flags.Netherlands);
            readSquad(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[4])) {
            showFlags.setImage(flags.England);
            readSquad(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[5])) {
            showFlags.setImage(flags.Iran);
            readSquad(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[6])) {
            showFlags.setImage(flags.USA);
            readSquad(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[7])) {
            showFlags.setImage(flags.Wales);
            readSquad(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[8])) {
            showFlags.setImage(flags.Argentina);
            readSquad(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[9])) {
            showFlags.setImage(flags.SaudiArabia);
            readSquad(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[10])) {
            showFlags.setImage(flags.Mexico);
            readSquad(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[11])) {
            showFlags.setImage(flags.Poland);
            readSquad(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[12])) {
            showFlags.setImage(flags.France);
            readSquad(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[13])) {
            showFlags.setImage(flags.Australia);
            readSquad(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[14])) {
            showFlags.setImage(flags.Denmark);
            readSquad(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[15])) {
            showFlags.setImage(flags.Tunisia);
            readSquad(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[16])) {
            showFlags.setImage(flags.Spain);
            readSquad(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[17])) {
            showFlags.setImage(flags.CostaRica);
            readSquad(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[18])) {
            showFlags.setImage(flags.Germany);
            readSquad(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[19])) {
            showFlags.setImage(flags.Japan);
            readSquad(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[20])) {
            showFlags.setImage(flags.Belgium);
            readSquad(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[21])) {
            showFlags.setImage(flags.Canada);
            readSquad(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[22])) {
            showFlags.setImage(flags.Morocco);
            readSquad(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[23])) {
            showFlags.setImage(flags.Croatia);
            readSquad(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[24])) {
            showFlags.setImage(flags.Brazil);
            readSquad(nameOfCountry);

        }

        if (nameOfCountry.equals(countries[25])) {
            showFlags.setImage(flags.Serbia);
            readSquad(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[26])) {
            showFlags.setImage(flags.Switzerland);
            readSquad(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[27])) {
            showFlags.setImage(flags.Cameroon);
            readSquad(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[28])) {
            showFlags.setImage(flags.Portugal);
            readSquad(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[29])) {
            showFlags.setImage(flags.Ghana);
            readSquad(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[30])) {
            showFlags.setImage(flags.Uruguay);
            readSquad(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[31])) {
            showFlags.setImage(flags.SouthKorea);
            readSquad(nameOfCountry);

        }

    }

}
