package com.example.csc325_firebase_webview_auth.viewmodel;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SignUp {

    @FXML
    private void handleSignUp() {

    }

    @FXML
    private void switchToSignIn(javafx.event.ActionEvent event) {
        try {

            Parent signInRoot = FXMLLoader.load(getClass().getResource("SignIn.fxml"));

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stage.setScene(new Scene(signInRoot, 600, 400));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
