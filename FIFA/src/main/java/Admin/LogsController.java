package Admin;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LogsController {

    @FXML
    private TextArea logsText;

    @FXML
    void initialize() {
        try {
            logsText.clear();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("Files/logs.txt")));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                logsText.appendText(line + "\n");
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
