package Admin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class logs extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(logs.class.getResource("logs.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Logs");
        stage.setScene(scene);
        stage.show();//up to date


    }

    public static void main(String[] args) {
        launch(args);
    }

}
