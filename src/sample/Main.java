package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Main
        //Parent root = FXMLLoader.load(getClass().getResource("../view/mainLogin.fxml"));
        //Admin after login
        Parent root = FXMLLoader.load(getClass().getResource("../view/Admin.fxml"));
        // Admin Employee
       // Parent root = FXMLLoader.load(getClass().getResource("../view/adminEmployeeTab.fxml"));
        primaryStage.setTitle("Pharmacy Management ");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
