package Admin;

import User.Login;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.*;
import java.util.*;

public class MatchTreeController {


    public AnchorPane mtree;
    @FXML
    private CheckBox f1m1;

    @FXML
    private CheckBox f1m2;

    @FXML
    private TextField finalMatch1;

    @FXML
    private TextField finalMatch2;

    @FXML
    private CheckBox q1m1;

    @FXML
    private CheckBox q1m2;

    @FXML
    private CheckBox q1m3;

    @FXML
    private CheckBox q1m4;

    @FXML
    private CheckBox q1m5;

    @FXML
    private CheckBox q1m6;

    @FXML
    private CheckBox q1m7;

    @FXML
    private CheckBox q1m8;

    @FXML
    private TextField quater1;

    @FXML
    private TextField quater2;

    @FXML
    private TextField quater3;

    @FXML
    private TextField quater4;

    @FXML
    private TextField quater5;

    @FXML
    private TextField quater6;

    @FXML
    private TextField quater7;

    @FXML
    private TextField quater8;

    @FXML
    private CheckBox r1m1;

    @FXML
    private CheckBox r1m10;

    @FXML
    private CheckBox r1m11;

    @FXML
    private CheckBox r1m12;

    @FXML
    private CheckBox r1m13;

    @FXML
    private CheckBox r1m14;

    @FXML
    private CheckBox r1m15;

    @FXML
    private CheckBox r1m16;

    @FXML
    private CheckBox r1m2;

    @FXML
    private CheckBox r1m3;

    @FXML
    private CheckBox r1m4;

    @FXML
    private CheckBox r1m5;

    @FXML
    private CheckBox r1m6;

    @FXML
    private CheckBox r1m7;

    @FXML
    private CheckBox r1m8;

    @FXML
    private CheckBox r1m9;

    @FXML
    private TextField round1;

    @FXML
    private TextField round10;

    @FXML
    private TextField round11;

    @FXML
    private TextField round12;

    @FXML
    private TextField round13;

    @FXML
    private TextField round14;

    @FXML
    private TextField round15;

    @FXML
    private TextField round16;

    @FXML
    private TextField round2;

    @FXML
    private TextField round3;

    @FXML
    private TextField round4;

    @FXML
    private TextField round5;

    @FXML
    private TextField round6;

    @FXML
    private TextField round7;

    @FXML
    private TextField round8;

    @FXML
    private TextField round9;

    @FXML
    private CheckBox s1m1;

    @FXML
    private CheckBox s1m2;

    @FXML
    private CheckBox s1m3;

    @FXML
    private CheckBox s1m4;

    @FXML
    private Button savetree;

    @FXML
    private TextField semi1;

    @FXML
    private TextField semi2;

    @FXML
    private TextField semi3;

    @FXML
    private TextField semi4;

    @FXML
    void LiveOnAction(ActionEvent event) {

    }

