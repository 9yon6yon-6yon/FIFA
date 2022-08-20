module com.example.fifa {
    requires javafx.controls;
    requires javafx.fxml;


    opens playerProfiles to javafx.fxml;
    exports playerProfiles;
    opens Admin to javafx.fxml;
    exports Admin;
    opens LoginUI to javafx.fxml;
    exports LoginUI;
    opens User to javafx.fxml;
    exports User;
    opens MatchDetails to javafx.fxml;
    exports MatchDetails;


}