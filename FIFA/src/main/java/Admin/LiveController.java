package Admin;

import User.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.*;
import java.net.Socket;

public class LiveController {
    public AnchorPane live;
    @FXML
    private TextField team1;
    @FXML
    private TextField team1Goal;
    @FXML
    private TextField team2;
    @FXML
    private TextField team2Goal;

    BufferedReader areader;
    BufferedWriter awriter;

    public LiveController() {

    }

    @FXML
    void start(ActionEvent event) {
        try {
            Socket sc = new Socket("localhost", 1234);
            OutputStreamWriter o = new OutputStreamWriter(sc.getOutputStream());
            awriter = new BufferedWriter(o);

            InputStreamReader isr = new InputStreamReader(sc.getInputStream());
            areader = new BufferedReader(isr);

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

    @FXML
    void update(ActionEvent event) {
        String s1 = team1.getText();
        String s2 = team1Goal.getText();
        String s3 = team2.getText();
        String s4 = team2Goal.getText();

        try {
            awriter.write("update\n");
            awriter.write(s1 + "\n");
            awriter.write(s2 + "\n");
            awriter.write(s3 + "\n");
            awriter.write(s4 + "\n");
            awriter.flush();

        } catch (IOException e) {

            e.printStackTrace();
        }

    }


    @FXML
    void stop(ActionEvent event) {

    }
    @FXML
    void LiveOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) live.getScene().getWindow();
        FXMLScene scene = FXMLScene.load("live.fxml");
        Parent root = scene.root;
        LiveController adc = (LiveController) scene.controller;
        stage.setScene(new Scene(root));
    }

    @FXML
    void aboutOnAction(ActionEvent event) {
        Us us = new Us();
        try {
            us.start(new Stage());
        } catch (Exception e) {
            System.out.println(e);
        }

    }



    @FXML
    void buyTicketOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) live.getScene().getWindow();
        Admin.FXMLScene scene = Admin.FXMLScene.load("AddTickets.fxml");
        Parent root = scene.root;
        AddTicketsController adc = (AddTicketsController) scene.controller;
        stage.setScene(new Scene(root));

    }

    @FXML
    void closeOnAction(ActionEvent event) {
        System.exit(0);

    }

    @FXML
    void feedOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) live.getScene().getWindow();
        Admin.FXMLScene scene = Admin.FXMLScene.load("adminProfile.fxml");
        Parent root = scene.root;
    }




    @FXML
    void logoutOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) live.getScene().getWindow();
        Admin.FXMLScene scene = Admin.FXMLScene.load("/User/Main.fxml");
        Parent root = scene.root;
        Login  l = (Login) scene.controller;
        stage.setScene(new Scene(root));
    }

    @FXML
    void mTreeOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) live.getScene().getWindow();
        Admin.FXMLScene scene = Admin.FXMLScene.load("MatchTree.fxml");
        Parent root = scene.root;
        MatchTreeController mtc = (MatchTreeController) scene.controller;
        stage.setScene(new Scene(root));
    }

    @FXML
    void pProfilesOnAction(ActionEvent event) throws IOException {
//        Stage stage = (Stage) live.getScene().getWindow();
//        FXMLScene scene = FXMLScene.load("");
//        Parent root = scene.root;
    }

    @FXML
    void profileOnAction(ActionEvent event) throws IOException {
        try {
            logs logs = new logs();
            logs.start(new Stage());
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    @FXML
    void refreshOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) live.getScene().getWindow();
        Admin.FXMLScene scene = FXMLScene.load("adminProfile.fxml");
        Parent root = scene.root;
        AdminProfileController adc = (AdminProfileController) scene.controller;
        stage.setScene(new Scene(root));
    }

}
