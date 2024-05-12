package com.example;

import javafx.application.Application;
import javafx.scene.control.*;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Hello, JavaFX!");
        MenuButton menuButton = new MenuButton("Options");
        MenuItem item1 = new MenuItem("Item 1");
        MenuItem item2 = new MenuItem("Item 2");
        MenuItem item3 = new MenuItem("Item 3");
        menuButton.getItems().addAll(item1, item2, item3);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}