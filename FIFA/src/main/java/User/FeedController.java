package User;

import Admin.Us;
import MatchDetails.Groups;
import MatchDetails.flags;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;

public class FeedController  {

    public AnchorPane FeedRoot;
    @FXML
    private Button button;
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
    private TextField inputField;

    @FXML
    private TextArea showArea;


    @FXML
    private ChoiceBox<String> countryNames;

    @FXML
    private Label team1;

    @FXML
    private ImageView team1img;

    @FXML
    private Label team2;

    @FXML
    private ImageView team2img;

    @FXML
    private Label team3;

    @FXML
    private ImageView team3img;

    final String[] countries = Groups.countries;


    @FXML
    void initialize() {
        countryNames.getItems().addAll(countries);

    }


    @FXML
    void team1(ActionEvent event) {

        String nameOfCountry = countryNames.getValue();
        if (nameOfCountry.equals(countries[0])) {
            team1img.setImage(flags.Qatar);
            team1.setText(nameOfCountry);
        }

        if (nameOfCountry.equals(countries[1])) {
            team1img.setImage(flags.Ecuador);
            team1.setText(nameOfCountry);



        }
        if (nameOfCountry.equals(countries[2])) {

            team1img.setImage(flags.Senegal);
           team1.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[3])) {

            team1img.setImage(flags.Netherlands);
          team1.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[4])) {
           team1img.setImage(flags.England);
            team1.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[5])) {
            team1img.setImage(flags.Iran);
        team1.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[6])) {
            team1img.setImage(flags.USA);
            team1.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[7])) {
            team1img.setImage(flags.Wales);
          team1.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[8])) {
           team1img.setImage(flags.Argentina);
            team1.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[9])) {
            team1img.setImage(flags.SaudiArabia);
           team1.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[10])) {
            team1img.setImage(flags.Mexico);
          team1.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[11])) {
           team1img.setImage(flags.Poland);
            team1.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[12])) {
            team1img.setImage(flags.France);
        team1.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[13])) {
            team1img.setImage(flags.Australia);
           team1.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[14])) {
            team1img.setImage(flags.Denmark);
           team1.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[15])) {
           team1img.setImage(flags.Tunisia);
         team1.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[16])) {
            team1img.setImage(flags.Spain);
            team1.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[17])) {
          team1img.setImage(flags.CostaRica);
           team1.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[18])) {
            team1img.setImage(flags.Germany);
            team1.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[19])) {
            team1img.setImage(flags.Japan);
            team1.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[20])) {
            team1img.setImage(flags.Belgium);
          team1.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[21])) {
            team1img.setImage(flags.Canada);
            team1.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[22])) {
            team1img.setImage(flags.Morocco);
            team1.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[23])) {
            team1img.setImage(flags.Croatia);
            team1.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[24])) {
           team1img.setImage(flags.Brazil);
            team1.setText(nameOfCountry);

        }

        if (nameOfCountry.equals(countries[25])) {
          team1img.setImage(flags.Serbia);
           team1.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[26])) {
            team1img.setImage(flags.Switzerland);
          team1.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[27])) {
            team1img.setImage(flags.Cameroon);
           team1.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[28])) {
            team1img.setImage(flags.Portugal);
         team1.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[29])) {
            team1img.setImage(flags.Ghana);
           team1.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[30])) {
           team1img.setImage(flags.Uruguay);
           team1.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[31])) {
          team1img.setImage(flags.SouthKorea);
          team1.setText(nameOfCountry);

        }


    }

    @FXML
    void team2(ActionEvent event) {

        String nameOfCountry = countryNames.getValue();
        if (nameOfCountry.equals(countries[0])) {
            team2img.setImage(flags.Qatar);
            team2.setText(nameOfCountry);
        }

        if (nameOfCountry.equals(countries[1])) {
            team2img.setImage(flags.Ecuador);
            team2.setText(nameOfCountry);



        }
        if (nameOfCountry.equals(countries[2])) {

            team2img.setImage(flags.Senegal);
            team2.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[3])) {

            team2img.setImage(flags.Netherlands);
            team2.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[4])) {
            team2img.setImage(flags.England);
            team2.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[5])) {
            team2img.setImage(flags.Iran);
            team2.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[6])) {
            team2img.setImage(flags.USA);
            team2.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[7])) {
            team2img.setImage(flags.Wales);
            team2.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[8])) {
            team2img.setImage(flags.Argentina);
            team2.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[9])) {
            team2img.setImage(flags.SaudiArabia);
            team2.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[10])) {
            team2img.setImage(flags.Mexico);
            team2.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[11])) {
            team2img.setImage(flags.Poland);
            team2.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[12])) {
            team2img.setImage(flags.France);
            team2.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[13])) {
            team2img.setImage(flags.Australia);
            team2.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[14])) {
            team2img.setImage(flags.Denmark);
            team2.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[15])) {
            team2img.setImage(flags.Tunisia);
            team2.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[16])) {
            team2img.setImage(flags.Spain);
            team2.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[17])) {
            team2img.setImage(flags.CostaRica);
            team2.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[18])) {
            team2img.setImage(flags.Germany);
            team2.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[19])) {
            team2img.setImage(flags.Japan);
            team2.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[20])) {
            team2img.setImage(flags.Belgium);
            team2.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[21])) {
            team2img.setImage(flags.Canada);
            team2.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[22])) {
            team2img.setImage(flags.Morocco);
            team2.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[23])) {
            team2img.setImage(flags.Croatia);
            team2.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[24])) {
            team2img.setImage(flags.Brazil);
            team2.setText(nameOfCountry);

        }

        if (nameOfCountry.equals(countries[25])) {
            team2img.setImage(flags.Serbia);
            team2.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[26])) {
            team2img.setImage(flags.Switzerland);
            team2.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[27])) {
            team2img.setImage(flags.Cameroon);
            team2.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[28])) {
            team2img.setImage(flags.Portugal);
            team2.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[29])) {
            team2img.setImage(flags.Ghana);
            team2.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[30])) {
            team2img.setImage(flags.Uruguay);
            team2.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[31])) {
            team2img.setImage(flags.SouthKorea);
            team2.setText(nameOfCountry);

        }



    }

    @FXML
    void team3(ActionEvent event) {
        String nameOfCountry = countryNames.getValue();
        if (nameOfCountry.equals(countries[0])) {
            team3img.setImage(flags.Qatar);
            team3.setText(nameOfCountry);
        }

        if (nameOfCountry.equals(countries[1])) {
            team3img.setImage(flags.Ecuador);
            team3.setText(nameOfCountry);



        }
        if (nameOfCountry.equals(countries[2])) {

            team3img.setImage(flags.Senegal);
            team3.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[3])) {

            team3img.setImage(flags.Netherlands);
            team3.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[4])) {
            team3img.setImage(flags.England);
            team3.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[5])) {
            team3img.setImage(flags.Iran);
            team3.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[6])) {
            team3img.setImage(flags.USA);
            team3.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[7])) {
            team3img.setImage(flags.Wales);
            team3.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[8])) {
            team3img.setImage(flags.Argentina);
            team3.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[9])) {
            team3img.setImage(flags.SaudiArabia);
            team3.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[10])) {
            team3img.setImage(flags.Mexico);
            team3.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[11])) {
            team3img.setImage(flags.Poland);
            team3.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[12])) {
            team3img.setImage(flags.France);
            team3.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[13])) {
            team3img.setImage(flags.Australia);
            team3.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[14])) {
            team3img.setImage(flags.Denmark);
            team3.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[15])) {
            team3img.setImage(flags.Tunisia);
            team3.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[16])) {
            team3img.setImage(flags.Spain);
            team3.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[17])) {
            team3img.setImage(flags.CostaRica);
            team3.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[18])) {
            team3img.setImage(flags.Germany);
            team3.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[19])) {
            team3img.setImage(flags.Japan);
            team3.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[20])) {
            team3img.setImage(flags.Belgium);
            team3.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[21])) {
            team3img.setImage(flags.Canada);
            team3.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[22])) {
            team3img.setImage(flags.Morocco);
            team3.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[23])) {
            team3img.setImage(flags.Croatia);
            team3.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[24])) {
            team3img.setImage(flags.Brazil);
            team3.setText(nameOfCountry);

        }

        if (nameOfCountry.equals(countries[25])) {
            team3img.setImage(flags.Serbia);
            team3.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[26])) {
            team3img.setImage(flags.Switzerland);
            team3.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[27])) {
            team3img.setImage(flags.Cameroon);
            team3.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[28])) {
            team3img.setImage(flags.Portugal);
            team3.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[29])) {
            team3img.setImage(flags.Ghana);
            team3.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[30])) {
            team3img.setImage(flags.Uruguay);
            team3.setText(nameOfCountry);

        }
        if (nameOfCountry.equals(countries[31])) {
            team3img.setImage(flags.SouthKorea);
            team3.setText(nameOfCountry);

        }

    }


    @FXML
    void closeOnAction(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void feedOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Feed.fxml");
        Parent root = scene.root;
        FeedController feed = (FeedController) scene.controller;
        mainStage.setScene(new Scene(root));


    }

    @FXML
    void logoutOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Main.fxml");
        Parent root = scene.root;
        Login login = (Login) scene.controller;
        mainStage.setScene(new Scene(root));


    }

    @FXML
    void refreshOnAction(ActionEvent event) {

    }

    @FXML
    void LiveOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Feed.fxml");
        Parent root = scene.root;
        FeedController feed = (FeedController) scene.controller;
        mainStage.setScene(new Scene(root));//need to add new live fxml here
    }

    @FXML
    void aboutOnAction(ActionEvent event)  {
        Us us = new Us();
        try {
            us.start(new Stage());
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @FXML
    void buyTicketOnAction(ActionEvent event) throws IOException {

        Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Ticket.fxml");
        Parent root = scene.root;
        TicketController tc = (TicketController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void checkBMIOnAction(ActionEvent event) throws IOException {

        Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("BMI.fxml");
        Parent root = scene.root;
        BMIController bmi = (BMIController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void gMatchesOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Matches.fxml");
        Parent root = scene.root;
        MatchesController mc = (MatchesController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void groupsOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Teams.fxml");
        Parent root = scene.root;
        TeamsController tc = (TeamsController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void howToOnAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage)  FeedRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("HowTo.fxml");
        Parent root = scene.root;
        HowToController tc = (HowToController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void mTreeOnAction(ActionEvent event) throws IOException {


        Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("UserMatchTree.fxml");
        Parent root = scene.root;
        UserMatchTreeController um = (UserMatchTreeController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void matchScoreOnAction(ActionEvent event) throws IOException {



       Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Feed.fxml");
        Parent root = scene.root;
        FeedController feed = (FeedController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void pProfilesOnAction(ActionEvent event) throws IOException {







        Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("Player.fxml");
        Parent root = scene.root;
        PlayerController pc = (PlayerController) scene.controller;
        mainStage.setScene(new Scene(root));
    }

    @FXML
    void profileOnAction(ActionEvent event) throws IOException {





        Stage mainStage = (Stage) FeedRoot.getScene().getWindow(); // then cast to stage to get the window
        FXMLScene scene = FXMLScene.load("profile-view.fxml");
        Parent root = scene.root;
        ProfileController pc = (ProfileController) scene.controller;
        mainStage.setScene(new Scene(root));

    }

    boolean isConnected=false;
    BufferedReader reader;
    BufferedWriter writer;
    @FXML
    void buttonPressed(ActionEvent event) {

        if(!isConnected){

            String inputName=inputField.getText();

            if(inputName==null || inputName.length()==0){

                showArea.appendText("Enter a valid name!\n");
                return;
            }

            try{
                Socket sc= new Socket("127.0.0.1",33333);

                OutputStreamWriter o= new OutputStreamWriter(sc.getOutputStream());
                writer=new BufferedWriter(o);

                writer.write(inputName+"\n");
                writer.flush();

                InputStreamReader isr=new InputStreamReader(sc.getInputStream());
                reader=new BufferedReader(isr);

                Thread serverListener= new Thread(){

                  @Override
                    public void run(){

                      while(true){

                          try{

                              String data=reader.readLine()+"\n";
                              showArea.appendText(data);


                          }

                          catch (SocketException e){

                              showArea.appendText("Connection lost!\n");
                              break;
                          }

                          catch (IOException e){

                             e.printStackTrace();

                          }



                      }



                  }




                };
              serverListener.start();
              showArea.appendText("Connection established!\n");

              button.setText("Send");
              inputField.clear();
              inputField.setPromptText("Write your message");
              showArea.clear();
              isConnected=true;



            }

            catch (IOException e){


                e.printStackTrace();

            }


        }

        else {


            try{

                String msg=inputField.getText();
                inputField.clear();
                if(msg==null||msg.length()==0){
                    return;
                }

                writer.write(msg+"\n");
                writer.flush();



            }

            catch (IOException e){

                e.printStackTrace();

            }
        }



    }

}
