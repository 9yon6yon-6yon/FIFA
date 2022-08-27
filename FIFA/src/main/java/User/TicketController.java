package User;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.*;

public class TicketController {
    @FXML
    private MenuItem aboutUs;

    @FXML
    private MenuItem buyTicket;

    @FXML
    private MenuItem checkBMI;

    @FXML
    private MenuItem close;

    @FXML
    private MenuItem feed;

    @FXML
    private MenuItem groupMatches;

    @FXML
    private MenuItem groups;

    @FXML
    private MenuItem howTo;

    @FXML
    private MenuItem logOut;

    @FXML
    private MenuItem liveMatch;

    @FXML
    private MenuItem matchScores;

    @FXML
    private MenuItem matchtree;

    @FXML
    private MenuItem pProfiles;

    @FXML
    private MenuItem profile;

    @FXML
    private MenuItem refresh;


    @FXML
    private Label buticketsLabel;
    @FXML
    private ImageView buyTo;

    @FXML
    private TextField codeText;

    @FXML
    private ImageView shoppingCart;

    @FXML
    private ListView<String> showavbMatches;

    @FXML
    private ListView<String> showavbTickets;

    @FXML
    private DatePicker ticketsDate;
    boolean bought = true;


    String path = "Files/availableMatch.txt";

    @FXML
    void initialize() {
        ticketsDate.getEditor().appendText("MM/DD/YYYY");
        ticketsDate.setOnAction(this::readFile);
        buyTo.setOnMouseClicked(mouseEvent -> {
            if(bought){
                try {
                    buyTo.setImage(new Image(new FileInputStream("Images/icons8-buy-done-100.png")));
                    TicketSubmitForm t =  new TicketSubmitForm();
                    TicketSubmitFormController tc = new TicketSubmitFormController();
                    Label l = new Label();
                    l.setText(codeText.getText());
                    tc.setTokenView(l);
                    Label l2 = new Label();
                    l2.setText("Argentina VS Brazil");
                    tc.setMatchTeams(l2);
                    t.start(new Stage());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                bought = false;

            }
            else{
                try {
                    buyTo.setImage(new Image(new FileInputStream("Images/icons8-buy-100.png")));
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
                bought = true;
            }

        });

    }

    private void readFile(ActionEvent actionEvent) {
        try {
            showavbMatches.getItems().clear();
            showavbTickets.getItems().clear();
            BufferedReader bf = new BufferedReader(new FileReader(path));
            String line;
            while ((line = bf.readLine()) != null) {
                String[] parts = line.split("___");
                if(parts[0].equals(String.valueOf(ticketsDate.getValue())))
                {
                    showavbMatches.getItems().add("\t\t"+parts[1]+"\t\t"+parts[2]);
                    showavbTickets.getItems().add( String.valueOf(parts[3]));
                }
            }
            bf.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
