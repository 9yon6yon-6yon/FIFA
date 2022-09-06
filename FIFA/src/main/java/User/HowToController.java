package User;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.IOException;

public class HowToController {
    @FXML
    private MenuItem close;

    @FXML
    private MenuItem contributors;

    @FXML
    private MenuItem feed;

    @FXML
    private WebView gitPage;

    @FXML
    private AnchorPane howTo;

    @FXML
    private MenuItem logOut;

    @FXML
    private MenuItem mempage;

    @FXML
    private MenuItem netpage;

    @FXML
    private MenuItem refresh;

    @FXML
    private MenuItem wikipage;


    final private static String[] urls = new String[]{
            "https://github.com/9yon6yon-6yon/FIFA",
            "https://github.com/9yon6yon-6yon/FIFA/wiki",
            "https://github.com/9yon6yon-6yon/FIFA/network",
            "https://github.com/9yon6yon-6yon/FIFA/network/members",
            "https://github.com/9yon6yon-6yon/FIFA/graphs/contributors"
    };


    @FXML
    void closeOnAction(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void feedOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) howTo.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Feed.fxml");
        Parent root = scene.root;
        FeedController feed = (FeedController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void logoutOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) howTo.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Main.fxml");
        Parent root = scene.root;
        Login login = (Login) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void initialize() {
        WebEngine www = gitPage.getEngine();
        www.load(urls[0]);
        refresh.setOnAction(event -> www.load(urls[0]));
        wikipage.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                www.load(urls[1]);

            }
        });
        netpage.setOnAction(event -> www.load(urls[2]));
        mempage.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                www.load(urls[3]);

            }
        });
        contributors.setOnAction(event -> www.load(urls[4]));

    }
}
