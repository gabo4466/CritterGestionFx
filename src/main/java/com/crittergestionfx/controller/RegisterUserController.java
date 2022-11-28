package com.crittergestionfx.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RegisterUserController {
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
}
