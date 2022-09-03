package User;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.*;

public class ForgottenController {

    @FXML
    private Button button;

    @FXML
    private TextField  confirmpassword;

    @FXML
    private TextField createpassword;

    @FXML
    private TextField emailtxtfield;

    @FXML
    private Label hidelabel;

    @FXML
    void backmethod(MouseEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("sample.fxml");

    }

    @FXML
    void change(ActionEvent event) throws IOException  {

        FileReader fr = new FileReader("Files/login.txt");
        BufferedReader br = new BufferedReader(fr);


         String mail= emailtxtfield.getText();

         String line;
         while ((line=br.readLine())!=null) {

             String parts[] = line.split(" ");


             if (line.equals(mail)) {
                 FileWriter f = new FileWriter("Files/login.txt");
                 BufferedWriter r = new BufferedWriter(f);

                 parts[1] = confirmpassword.getText().toString();
                 r.write(parts[1]);

                 r.close();
             }


         }

         fr.close();

         Main m = new Main();
         m.changeScene("forgotten.fxml");


    }



}
