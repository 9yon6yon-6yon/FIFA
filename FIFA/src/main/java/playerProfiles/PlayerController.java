package playerProfiles;

import java.io.IOException;
import java.util.Objects;

import About.Us;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import sample.Main;


public class PlayerController {


    @FXML
    void aboutClicked(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(Us.class.getResource("Us.fxml")));
        stage.setTitle("About");
        stage.setScene(new javafx.scene.Scene(root));
        stage.show();

    }

    @FXML
    void onLogOutClicked(ActionEvent event) throws IOException {
        Stage stage = new Stage();
       Parent root = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource("sample.fxml")));
       stage.setScene(new javafx.scene.Scene(root));
       stage.show();



    }

    @FXML
    void exitClicked(ActionEvent event) {
        System.exit(0);

    }

}
