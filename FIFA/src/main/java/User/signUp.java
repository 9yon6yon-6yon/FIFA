package User;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.FileWriter;
import java.io.IOException;

public class signUp {

    @FXML
    private TextField scountry;


    @FXML
    private TextField sdof;

    @FXML
    private Label signbackLabel;

    @FXML
    private Button signbutton;

    @FXML
    private TextField smail;

    @FXML
    private TextField sname;

    @FXML
    private PasswordField spassword;

    @FXML
    void backlogin(MouseEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("sample.fxml");




    }

    @FXML
    void signupComplete(ActionEvent event) throws IOException {
        FileWriter fw= new FileWriter("login.txt",true);
        fw.write(smail.getText()+"\t"+spassword.getText()+"\n");
        fw.close();



        FileWriter w= new FileWriter("Files/otherlogin.txt",true);
        w.write(sname.getText()+"\t"+sdof.getText()+"\t"+scountry.getText()+"\n");
        w.close();






    }

}

