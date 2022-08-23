package Admin;

import java.io.*;;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

public class AddTicketsController {

    @FXML
    private Button addButton;

    @FXML
    private ImageView addTicket1;

    @FXML
    private Label avbtk1;

    @FXML
    private Label buticketsLabel;

    @FXML
    private ImageView reductTicket1;

    @FXML
    private ImageView refresh;

    @FXML
    private ImageView searchImg;

    @FXML
    private TextField searchTokenField;

    @FXML
    private TextField setMatch1;

    @FXML
    private ImageView shoppingCart;

    @FXML
    private DatePicker ticketsDate;
    @FXML
    private Button editing;

    @FXML
    private ListView<String> showMatchesfromFile;
    String path = "Files/availableMatch.txt";
    int a = 0;
    String token;
    boolean edit = false;

    @FXML
    void initialize() {
        editing.setVisible(false);
        searchTokenField.setVisible(false);
        ticketsDate.getEditor().appendText("9/20/2022");
        ticketsDate.setOnAction(this::readFile);
        addButton.setOnAction(this::writeFile);
        reductTicket1.setOnMouseClicked(mouseEvent -> {
            a--;
            if (a <= 0) a = 0;
            avbtk1.setText(String.valueOf(a));
        });

        addTicket1.setOnMouseClicked(mouseEvent -> {
            a++;
            avbtk1.setText(String.valueOf(a));
        });
        searchImg.setOnMouseClicked(mouseEvent -> {
            edit = true;
            addButton.setVisible(false);
            searchTokenField.setVisible(true);
            editing.setVisible(true);
            token = searchTokenField.getText();
        });
        refresh.setOnMouseClicked(mouseEvent -> {
            setMatch1.setText("");
        });
        editing.setOnAction(this::editFile);
    }

    private void readFile(ActionEvent actionEvent) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
            showMatchesfromFile.getItems().clear();
            BufferedReader bf = new BufferedReader(new FileReader(path));
            String line;
            while ((line = bf.readLine()) != null) {
                String[] parts = line.split("___");
                if (parts[0].equals(String.valueOf(ticketsDate.getValue()))) {
                    showMatchesfromFile.getItems().add(parts[0] + "\t\t\t" + parts[1] + "\t\t\t" + parts[2] + "\t\t\t" + parts[3]);
                }
            }
            bf.close();
            bw.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void writeFile(ActionEvent actionEvent) {
        try {
            Randomtokens randomtokens = new Randomtokens();
            BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
            if(edit) {
                bw.append(String.valueOf(ticketsDate.getValue())).append("___")
                        .append(setMatch1.getText()).append("___").append(token)
                        .append("___").append(avbtk1.getText()).append("\n");

            }else  {
                bw.append(String.valueOf(ticketsDate.getValue())).append("___")
                        .append(setMatch1.getText()).append("___").append(randomtokens.getAlphaNumericString())
                        .append("___").append(avbtk1.getText()).append("\n");
            }
            bw.close();
            setMatch1.setText("");
            avbtk1.setText("");
            a = 0;
            edit = false;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void editFile(ActionEvent actionEvent) {
        try {
            String t = "Files/temp.txt";
            File temp = new File(t);
            BufferedReader bf = new BufferedReader(new FileReader(path));
            BufferedWriter bw = new BufferedWriter(new FileWriter(temp, true));
            String line;
            while ((line = bf.readLine()) != null) {
                String[] parts = line.split("___");
                if (token.equals(parts[2])) {
                    bw.append(String.valueOf(ticketsDate.getValue())).append("___").append(setMatch1.getText()).append("___").append(token).append("___").append(avbtk1.getText()).append("\n");
                }
                bw.append(line).append("\n");
            }
            bf.close();
            bw.close();
            temp.renameTo(new File(path));
            searchTokenField.setText("");
            setMatch1.setText("");
            avbtk1.setText("");
            addButton.setVisible(true);
            edit = false;
            token = null;
            editing.setVisible(false);
            searchTokenField.setVisible(false);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
