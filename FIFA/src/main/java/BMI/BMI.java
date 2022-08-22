package BMI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.util.Objects;

public class BMI extends Application {
    private Stage stage ;

    @Override
    public void start(Stage stage) throws Exception {

        this.stage = stage;
//
//
//        VBox vBox = new VBox(10);
//
//        Label IblTitle = new Label("BMI Calculator");
//        IblTitle.setFont(Font.font(18));
//        vBox.getChildren().add(IblTitle);
//
//
//        vBox.getChildren().add(new Label("Your mass (kg):"));
//        vBox.getChildren().add(txtMass);
//
//        vBox.getChildren().add(new Label("Your height (cm):"));
//        vBox.getChildren().add(txtHeight);
//
//        vBox.getChildren().add(btnCalc);
//

//        btnCalc.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent) {
//                double mass;
//                double height;
//                try {
//                    mass = Double.parseDouble(txtMass.getText());
//                    height = Double.parseDouble(txtHeight.getText());
//                }
//                catch (NumberFormatException e){
//                    showMessage("Check your input.", "Error in number input");
//                    return;
//                }
//                double result = calculateBMI(mass,height);
//                showMessage("Your BMI is: " +(Math.round(result*100.0) / 100.0), "Your BMI result");
//            }
//        });
        Parent root = FXMLLoader.load(Objects.requireNonNull(BMI.class.getResource("BMI.fxml")));
        Scene scene = new Scene(root,900,600);
        stage.setTitle("BMI");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();



    }
    protected double calculateBMI(double mass, double height){
        return mass / Math.pow(height / 100.0,2.0);
    }

    public static void main(String[] args) {
       launch(args);
    }

    public void showMessage(final String message){
        final Stage dialog = new Stage(StageStyle.UTILITY);
        dialog.setWidth(500);
        dialog.setHeight(250);
        dialog.initModality(Modality.WINDOW_MODAL);
        dialog.initOwner(this.stage);


        VBox vBox = new VBox(2);
        HBox pane = new HBox(10);

        dialog.setScene(new Scene(vBox));
        vBox.setAlignment(Pos.CENTER);

        vBox.getChildren().add(pane);
        pane.getChildren().add(new Label(message));
        Button btn = new Button("OK");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                dialog.close();

            }
        });
        pane.getChildren().add(btn);
        dialog.showAndWait();



    }

}
