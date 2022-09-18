package User;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.*;

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
        matchTeams.setText(getM());
        tokenView.setText(getTk());

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
            boolean hasTicket = false;
            try {
                String t = "Files/temp.txt";
                File temp = new File(t);
                BufferedReader bf = new BufferedReader(new FileReader("Files/availableMatch.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter(temp, true));
                String line;
                while ((line = bf.readLine()) != null) {
                    String[] parts = line.split("___");
                    if (getTk().equals(parts[2])) {
                        int Ticket = Integer.parseInt(parts[3]);
                        if (Ticket > 0) {
                            hasTicket = true;
                            int avbTicket = Ticket - 1;
                            bw.append(parts[0]).append("___").append(parts[1]).append("___").append(getTk()).append("___").append(String.valueOf(avbTicket)).append("\n");
                        }
                    } else {
                        bw.append(line).append("\n");
                    }
                }
                bf.close();
                bw.close();
                temp.renameTo(new File("Files/availableMatch.txt"));
                if(hasTicket){
                    TicketGenerator tg = new TicketGenerator(fullName.getText(), userid.getText(), mail.getText(), cInfo.getText(), getTokenView().getText(), sDir);
                    tg.setToken(tk);
                    tg.setMatchInfo(m);
                    tg.generatePDF();
                }
                else {
                    Alert alert = new Alert(Alert.AlertType.NONE);
                    alert.setAlertType(Alert.AlertType.WARNING);
                    alert.setContentText("Ticket not available");
                    alert.show();
                }

            } catch (IOException e) {
                System.out.println(e);
            }
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
