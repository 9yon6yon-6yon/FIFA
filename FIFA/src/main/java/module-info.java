module com.example.fifa {
    requires javafx.controls;
    requires javafx.fxml;


    opens playerProfiles to javafx.fxml;
    exports playerProfiles;
    opens Admin.About to javafx.fxml;
    exports Admin.About;
    opens LoginUI to javafx.fxml;
    exports LoginUI;
    opens User.BMI to javafx.fxml;
    exports User.BMI;
    exports User;
    opens User to javafx.fxml;

}