package BuyTicket;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import About.Us;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import sample.Main;

public class TicketController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label buticketsLabel;

    @FXML
    private ImageView buyCart1;

    @FXML
    private ImageView buyCart2;

    @FXML
    private ImageView buyCart3;

    @FXML
    private ImageView buyCart4;

    @FXML
    private ImageView buyCart5;

    @FXML
    private ImageView buyCart6;

    @FXML
    private ImageView buyCart7;

    @FXML
    private ImageView buyCart8;

    @FXML
    private MenuItem logOut;

    @FXML
    private MenuBar menubar;

    @FXML
    private ImageView shoppingCart;

    @FXML
    private DatePicker ticketsDate;

    @FXML
    void initialize() {
    }


    @FXML
    void aboutClicked(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(Us.class.getResource("Us.fxml")));
        stage.setTitle("About");
        stage.setScene(new javafx.scene.Scene(root));
        stage.show();

    }

    @FXML
    void onLogOutClicked(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource("sample.fxml")));
        stage.setScene(new javafx.scene.Scene(root));
        stage.show();


    }

    @FXML
    void exitClicked(ActionEvent event) {
        System.exit(0);

    }


}
