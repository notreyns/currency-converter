package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.NumberAxis;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        primaryStage.setTitle("Currency Converter");
        Scene scene = new Scene(root, 595, 300);
        primaryStage.setScene(scene);
        scene.getStylesheets().add("sample/back.css");

        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
