package User;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewLiveScore extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(ViewLiveScore.class.getResource("liveScore.fxml"));
        stage.setTitle("Live Score");
        stage.setScene(new Scene(fxmlLoader.load()));
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}


