/**
 * Main author of this code: Subankar Chakraborty
 * Lecturer at CSE, UIU
 */

package Admin;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;

public class FXMLScene {
    Parent root = null;
    Object controller = null;

    public static FXMLScene load(String fxml) throws IOException {

        FXMLScene fxmlScene = new FXMLScene();
        FXMLLoader fxmlLoader = new FXMLLoader(); // creates a basic fxml object here
        fxmlLoader.setLocation(fxmlScene.getClass().getResource(fxml)); // sets the fxml loader to new class
        fxmlScene.root =  fxmlLoader.load();
        fxmlScene.controller = fxmlLoader.getController(); // gets the controller class of new fxml scene

        return fxmlScene;

    }
}
