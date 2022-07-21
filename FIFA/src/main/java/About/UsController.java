package About;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;


public class UsController {

    @FXML
    private Button aboutButton;


    @FXML
    private TextArea crditsText;

    @FXML
    private Button creditsButton;


    @FXML
    void aboutClicked(ActionEvent event) {
        crditsText.setVisible(false);

    }

    @FXML
    void creditClicked(ActionEvent event) {
        crditsText.setVisible(true);
        String credits = "\t\tCreated By\nMd Asif Karim Chayon \n\tID : 011201366\nShojib Talukder \n\tID : 011201345\nRedoy Kumar Shaha \n\tID : 011201355";
        crditsText.setText(credits);

    }


}


