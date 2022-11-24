package com.crittergestionfx.model.services;


import com.crittergestionfx.controller.MainMenuController;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

@Deprecated
public class SceneManagerService {

    public static SceneManagerService instance = null;

    private SceneManagerService(){
    }

    public static SceneManagerService getInstance() {
        if (instance == null){
            instance = new SceneManagerService();
        }
        return instance;
    }

    private void loadScene(ActionEvent event) throws IOException {
        Stage stage;
        Scene scene;
        Parent root;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main-menu.fxml"));
        root = fxmlLoader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        MainMenuController controller = fxmlLoader.getController();
        //controller.initData("");
        stage.setScene(scene);
        stage.show();
    }

}
