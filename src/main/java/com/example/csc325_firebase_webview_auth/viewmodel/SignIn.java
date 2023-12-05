package com.example.csc325_firebase_webview_auth.viewmodel;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class SignIn {

    @FXML
    private TextField emailField;
    @FXML
    private PasswordField passwordField;

    @FXML
    private void handleSignIn(ActionEvent event) {

        String email = emailField.getText();
        String password = passwordField.getText();

        if (email.equals("user@example.com") && password.equals("password")) {

            System.out.println("Login successful.");
        } else {

            System.out.println("Login failed.");
        }
    }

    @FXML
    private void switchToSignUp(ActionEvent event) {
        try {

            Parent signUpRoot = FXMLLoader.load(getClass().getResource("SignUp.fxml"));

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stage.setScene(new Scene(signUpRoot, 600, 400));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}