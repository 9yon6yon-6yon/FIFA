package Admin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Us extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Us.class.getResource("Us.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("About");
        stage.setScene(scene);
        stage.show();//up to date


    }

    public static void main(String[] args) {
        launch(args);
    }


}
