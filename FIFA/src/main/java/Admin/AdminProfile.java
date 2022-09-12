package Admin;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class AdminProfile extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(AdminProfile.class.getResource("adminProfile.fxml"));
        stage.setTitle("FIFA WORLD CUP 2022");
        stage.getIcons().add(new Image(new FileInputStream("Images/icons8-world-cup-2018-100.png")));
        stage.setScene(new Scene(fxmlLoader.load()));
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
