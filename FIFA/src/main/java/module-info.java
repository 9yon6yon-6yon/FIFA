module com.example.fifa {
    requires javafx.controls;
    requires javafx.fxml;
    requires commons;
    requires font.asian;
    requires forms;
    requires hyph;
    requires io;
    requires kernel;
    requires layout;
    requires pdfa;
    requires sign;
    requires styled.xml.parser;
    requires svg;
    requires barcodes;
    requires org.slf4j;


    opens playerProfiles to javafx.fxml;
    exports playerProfiles;
    opens Admin to javafx.fxml;
    exports Admin;
    opens LoginUI to javafx.fxml;
    exports BMI to javafx.fxml ;
    opens  BMI ;
    exports LoginUI;
    opens User to javafx.fxml;
    exports User;
    opens MatchDetails to javafx.fxml;
    exports MatchDetails;


}