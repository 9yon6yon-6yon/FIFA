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
    requires javafx.web;


    opens Admin to javafx.fxml;
    exports Admin;
    opens User to javafx.fxml;
    exports User;


}