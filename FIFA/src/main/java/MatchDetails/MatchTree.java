package MatchDetails;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.util.Objects;

public class MatchTree extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MatchTree.fxml")));
        stage.setScene(new Scene(root));
        stage.getIcons().add(new Image(new FileInputStream("Images/icons8-world-cup-2018-100.png")));

        stage.setTitle("Match TREE");

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
