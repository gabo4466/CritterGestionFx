package com.crittergestionfx.controller;

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

public class LogInController implements Initializable {
    @FXML
    private Button buttonLogIn;

    @FXML
    private TextField fieldEmail;

    @FXML
    private TextField fieldPassword;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        buttonLogIn.setOnAction(actionEvent -> {
            try {
                loadMenu(actionEvent);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    private void loadMenu(ActionEvent event) throws IOException {
        Stage stage;
        Scene scene;
        Parent root;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main-menu.fxml"));
        root = fxmlLoader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        MainMenuController controller = fxmlLoader.getController();
        controller.initData("");
        stage.setScene(scene);
        stage.show();
    }
}