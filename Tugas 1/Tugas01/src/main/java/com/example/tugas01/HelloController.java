package com.example.tugas01;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    public TextField bil_1;
    public TextField bil_2;
    public TextField result;
    public Button plus;
    public Button min;
    public Button multiple;
    public Button divide;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    protected void operatorAction(ActionEvent event) {
        Double bil1 = Double.parseDouble(bil_1.getText());
        Double bil2 = Double.parseDouble(bil_2.getText());

        double HitungHasil = 0;

        if (event.getSource() == plus) {
            HitungHasil = bil1 + bil2;
            result.setText(Double.toString(HitungHasil));
        }
        if (event.getSource() == min) {
            HitungHasil = bil1 - bil2;
            result.setText(Double.toString(HitungHasil));
        }
        if (event.getSource() == multiple) {
            HitungHasil = bil1 * bil2;
            result.setText(Double.toString(HitungHasil));
        }
        if (event.getSource() == divide) {
            HitungHasil = bil1 / bil2;
            result.setText(Double.toString(HitungHasil));
        }
    }

    ;
}