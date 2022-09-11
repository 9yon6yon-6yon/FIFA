package User;

import java.io.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
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

        FileReader fr = new FileReader("Files/login.txt");
        BufferedReader br = new BufferedReader(fr);


        String mail = emailtxtfield.getText();

        String line;
        while ((line = br.readLine()) != null) {

            String[] parts = line.split(" ");


            if (line.equals(mail)) {
                FileWriter f = new FileWriter("Files/login.txt");
                BufferedWriter r = new BufferedWriter(f);

                parts[1] = confirmpassword.getText();
                r.write(parts[1]);

                r.close();
            }


        }

        fr.close();



    }

}
