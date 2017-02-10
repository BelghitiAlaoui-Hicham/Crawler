package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.stage.Stage;
import javafx.scene.text.*;

public class Main extends Application {

    @FXML
    private ImageView logo;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        Scene s = new Scene(root, 500, 500);
        this.logo = new ImageView(new Image(getClass().getResource("logo.png").toExternalForm()));
        s.getStylesheets().addAll();
        primaryStage.setScene(s);
        primaryStage.setResizable(false);

        primaryStage.show();
    }


    public static void main(String[] args) {

        launch(args);


    }
}
