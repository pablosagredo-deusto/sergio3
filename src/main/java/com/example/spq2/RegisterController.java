package com.example.spq2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class RegisterController {
    @FXML
    private Button acceptButton;
    private Button exitButton;

    @FXML
    public void onExitButton(ActionEvent event) {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void onAcceptButton(ActionEvent event) {
            //CREATE USER WITH DATA AND SEND TO BACKEND -- PENDING
    }


}