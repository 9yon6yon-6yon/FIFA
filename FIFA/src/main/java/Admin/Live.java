package Admin;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class Live extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Live.class.getResource("live.fxml"));
        stage.setTitle("Live Score Update");
        stage.setScene(new Scene(fxmlLoader.load()));
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}

