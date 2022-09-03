package User;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application {
    private static Stage stg;
    @Override
    public void start(Stage stage) throws Exception {
        try {
             stg=stage;
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("sample.fxml"));
            stage.setTitle("FIFA WORLD CUP 2022");
            stage.setResizable(false);
            stage.setScene(new Scene(fxmlLoader.load()));
            stage.show();

        }

        catch (Exception e){

            e.printStackTrace();


        }


    }

    public  void  changeScene(String fxml) throws IOException {

        Parent pane =FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);





    }










    public static void main(String[] args) {
        launch(args);
    }
}
