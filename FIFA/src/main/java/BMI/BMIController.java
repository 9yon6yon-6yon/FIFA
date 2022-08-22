package BMI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

public class BMIController {


    @FXML
    private Label ageVal;

    @FXML
    private Button calculateButton;

    @FXML
    private ImageView femaleIcon;

    @FXML
    private ProgressBar heightSet;

    @FXML
    private Label heightinCm;

    @FXML
    private ImageView maleIcon;

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
    void onCalculate(ActionEvent event) {
        BMI bmi = new BMI();
        String res = String.valueOf(bmi.calculateBMI(Double.parseDouble(ageVal.getText()), Double.parseDouble(heightinCm.getText())));
        bmi.showMessage(res);


    }
    @FXML
    void exitClicked(ActionEvent event) {
        System.exit(0);

    }

}
