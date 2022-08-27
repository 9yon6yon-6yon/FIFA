package User;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Objects;

public class BMI extends Application {
    private Stage stage ;

    @Override
    public void start(Stage stage) throws Exception {


        Parent root = FXMLLoader.load(Objects.requireNonNull(BMI.class.getResource("BMI.fxml")));
        Scene scene = new Scene(root);
        stage.setTitle("BMI");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();



    }

    public static void main(String[] args) {
       launch(args);
    }


}
