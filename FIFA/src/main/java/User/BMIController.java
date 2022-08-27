package User;


import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;

import javafx.scene.image.ImageView;


public class BMIController {
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
    private Label ageVal;

    @FXML
    private Button calculateButton;

    @FXML
    private ImageView femaleIcon;

    @FXML
    private Slider heightSet;

    @FXML
    private Label heightinCm;

    @FXML
    private Label labelFemale;

    @FXML
    private Label labelMale;

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
        }
        else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Healthy Weight");
        }
        else if (bmi >= 25.0 && bmi <= 29.9) {
            System.out.println("Over Weight");
        }
       else
            System.out.println("Obesity");

    }


}
