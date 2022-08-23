package BMI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
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
