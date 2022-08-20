package playerProfiles;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;

import java.io.FileNotFoundException;

public class PlayerController {

    @FXML
    private ChoiceBox<String> countryNames;

    @FXML
    private ListView<String> playerLists;

    @FXML
    private ImageView showFlags;
    String[] countries = {"none", "Qatar", "Ecuador", "Senegal", "Netherlands", "England", "Iran", "USA", "Wales", "Argentina", "Saudi Arabia", "Mexico", "Poland", "France", "Australia", "Denmark", "Tunisia", "Spain", "Costa Rica", "Germany", "Japan", "Belgium", "Canada", "Morocco", "Croatia", "Brazil", "Serbia", "Switzerland", "Cameroon", "Portugal", " Ghana", "Uruguay", "South Korea"};

    @FXML
    public void initialize() throws FileNotFoundException {
        countryNames.setValue("none");
        countryNames.getItems().addAll(countries);
        getCountryName(countryNames);


    }
    private void getCountryName(ChoiceBox<String> choice)  {
        String nameOfCountry = choice.getValue();
        System.out.println( nameOfCountry);
        if (nameOfCountry.equals(countries[0])) {
            playerLists.setVisible(true);
            playerLists.getItems().addAll("Group A: Qatar, Ecuador, Senegal, Netherlands",
                    "Group B: England, Iran, USA, Wales",
                    "Group C: Argentina, Saudi Arabia, Mexico, Poland",
                    "Group D: France, Australia, Denmark, Tunisia",
                    "Group E: Spain, Costa Rica, Germany, Japan",
                    "Group F: Belgium, Canada, Morocco, Croatia",
                    "Group G: Brazil, Serbia, Switzerland, Cameroon",
                    "Group H: Portugal, Ghana, Uruguay, South Korea");
        }
//
//        if (nameOfCountry.equals(countries[1])) {
//            System.out.println(countries[1] + " selected");
//            showFlags.setImage(new Image(new FileInputStream("flags/qa.png")));
//            showFlags.setVisible(false);
//
//        }
//        if (nameOfCountry.equals(countries[2])) {
//        }
//        if (nameOfCountry.equals(countries[4])) {
//        }
//        if (nameOfCountry.equals(countries[5])) {
//        }
//        if (nameOfCountry.equals(countries[6])) {
//        }
//        if (nameOfCountry.equals(countries[3])) {
//        }
//        if (nameOfCountry.equals(countries[7])) {
//        }
//        if (nameOfCountry.equals(countries[8])) {
//        }
//        if (nameOfCountry.equals(countries[9])) {
//        }
//        if (nameOfCountry.equals(countries[10])) {
//        }
//        if (nameOfCountry.equals(countries[11])) {
//        }
//        if (nameOfCountry.equals(countries[12])) {
//        }
//        if (nameOfCountry.equals(countries[13])) {
//        }
//        if (nameOfCountry.equals(countries[14])) {
//        }
//        if (nameOfCountry.equals(countries[15])) {
//        }
//        if (nameOfCountry.equals(countries[16])) {
//        }
//        if (nameOfCountry.equals(countries[17])) {
//        }
//        if (nameOfCountry.equals(countries[18])) {
//        }
//        if (nameOfCountry.equals(countries[19])) {
//        }
//        if (nameOfCountry.equals(countries[20])) {
//        }
//        if (nameOfCountry.equals(countries[21])) {
//        }
//        if (nameOfCountry.equals(countries[22])) {
//        }
//        if (nameOfCountry.equals(countries[23])) {
//        }
//        if (nameOfCountry.equals(countries[24])) {
//        }
//        if (nameOfCountry.equals(countries[25])) {
//        }
//        if (nameOfCountry.equals(countries[26])) {
//        }
//        if (nameOfCountry.equals(countries[27])) {
//        }
//        if (nameOfCountry.equals(countries[28])) {
//        }
//        if (nameOfCountry.equals(countries[29])) {
//        }
//        if (nameOfCountry.equals(countries[30])) {
//        }
//        if (nameOfCountry.equals(countries[31])) {
//        }
//        if (nameOfCountry.equals(countries[32])) {
//        }
//
    }

}
