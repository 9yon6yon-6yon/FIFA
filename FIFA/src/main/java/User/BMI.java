package User;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BMI extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(BMI.class.getResource("BMI.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("BMI");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }


}
