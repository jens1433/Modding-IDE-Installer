package io.github.railroadinstaller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RailRoadInstaller extends Application {

    private Scene mainScene;
    private Stage primaryStage;
    public static RailRoadInstaller instance;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        instance = this;
        this.primaryStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("main.fxml"));
        this.mainScene = new Scene(root,600,400);
        primaryStage.setTitle("Railroad Installer");
        primaryStage.setScene(this.mainScene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public Stage getPrimaryStage() {
        return this.primaryStage;
    }

}