    @FXML
    void aboutOnAction(ActionEvent event) {
        try {
            Stage mainStage = (Stage) mtree.getScene().getWindow(); // then cast to stage to get the window
            FXMLScene scene = FXMLScene.load("Us.fxml");
            Parent root = scene.root;
            UsController pc = (UsController) scene.controller;
            mainStage.setScene(new Scene(root));
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    @FXML
    void buyJercyOnAction(ActionEvent event) {

    }

    @FXML
    void buyTicketOnAction(ActionEvent event) {
        try {
            Stage mainStage = (Stage) mtree.getScene().getWindow(); // then cast to stage to get the window
            Admin.FXMLScene scene = FXMLScene.load("AddTickets.fxml");
            Parent root = scene.root;
            AddTicketsController atc = (AddTicketsController) scene.controller;
            mainStage.setScene(new Scene(root));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @FXML
    void closeOnAction(ActionEvent event) {
        System.exit(0);

    }

    @FXML
    void feedOnAction(ActionEvent event) {

    }

    @FXML
    void gMatchesOnAction(ActionEvent event) {

    }

    @FXML
    void groupsOnAction(ActionEvent event) {

    }


    @FXML
    void logoutOnAction(ActionEvent event) {
        try {
            Stage mainStage = (Stage) mtree.getScene().getWindow(); // then cast to stage to get the window
            User.FXMLScene scene = User.FXMLScene.load("Main.fxml");
            Parent root = scene.root;
            Login login = (Login) scene.controller;
            mainStage.setScene(new Scene(root));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void mTreeOnAction(ActionEvent event) {

    }

    @FXML
    void matchScoreOnAction(ActionEvent event) {

    }

    @FXML
    void pProfilesOnAction(ActionEvent event) {

    }

    @FXML
    void profileOnAction(ActionEvent event) {
        try {
            logs logs = new logs();
            logs.start(new Stage());
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @FXML
    void rankOnAction(ActionEvent event) {

    }

    @FXML
    void refreshOnAction(ActionEvent event) {

    }

    @FXML
    void initialize() {
        ArrayList<String> roundUp = new ArrayList<>();
        try {
            BufferedReader bf = new BufferedReader(new FileReader("Files/r16.txt"));
            String line;
            while ((line = bf.readLine()) != null) {
                roundUp.add(line);
            }
            bf.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        round1.setText(roundUp.get(0));
        round2.setText(roundUp.get(1));
        round3.setText(roundUp.get(2));
        round4.setText(roundUp.get(3));
        round5.setText(roundUp.get(4));
        round6.setText(roundUp.get(5));
        round7.setText(roundUp.get(6));
        round8.setText(roundUp.get(7));
        round9.setText(roundUp.get(8));
        round10.setText(roundUp.get(9));
        round11.setText(roundUp.get(10));
        round12.setText(roundUp.get(11));
        round13.setText(roundUp.get(12));
        round14.setText(roundUp.get(13));
        round15.setText(roundUp.get(14));
        round16.setText(roundUp.get(15));

        r1m1.setOnAction(event -> {
            if (!Objects.equals(round1.getText(), "") && !Objects.equals(round2.getText(), "")) {
                round2.setEditable(false);
                r1m2.setDisable(true);
                quater1.setText(round1.getText());
                storeMatches("quater.txt", round1.getText());
            } else {
                showAlertMsg();
                r1m1.setSelected(false);

            }


        });
        r1m2.setOnAction(event -> {
            if (!Objects.equals(round1.getText(), "") && !Objects.equals(round2.getText(), "")) {
                round1.setEditable(false);
                r1m1.setDisable(true);
                quater1.setText(round2.getText());
                storeMatches("quater.txt", round2.getText());
            } else {
                showAlertMsg();
                r1m2.setSelected(false);

            }
        });
        r1m3.setOnAction(event -> {
            if (!Objects.equals(round3.getText(), "") && !Objects.equals(round4.getText(), "")) {
                round4.setEditable(false);
                r1m4.setDisable(true);
                quater2.setText(round3.getText());
                storeMatches("quater.txt", round3.getText());


            } else {
                showAlertMsg();
                r1m3.setSelected(false);

            }

        });
        r1m4.setOnAction(event -> {
            if (!Objects.equals(round3.getText(), "") && !Objects.equals(round4.getText(), "")) {
                round3.setEditable(false);
                r1m3.setDisable(true);
                quater2.setText(round4.getText());
                storeMatches("quater.txt", round4.getText());


            } else {
                showAlertMsg();
                r1m4.setSelected(false);

            }
        });
        r1m5.setOnAction(event -> {
            if (!Objects.equals(round5.getText(), "") && !Objects.equals(round6.getText(), "")) {
                round6.setEditable(false);
                r1m6.setDisable(true);
                quater3.setText(round5.getText());
                storeMatches("quater.txt", round5.getText());

            } else {
                showAlertMsg();
                r1m5.setSelected(false);
            }

        });
        r1m6.setOnAction(event -> {
            if (!Objects.equals(round5.getText(), "") && !Objects.equals(round6.getText(), "")) {
                round5.setEditable(false);
                r1m5.setDisable(true);
                quater3.setText(round6.getText());
                storeMatches("quater.txt", round6.getText());

            } else {
                showAlertMsg();
                r1m6.setSelected(false);
            }
        });
        r1m7.setOnAction(event -> {
            if (!Objects.equals(round7.getText(), "") && !Objects.equals(round8.getText(), "")) {
                round8.setEditable(false);
                r1m8.setDisable(true);
                quater4.setText(round7.getText());
                storeMatches("quater.txt", round7.getText());

            } else {
                showAlertMsg();
                r1m7.setSelected(false);
            }
        });
        r1m8.setOnAction(event -> {
            if (!Objects.equals(round7.getText(), "") && !Objects.equals(round8.getText(), "")) {
                round7.setEditable(false);
                r1m7.setDisable(true);
                quater4.setText(round8.getText());
                storeMatches("quater.txt", round8.getText());


            } else {
                showAlertMsg();
                r1m8.setSelected(false);
            }
        });
        r1m9.setOnAction(event -> {
            if (!Objects.equals(round9.getText(), "") && !Objects.equals(round10.getText(), "")) {
                round10.setEditable(false);
                r1m10.setDisable(true);
                quater5.setText(round9.getText());
                storeMatches("quater.txt", round9.getText());

            } else {
                showAlertMsg();
                r1m9.setSelected(false);

            }


        });
        r1m10.setOnAction(event -> {
            if (!Objects.equals(round9.getText(), "") && !Objects.equals(round10.getText(), "")) {
                round9.setEditable(false);
                r1m9.setDisable(true);
                quater5.setText(round10.getText());
                storeMatches("quater.txt", round10.getText());


            } else {
                showAlertMsg();
                r1m10.setSelected(false);

            }
        });
        r1m11.setOnAction(event -> {
            if (!Objects.equals(round11.getText(), "") && !Objects.equals(round12.getText(), "")) {
                round12.setEditable(false);
                r1m12.setDisable(true);
                quater6.setText(round11.getText());
                storeMatches("quater.txt", round11.getText());

            } else {
                showAlertMsg();
                r1m11.setSelected(false);

            }


        });
        r1m12.setOnAction(event -> {
            if (!Objects.equals(round11.getText(), "") && !Objects.equals(round12.getText(), "")) {
                round11.setEditable(false);
                r1m11.setDisable(true);
                quater6.setText(round12.getText());
                storeMatches("quater.txt", round12.getText());


            } else {
                showAlertMsg();
                r1m12.setSelected(false);

            }
        });
        r1m13.setOnAction(event -> {
            if (!Objects.equals(round13.getText(), "") && !Objects.equals(round14.getText(), "")) {
                round14.setEditable(false);
                r1m14.setDisable(true);
                quater7.setText(round13.getText());
                storeMatches("quater.txt", round13.getText());

            } else {
                showAlertMsg();
                r1m13.setSelected(false);

            }


        });
        r1m14.setOnAction(event -> {
            if (!Objects.equals(round13.getText(), "") && !Objects.equals(round14.getText(), "")) {
                round13.setEditable(false);
                r1m13.setDisable(true);
                quater7.setText(round12.getText());
                storeMatches("quater.txt", round14.getText());


            } else {
                showAlertMsg();
                r1m14.setSelected(false);

            }
        });
        r1m15.setOnAction(event -> {
            if (!Objects.equals(round15.getText(), "") && !Objects.equals(round16.getText(), "")) {
                round16.setEditable(false);
                r1m16.setDisable(true);
                quater8.setText(round15.getText());
                storeMatches("quater.txt", round15.getText());


            } else {
                showAlertMsg();
                r1m15.setSelected(false);

            }


        });
        r1m16.setOnAction(event -> {
            if (!Objects.equals(round15.getText(), "") && !Objects.equals(round16.getText(), "")) {
                round15.setEditable(false);
                r1m15.setDisable(true);
                quater8.setText(round16.getText());
                storeMatches("quater.txt", round16.getText());


            } else {
                showAlertMsg();
                r1m16.setSelected(false);

            }
        });
        q1m1.setOnAction(event -> {
            semi1.setText(quater1.getText());
            q1m2.setDisable(true);
            q1m1.setDisable(true);
            storeMatches("semi.txt", quater1.getText());

        });
        q1m2.setOnAction(event -> {
            semi1.setText(quater2.getText());
            q1m1.setDisable(true);
            q1m2.setDisable(true);
            storeMatches("semi.txt", quater2.getText());

        });
        q1m3.setOnAction(event -> {
            semi2.setText(quater3.getText());
            q1m3.setDisable(true);
            q1m4.setDisable(true);
            storeMatches("semi.txt", quater3.getText());

        });
        q1m4.setOnAction(event -> {
            semi2.setText(quater4.getText());
            q1m3.setDisable(true);
            q1m4.setDisable(true);
            storeMatches("semi.txt", quater4.getText());

        });
        q1m5.setOnAction(event -> {
            semi3.setText(quater5.getText());
            q1m5.setDisable(true);
            q1m6.setDisable(true);
            storeMatches("semi.txt", quater5.getText());

        });
        q1m6.setOnAction(event -> {
            semi3.setText(quater6.getText());
            q1m5.setDisable(true);
            q1m6.setDisable(true);
            storeMatches("semi.txt", quater6.getText());

        });
        q1m7.setOnAction(event -> {
            semi4.setText(quater7.getText());
            q1m8.setDisable(true);
            q1m7.setDisable(true);
            storeMatches("semi.txt", quater7.getText());

        });
        q1m8.setOnAction(event -> {
            semi4.setText(quater8.getText());
            q1m7.setDisable(true);
            q1m8.setDisable(true);
            storeMatches("semi.txt", quater8.getText());

        });

        s1m1.setOnAction(event -> {
            finalMatch1.setText(semi1.getText());
            s1m2.setDisable(true);
            s1m1.setDisable(true);
            storeMatches("finalMatch.txt", semi1.getText());

        });
        s1m2.setOnAction(event -> {
            finalMatch1.setText(semi2.getText());
            s1m1.setDisable(true);
            s1m2.setDisable(true);
            storeMatches("finalMatch.txt", semi2.getText());

        });
        s1m3.setOnAction(event -> {
            finalMatch2.setText(semi3.getText());
            s1m4.setDisable(true);
            s1m3.setDisable(true);
            storeMatches("finalMatch.txt", semi3.getText());

        });
        s1m4.setOnAction(event -> {
            finalMatch2.setText(semi4.getText());
            s1m3.setDisable(true);
            s1m4.setDisable(true);
            storeMatches("finalMatch.txt", semi4.getText());

        });
        f1m1.setOnAction(event -> {
            f1m2.setDisable(true);
            f1m1.setDisable(true);
            storeMatches("won.txt", finalMatch1.getText());

        });
        f1m2.setOnAction(event -> {
            f1m1.setDisable(true);
            f1m2.setDisable(true);
            storeMatches("won.txt", finalMatch2.getText());

        });


    }

    private void showAlertMsg() {
        Alert alert = new Alert(Alert.AlertType.NONE);
        alert.setAlertType(Alert.AlertType.ERROR);
        alert.setTitle("Empty String");
        alert.setContentText("Country Name field cannot be null. Must Use an Input. (e.g. Qatar)");
        alert.show();
    }

    private void storeMatches(String pathRef, String o1) {
        try {
            String path = "Files/" + pathRef;
            BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
            bw.append(o1).append("\n");
            bw.close();

        } catch (IOException e) {
            System.out.println(e);
        }


    }

}
