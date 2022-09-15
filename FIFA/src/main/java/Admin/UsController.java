package Admin;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class UsController {

    @FXML
    private Button aboutButton;

    @FXML
    private ImageView aboutImage;

    @FXML
    private TextArea crditsText;

    @FXML
    private Button creditsButton;

    @FXML
    private TextArea versionText;

    @FXML
    private ImageView bannerimg;

    @FXML
    void initialize() {

        versionText.setText("FIFA World Cup Management System");
        bannerimg.setVisible(false);
        creditsButton.setOnAction(event -> {
            crditsText.clear();
            aboutImage.setVisible(false);
            versionText.setVisible(false);
            crditsText.setVisible(true);
            bannerimg.setVisible(true);
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("Files/about.txt")));
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    crditsText.appendText(line + "\n");
                }
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });
        aboutButton.setOnAction(event -> {
            bannerimg.setVisible(false);
            aboutImage.setVisible(true);
            versionText.setVisible(true);
            crditsText.setVisible(false);
        });

    }


}


