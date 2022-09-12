package User;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class SportsShop extends Application {

    public static final String CURRENCY = "tk";
    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(Player.class.getResource("market.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setTitle("Sports Market");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
