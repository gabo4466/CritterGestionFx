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

    public Scene loadScene(ActionEvent event, String nameFXML) throws IOException {
        Parent root;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(nameFXML));
        root = fxmlLoader.load();
        return new Scene(root);
    }

}
