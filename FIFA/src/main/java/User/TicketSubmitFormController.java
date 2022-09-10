package User;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

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
    private String m;

    public String getTk() {
        return tk;
    }

    public void setTk(String tk) {
        this.tk = tk;
    }

    private String tk;

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

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
        matchTeams.setText(m);
        tokenView.setText(tk);

        choosepath.setOnAction(actionEvent -> {
            DirectoryChooser directoryChooser = new DirectoryChooser();
            directoryChooser.setTitle("save to");
            File defaultDic = new File(System.getProperty("user.dir"));
            directoryChooser.setInitialDirectory(defaultDic);
            Stage stage = (Stage) form.getScene().getWindow();
            File selectedDir = directoryChooser.showDialog(stage);
            setsDir(selectedDir.getAbsolutePath());
            locationPath.setText(sDir);
        });
        saveButton.setOnAction(actionEvent -> {
            TicketGenerator tg = new TicketGenerator(fullName.getText(), userid.getText(), mail.getText(), cInfo.getText(), getTokenView().getText(), sDir);
            tg.setToken(tk);
            tg.setMatchInfo(m);
            tg.generatePDF();
            try {
                Stage mainStage = (Stage) form.getScene().getWindow(); // then cast to stage to get the window
                FXMLScene scene = FXMLScene.load("Ticket.fxml");
                Parent root = scene.root;
                TicketController tc = (TicketController) scene.controller;
                mainStage.setScene(new Scene(root));
            } catch (IOException e) {
                System.out.println(e);
            }
        });


    }


}
