module com.example.fifa {
    requires javafx.controls;
    requires javafx.fxml;


    opens playerProfiles to javafx.fxml;
    exports playerProfiles;
    opens About to javafx.fxml;
    exports  About;
    opens sample to javafx.fxml;
    exports sample;

}