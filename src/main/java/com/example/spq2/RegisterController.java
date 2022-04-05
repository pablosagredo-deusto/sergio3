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


public class RegisterController {
    @FXML
    private Button acceptButton;
    @FXML
    private Button exitButton;

    @FXML
    public void onExitButton(ActionEvent event) throws IOException {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(LoginApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Login prueba");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }



    @FXML
    public void onAcceptButton(ActionEvent event) {
        //SEND RGISTER FORM
        System.out.println("");
        //CREATE USER WITH DATA AND SEND TO BACKEND -- PENDING
    }


}