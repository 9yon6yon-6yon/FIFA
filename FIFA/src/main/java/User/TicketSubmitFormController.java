package User;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.File;

public class TicketSubmitFormController {

    @FXML
    private TextField cInfo;

    @FXML
    private Button choosepath;

    @FXML
    private AnchorPane form;

    @FXML
    private TextField fullName;

    @FXML
    private TextField locationPath;

    @FXML
    private TextField mail;

    @FXML
    private Label matchTeams;

    @FXML
    private Label tokenView;

    @FXML
    private TextField userid;
    @FXML
    private Button saveButton;
    private String sDir;

    public String getsDir() {
        return sDir;
    }

    public void setsDir(String sDir) {
        this.sDir = sDir;
    }

    public Label getMatchTeams() {
        return matchTeams;
    }

    public void setMatchTeams(Label matchTeams) {
        this.matchTeams = matchTeams;
    }

    public Label getTokenView() {
        return tokenView;
    }

    public void setTokenView(Label tokenView) {
        this.tokenView = tokenView;
    }

    @FXML
    void initialize() {

        choosepath.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                DirectoryChooser directoryChooser = new DirectoryChooser();
                directoryChooser.setTitle("save to");
                File defaultDic = new File(System.getProperty("user.dir"));
                directoryChooser.setInitialDirectory(defaultDic);
                Stage stage = (Stage) form.getScene().getWindow();
                File selectedDir = directoryChooser.showDialog(stage);
                setsDir(selectedDir.getAbsolutePath());
                locationPath.setText(sDir);
            }
        });
        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                TicketGenerator tg = new TicketGenerator(fullName.getText(), userid.getText(), mail.getText(), cInfo.getText(), "", sDir);
                tg.generatePDF();
                System.exit(0);
            }
        });


    }


}
