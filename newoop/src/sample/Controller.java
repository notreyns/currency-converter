package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Controller implements Initializable{

    @FXML
    private ComboBox box1;

    @FXML
    private ComboBox box2;

    @FXML
    private Label label;

    @FXML
    private TextField num;

    private Double result;

    private double value;

    @FXML
    public void actiondone(ActionEvent event) {
        Map toSom = new HashMap();
        toSom.put("Som", "1");
        toSom.put("Dol", "83.2");
        toSom.put("Euro", "101.413");
        toSom.put("Rub", "1.12");
        toSom.put("Uzb", "0.008");
        toSom.put("Tenge", "0.197");
        float fromBtn= Float.parseFloat((String) toSom.get(box1.getValue()));
        float toBtn= Float.parseFloat((String) toSom.get(box2.getValue()));
        try {
                float entryValue =  Float.parseFloat ((num.getText()));
                label.setText("Result: " + (entryValue * fromBtn) / toBtn);
        }catch (NumberFormatException e) {
            System.out.println("Invalid entry, please enter a number");
        }
        ;
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        num.setOnMouseClicked(ex -> num.selectAll());
        box1.getItems().addAll("Som",
                "Dol",
                "Euro",
                "Rub",
                "Uzb",
                "Tenge");
        box2.getItems().addAll("Som",
                "Dol",
                "Euro",
                "Rub",
                "Uzb",
                "Tenge");

    }
}
