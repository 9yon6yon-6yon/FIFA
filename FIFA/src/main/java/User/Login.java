package User;

import Admin.AdminProfileController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;


public class Login {

    @FXML
    private Button button;

    @FXML
    private Button button2;

    @FXML
    private Label forgottenLabel;

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;


    @FXML
    void userLogin(ActionEvent event) {
        checkLoging(event);
    }


    private void checkLoging(ActionEvent event) {
        try {
            Stage mainStage = (Stage) ((Node) (event.getSource())).getScene().getWindow(); // then cast to stage to get the window
            FXMLScene scene = FXMLScene.load("Feed.fxml");

            Parent root = scene.root;
            FeedController main = (FeedController) scene.controller;
            String emailId = username.getText();
            String pass = password.getText();
            if (emailId.isEmpty() && pass.isEmpty()) {
                Alert a = new Alert(Alert.AlertType.NONE);
                a.setAlertType(Alert.AlertType.ERROR);
                a.setContentText("Enter Valid information");
                a.show();
                return;
            }
            if (emailId.equals("admin") && Objects.equals(pass, "admin")) {
                try {
                    Stage adminStage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
                    FXMLScene adminScene = FXMLScene.load("/Admin/adminProfile.fxml");
                    Parent r = adminScene.root;
                    AdminProfileController ad = (AdminProfileController) adminScene.controller;
                    adminStage.setScene(new Scene(r));

                } catch (IOException e) {
                    System.out.println(e);
                }
                return;
            }
            boolean found = false;
            String line;
            BufferedReader br = new BufferedReader(new FileReader("Files/login.txt"));
            while ((line = br.readLine()) != null) {
                String[] part = line.split("___");
                if (emailId.equals(part[0]) && pass.equals(part[1])) {
                    found = true;
                    mainStage.setScene(new Scene(root));
                    br.close();
                    try {
                        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        Date date = new Date();
                        BufferedWriter w = new BufferedWriter(new FileWriter("Files/logs.txt", true));

                        w.write(username.getText() + " Logged in at -> " + formatter.format(date) + "\n");
                        w.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                    break;
                }
            }
            if (!found) {
                Alert a = new Alert(Alert.AlertType.NONE);
                a.setAlertType(Alert.AlertType.ERROR);
                a.setContentText("Wrong email or password");
                a.show();
            }


        } catch (IOException e) {
            System.out.println(e);

        }
    }


    @FXML
    void userSignup(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) ((Node) (event.getSource())).getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("signUp.fxml");
        Parent root = scene.root;
        signUp main = (signUp) scene.controller;
        mainStage.setScene(new Scene(root));


    }

    @FXML
    void forgetmethod(MouseEvent event) throws IOException {
        Stage mainStage = (Stage) ((Node) (event.getSource())).getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Forgotten.fxml");
        Parent root = scene.root;
        ForgottenController main = (ForgottenController) scene.controller;
        mainStage.setScene(new Scene(root));


    }


}
