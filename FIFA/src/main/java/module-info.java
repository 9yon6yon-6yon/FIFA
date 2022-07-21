module com.example.fifa {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fifa to javafx.fxml;
    exports com.example.fifa;
    opens playerProfiles to javafx.fxml;
    exports playerProfiles;
    opens About to javafx.fxml;
    exports  About;
}