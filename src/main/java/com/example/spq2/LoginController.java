package com.example.spq2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;


import java.io.IOException;


public class LoginController {
    @FXML
    public Label invalidLogin;
    @FXML
    private Button registerButton;
    @FXML
    public Button loginButton;
    @FXML
    public TextField UsernameTextField;
    @FXML
    public PasswordField PasswordTextField;

    @FXML
    public void onLoginButton(ActionEvent event) {
        if (!UsernameTextField.getText().isBlank() && !PasswordTextField.getText().isBlank()){
            invalidLogin.setText("Trying to log in");
            //CHECK IF LOGIN IS CORRECT AND LAUNCH CATALOG UI
        }else{
            invalidLogin.setText("Please enter username and password");
        }

    }

    @FXML
    public void onRegisterButton(ActionEvent event) throws IOException {
        Stage stage = (Stage) registerButton.getScene().getWindow();
        stage.close();

        //NEW REGISTER WINDOW
        FXMLLoader fxmlLoader = new FXMLLoader(LoginApplication.class.getResource("register.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 520, 400);
        stage.setTitle("Register");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();

    }



}