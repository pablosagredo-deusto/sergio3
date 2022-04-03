package com.example.spq2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class ProfileController {
    @FXML
    public Label nameInfo;
    public Label lastnameInfo;
    public Label phoneInfo;
    public Label addressInfo;
    public Label cpInfo;
    @FXML
    private Button backButton;



    @FXML
    public void onBackButton(ActionEvent event) throws IOException {
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.close();
        //PENDING GO BACK TO CATALOG

    }



}