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
        if (UsernameTextField.getText().isBlank() == false && PasswordTextField.getText().isBlank() == false){
            invalidLogin.setText("Trying to log in");
            //checklogin in backend launch catalog interface
        }else{
            invalidLogin.setText("Please enter username and password");
        }

    }

    @FXML
    public void onRegisterButton(ActionEvent event) {
        Stage stage = (Stage) registerButton.getScene().getWindow();
        stage.close();
    }


}