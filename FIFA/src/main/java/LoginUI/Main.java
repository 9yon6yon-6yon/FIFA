package LoginUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;

public class Main extends Application {

  public static Stage stg;

    @Override
    public void start(Stage primaryStage){
        try{
            stg=primaryStage;

        primaryStage.setResizable(false);
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("sample.fxml")));
        primaryStage.setTitle("FIFA WORLD CUP 2022");
        primaryStage.getIcons().add(new Image(new FileInputStream("Images/icons8-world-cup-2018-100.png")));
        primaryStage.setScene(new Scene(root, 900, 600));
        primaryStage.show();
        }

        catch (Exception e){

           e.printStackTrace();


        }






    }

    public  void  changeScene(String fxml) throws IOException{

        Parent pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(fxml)));
        stg.getScene().setRoot(pane);





    }






    public static void main(String[] args) {
        launch(args);
    }
}
