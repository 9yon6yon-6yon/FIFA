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

public class AddTicketsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView addTicket1;

    @FXML
    private ImageView addTicket16;

    @FXML
    private ImageView addTicket2;

    @FXML
    private ImageView addTicket3;

    @FXML
    private ImageView addTicket4;

    @FXML
    private ImageView addTicket5;

    @FXML
    private ImageView addTicket7;

    @FXML
    private ImageView addTicket8;

    @FXML
    private Label buticketsLabel;

    @FXML
    private MenuItem logOut;

    @FXML
    private MenuBar menubar;

    @FXML
    private ImageView reductTicket1;

    @FXML
    private ImageView reductTicket2;

    @FXML
    private ImageView reductTicket3;

    @FXML
    private ImageView reductTicket4;

    @FXML
    private ImageView reductTicket5;

    @FXML
    private ImageView reductTicket6;

    @FXML
    private ImageView reductTicket7;

    @FXML
    private ImageView reductTicket8;

    @FXML
    private ImageView shoppingCart;

    @FXML
    private DatePicker ticketsDate;


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

    @FXML
    void initialize() {
        assert addTicket1 != null : "fx:id=\"addTicket1\" was not injected: check your FXML file 'AddTickets.fxml'.";
        assert addTicket16 != null : "fx:id=\"addTicket16\" was not injected: check your FXML file 'AddTickets.fxml'.";
        assert addTicket2 != null : "fx:id=\"addTicket2\" was not injected: check your FXML file 'AddTickets.fxml'.";
        assert addTicket3 != null : "fx:id=\"addTicket3\" was not injected: check your FXML file 'AddTickets.fxml'.";
        assert addTicket4 != null : "fx:id=\"addTicket4\" was not injected: check your FXML file 'AddTickets.fxml'.";
        assert addTicket5 != null : "fx:id=\"addTicket5\" was not injected: check your FXML file 'AddTickets.fxml'.";
        assert addTicket7 != null : "fx:id=\"addTicket7\" was not injected: check your FXML file 'AddTickets.fxml'.";
        assert addTicket8 != null : "fx:id=\"addTicket8\" was not injected: check your FXML file 'AddTickets.fxml'.";
        assert buticketsLabel != null : "fx:id=\"buticketsLabel\" was not injected: check your FXML file 'AddTickets.fxml'.";
        assert logOut != null : "fx:id=\"logOut\" was not injected: check your FXML file 'AddTickets.fxml'.";
        assert menubar != null : "fx:id=\"menubar\" was not injected: check your FXML file 'AddTickets.fxml'.";
        assert reductTicket1 != null : "fx:id=\"reductTicket1\" was not injected: check your FXML file 'AddTickets.fxml'.";
        assert reductTicket2 != null : "fx:id=\"reductTicket2\" was not injected: check your FXML file 'AddTickets.fxml'.";
        assert reductTicket3 != null : "fx:id=\"reductTicket3\" was not injected: check your FXML file 'AddTickets.fxml'.";
        assert reductTicket4 != null : "fx:id=\"reductTicket4\" was not injected: check your FXML file 'AddTickets.fxml'.";
        assert reductTicket5 != null : "fx:id=\"reductTicket5\" was not injected: check your FXML file 'AddTickets.fxml'.";
        assert reductTicket6 != null : "fx:id=\"reductTicket6\" was not injected: check your FXML file 'AddTickets.fxml'.";
        assert reductTicket7 != null : "fx:id=\"reductTicket7\" was not injected: check your FXML file 'AddTickets.fxml'.";
        assert reductTicket8 != null : "fx:id=\"reductTicket8\" was not injected: check your FXML file 'AddTickets.fxml'.";
        assert shoppingCart != null : "fx:id=\"shoppingCart\" was not injected: check your FXML file 'AddTickets.fxml'.";
        assert ticketsDate != null : "fx:id=\"ticketsDate\" was not injected: check your FXML file 'AddTickets.fxml'.";

    }

}
