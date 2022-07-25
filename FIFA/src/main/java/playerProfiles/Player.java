package playerProfiles;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Player extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Player.fxml")));
        stage.setTitle("Player Profile");
        stage.setScene(new Scene(root,900,600));
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
