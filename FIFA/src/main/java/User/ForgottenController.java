package User;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class ForgottenController {

    @FXML
    private AnchorPane ffc;

    @FXML
    private Label backmethod;

    @FXML
    private Button button;

    @FXML
    private TextField confirmpassword;

    @FXML
    private TextField createpassword;

    @FXML
    private TextField emailtxtfield;

    @FXML
    private Label hidelabel;

    @FXML
    void initialize() {
        backmethod.setOnMouseClicked(mouseEvent -> {
            try {
                Stage mainStage = (Stage) ffc.getScene().getWindow();  // then cast to stage to get the window
                FXMLScene scene = FXMLScene.load("Main.fxml");
                Parent root = scene.root;
                Login login = (Login) scene.controller;
                mainStage.setScene(new Scene(root));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    @FXML
    void change(ActionEvent event) throws IOException {
        try {
            String t = "Files/temp.txt";
            String t2 = "Files/temp2.txt";
            File temp = new File(t);
            File temp2 = new File(t2);
            BufferedReader bf = new BufferedReader(new FileReader("Files/Users.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter(temp, true));
            String line;
            boolean found = false;
            FileReader fr = new FileReader("Files/login.txt");
            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw2 = new BufferedWriter(new FileWriter(temp2, true));

            String log;

            while ((line = bf.readLine()) != null) {
                while ((log = br.readLine()) != null) {
                    String[] parts = log.split("___");
                    if (parts[0].equals(emailtxtfield.getText())) {
                        bw2.append(parts[0]).append("___").append(createpassword.getText()).append("\n");
                    } else
                        bw2.append(log).append("\n");
                }
                String[] parts = line.split("___");
                if (emailtxtfield.getText().equals(parts[3])) {
                    found = true;
                    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                    Date date = new Date();
                    bw.append(parts[0]).append("___").append(parts[1]).append("___").append(parts[2]).append("___").append(parts[3]).append("___").append(confirmpassword.getText()).append("___").append(formatter.format(date)).append("\n");
                } else
                    bw.append(line).append("\n");
            }
            fr.close();
            br.close();
            bf.close();
            bw.close();
            bw2.close();
            temp.renameTo(new File("Files/Users.txt"));
            temp2.renameTo(new File("Files/login.txt"));
            if (!found) {
                Alert alert = new Alert(Alert.AlertType.NONE);
                alert.setAlertType(Alert.AlertType.WARNING);
                alert.setContentText("Wrong email address");
                alert.show();
            }
            if (found) {
                Alert alert = new Alert(Alert.AlertType.NONE);
                alert.setAlertType(Alert.AlertType.CONFIRMATION);
                alert.setContentText("Password Changed ");
                alert.showAndWait();
                try {
                    Stage mainStage = (Stage) ffc.getScene().getWindow();  // then cast to stage to get the window
                    FXMLScene scene = FXMLScene.load("Main.fxml");
                    Parent root = scene.root;
                    Login login = (Login) scene.controller;
                    mainStage.setScene(new Scene(root));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }


        } catch (IOException e) {
            System.out.println(e);
        }
    }


}

