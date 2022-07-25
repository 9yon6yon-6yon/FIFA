package About;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;


public class Us extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Us.fxml")));
        stage.setTitle("About");
        stage.setScene(new Scene(root));
        stage.show();//up to date


    }

    public static void main(String[] args) {
        launch(args);
    }


}
