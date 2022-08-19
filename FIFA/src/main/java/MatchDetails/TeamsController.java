package MatchDetails;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class TeamsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ChoiceBox<String> groupNames;


    @FXML
    private ImageView imagr1;

    @FXML
    private ImageView imagr2;

    @FXML
    private ImageView imagr3;

    @FXML
    private ImageView imagr4;

    @FXML
    private Label name1;

    @FXML
    private Label name2;

    @FXML
    private Label name3;

    @FXML
    private Label name4;
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
        groupNames.getItems().addAll(groupN);
        groupNames.setValue("Group A");
        groupNames.setOnAction(this::changeGroups);


    }

    public void changeGroups(ActionEvent e) {
        String val = groupNames.getValue();
        if (Objects.equals(val, groupN[0])) {
            name1.setText(GroupA[0]);
            name2.setText(GroupA[1]);
            name3.setText(GroupA[2]);
            name4.setText(GroupA[3]);


            try {
                imagr1.setImage(new Image(new FileInputStream("flags/qa.png")));
                imagr2.setImage(new Image(new FileInputStream("flags/ec.png")));
                imagr3.setImage(new Image(new FileInputStream("flags/sn.png")));
                imagr4.setImage(new Image(new FileInputStream("flags/nl.png")));
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }

        }
        if (Objects.equals(val, groupN[1])) {
            name1.setText(GroupB[0]);
            name2.setText(GroupB[1]);
            name3.setText(GroupB[2]);
            name4.setText(GroupB[3]);


            try {
                imagr1.setImage(new Image(new FileInputStream("flags/gb-eng.png")));
                imagr2.setImage(new Image(new FileInputStream("flags/ir.png")));
                imagr3.setImage(new Image(new FileInputStream("flags/us.png")));
                imagr4.setImage(new Image(new FileInputStream("flags/gb-wls.png")));
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        }
        if (Objects.equals(val, groupN[2])) {
            name1.setText(GroupC[0]);
            name2.setText(GroupC[1]);
            name3.setText(GroupC[2]);
            name4.setText(GroupC[3]);

            try {
                imagr1.setImage(new Image(new FileInputStream("flags/ar.png")));
                imagr2.setImage(new Image(new FileInputStream("flags/sa.png")));
                imagr3.setImage(new Image(new FileInputStream("flags/mx.png")));
                imagr4.setImage(new Image(new FileInputStream("flags/pl.png")));
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        }
        if (Objects.equals(val, groupN[3])) {
            name1.setText(GroupD[0]);
            name2.setText(GroupD[1]);
            name3.setText(GroupD[2]);
            name4.setText(GroupD[3]);


            try {
                imagr1.setImage(new Image(new FileInputStream("flags/fr.png")));
                imagr2.setImage(new Image(new FileInputStream("flags/au.png")));
                imagr3.setImage(new Image(new FileInputStream("flags/dk.png")));
                imagr4.setImage(new Image(new FileInputStream("flags/tn.png")));
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        }
        if (Objects.equals(val, groupN[4])) {
            name1.setText(GroupE[0]);
            name2.setText(GroupE[1]);
            name3.setText(GroupE[2]);
            name4.setText(GroupE[3]);


            try {
                imagr1.setImage(new Image(new FileInputStream("flags/es.png")));
                imagr2.setImage(new Image(new FileInputStream("flags/cr.png")));
                imagr3.setImage(new Image(new FileInputStream("flags/de.png")));
                imagr4.setImage(new Image(new FileInputStream("flags/jp.png")));
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        }
        if (Objects.equals(val, groupN[5])) {
            name1.setText(GroupF[0]);
            name2.setText(GroupF[1]);
            name3.setText(GroupF[2]);
            name4.setText(GroupF[3]);


            try {
                imagr1.setImage(new Image(new FileInputStream("flags/be.png")));
                imagr2.setImage(new Image(new FileInputStream("flags/ca.png")));
                imagr3.setImage(new Image(new FileInputStream("flags/ma.png")));
                imagr4.setImage(new Image(new FileInputStream("flags/hr.png")));
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        }
        if (Objects.equals(val, groupN[6])) {
            name1.setText(GroupG[0]);
            name2.setText(GroupG[1]);
            name3.setText(GroupG[2]);
            name4.setText(GroupG[3]);


            try {
                imagr1.setImage(new Image(new FileInputStream("flags/br.png")));
                imagr2.setImage(new Image(new FileInputStream("flags/rs.png")));
                imagr3.setImage(new Image(new FileInputStream("flags/ch.png")));
                imagr4.setImage(new Image(new FileInputStream("flags/cm.png")));
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        }
        if (Objects.equals(val, groupN[7])) {
            name1.setText(GroupH[0]);
            name2.setText(GroupH[1]);
            name3.setText(GroupH[2]);
            name4.setText(GroupH[3]);


            try {
                imagr1.setImage(new Image(new FileInputStream("flags/pt.png")));
                imagr2.setImage(new Image(new FileInputStream("flags/gh.png")));
                imagr3.setImage(new Image(new FileInputStream("flags/uy.png")));
                imagr4.setImage(new Image(new FileInputStream("flags/kr.png")));
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        }


    }


}
