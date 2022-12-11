package com.crittergestionfx.controller;

import com.crittergestionfx.model.objects.User;
import com.crittergestionfx.model.services.HashService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RegisterUserController implements Initializable {
    @FXML
    private Button cancelButton;

    @FXML
    private Label emailError;

    @FXML
    private TextField emailInput;

    @FXML
    private Label nameError;

    @FXML
    private TextField nameInput;

    @FXML
    private Label passwordError;

    @FXML
    private TextField passwordInput;

    @FXML
    private Button registerButton;

    @FXML
    private Label repeatPasswordError;

    @FXML
    private TextField repeatPasswordInput;

    private void loadScreen(ActionEvent event, String target) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(target));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    private void registerUser(){
        HashService hashService = new HashService();
        User user = new User(nameInput.getText(), emailInput.getText(), hashService.toHash(passwordInput.getText()));

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.cancelButton.setOnAction(actionEvent -> {
            try {
                loadScreen(actionEvent, "main-menu.fxml");

            }catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        this.registerButton.setOnAction(actionEvent-> {
        });
    }
}
