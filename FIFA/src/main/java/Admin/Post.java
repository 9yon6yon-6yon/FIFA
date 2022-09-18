package Admin;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class Post extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Post.class.getResource("Post.fxml"));
        stage.setTitle("Post Panel");

        stage.setScene(new Scene(fxmlLoader.load()));
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}

