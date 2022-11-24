package com.crittergestionfx.controller;

import com.crittergestionfx.model.objects.User;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

public class ListUsersController {
    @FXML
    private Button backButton;

    @FXML
    private TableView<User> table;
}
