package User;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import MatchDetails.Groups;
import MatchDetails.flags;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
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
    private final String[] GroupA = Groups.GroupA;
    private final String[] GroupB = Groups.GroupB;
    private final String[] GroupC = Groups.GroupC;
    private final String[] GroupD = Groups.GroupD;
    private final String[] GroupE = Groups.GroupE;
    private final String[] GroupF = Groups.GroupF;
    private final String[] GroupG = Groups.GroupG;
    private final String[] GroupH = Groups.GroupH;
    private final String[] groupN = Groups.groupN;

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
            imagr1.setImage(flags.Qatar);
            imagr2.setImage(flags.Ecuador);
            imagr3.setImage(flags.Senegal);
            imagr4.setImage(flags.Netherlands);

        }
        if (Objects.equals(val, groupN[1])) {
            name1.setText(GroupB[0]);
            name2.setText(GroupB[1]);
            name3.setText(GroupB[2]);
            name4.setText(GroupB[3]);
            imagr1.setImage(flags.England);
            imagr2.setImage(flags.Iran);
            imagr3.setImage(flags.USA);
            imagr4.setImage(flags.Wales);
        }
        if (Objects.equals(val, groupN[2])) {
            name1.setText(GroupC[0]);
            name2.setText(GroupC[1]);
            name3.setText(GroupC[2]);
            name4.setText(GroupC[3]);
            imagr1.setImage(flags.Argentina);
            imagr2.setImage(flags.SaudiArabia);
            imagr3.setImage(flags.Mexico);
            imagr4.setImage(flags.Poland);

        }
        if (Objects.equals(val, groupN[3])) {
            name1.setText(GroupD[0]);
            name2.setText(GroupD[1]);
            name3.setText(GroupD[2]);
            name4.setText(GroupD[3]);
            imagr1.setImage(flags.France);
            imagr2.setImage(flags.Australia);
            imagr3.setImage(flags.Denmark);
            imagr4.setImage(flags.Tunisia);

        }
        if (Objects.equals(val, groupN[4])) {
            name1.setText(GroupE[0]);
            name2.setText(GroupE[1]);
            name3.setText(GroupE[2]);
            name4.setText(GroupE[3]);
            imagr1.setImage(flags.Spain);
            imagr2.setImage(flags.CostaRica);
            imagr3.setImage(flags.Germany);
            imagr4.setImage(flags.Japan);

        }
        if (Objects.equals(val, groupN[5])) {
            name1.setText(GroupF[0]);
            name2.setText(GroupF[1]);
            name3.setText(GroupF[2]);
            name4.setText(GroupF[3]);
            imagr1.setImage(flags.Belgium);
            imagr2.setImage(flags.Canada);
            imagr3.setImage(flags.Morocco);
            imagr4.setImage(flags.Croatia);

        }
        if (Objects.equals(val, groupN[6])) {
            name1.setText(GroupG[0]);
            name2.setText(GroupG[1]);
            name3.setText(GroupG[2]);
            name4.setText(GroupG[3]);
            imagr1.setImage(flags.Brazil);
            imagr2.setImage(flags.Serbia);
            imagr3.setImage(flags.Switzerland);
            imagr4.setImage(flags.Cameroon);
        }
        if (Objects.equals(val, groupN[7])) {
            name1.setText(GroupH[0]);
            name2.setText(GroupH[1]);
            name3.setText(GroupH[2]);
            name4.setText(GroupH[3]);
            imagr1.setImage(flags.Portugal);
            imagr2.setImage(flags.Ghana);
            imagr3.setImage(flags.Uruguay);
            imagr4.setImage(flags.SouthKorea);

        }


    }


}
