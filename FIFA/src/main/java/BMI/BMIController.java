package BMI;
import About.Us;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sample.Main;

import java.io.IOException;
import java.util.Objects;

public class BMIController {
    @FXML
    private Label ageVal;

    @FXML
    private Pane bmiPane;

    @FXML
    private Button calculateButton;

    @FXML
    private ImageView femaleIcon;

    @FXML
    private ProgressBar heightSet;

    @FXML
    private Label heightinCm;

    @FXML
    private MenuItem logOut;

    @FXML
    private ImageView maleIcon;

    @FXML
    private MenuBar menubar;

    @FXML
    private ImageView minageKey;

    @FXML
    private ImageView minweightKey;

    @FXML
    private ImageView plusageKey;

    @FXML
    private ImageView plusweightKey;

    @FXML
    private Label weightVal;

    @FXML
    void aboutClicked(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(Us.class.getResource("Us.fxml")));
        stage.setTitle("About");
        stage.setScene(new javafx.scene.Scene(root));
        stage.show();

    }
    @FXML
    void onLogOutClicked(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource("sample.fxml")));
        stage.setScene(new javafx.scene.Scene(root));
        stage.show();

    }
    @FXML
    void onCalculate(ActionEvent event) {
        BMI bmi = new BMI();
       String res = String.valueOf(bmi.calculateBMI(Double.parseDouble(ageVal.getText()),Double.parseDouble(heightinCm.getText())));
        bmi.showMessage(res);


    }
    @FXML
    void exitClicked(ActionEvent event) {
        System.exit(0);

    }

}
