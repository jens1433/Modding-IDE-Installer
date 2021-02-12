package io.github.railroadinstaller;

import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public TextField pathTextBox;
    public ProgressBar progressBar;
    public CheckBox desktopShortcutCheckBox;
    public CheckBox startMenuCheckBox;
    private Stage stage;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        progressBar.setVisible(false);
        pathTextBox.setText("C:\\Program Files (x86)\\Modding IDE\\");
        desktopShortcutCheckBox.fire();
        startMenuCheckBox.fire();
        this.stage = RailRoadInstaller.instance.getPrimaryStage();
    }

    public void browseButton_OnClick(MouseEvent mouseEvent) {
        DirectoryChooser directoryChooser = new DirectoryChooser();

        directoryChooser.setTitle("Choose install location");
        File dir = directoryChooser.showDialog(stage.getScene().getWindow());
        if(dir != null) {
            pathTextBox.setText(dir.getAbsolutePath() + "\\Modding IDE\\");
        }
    }

    public void installButton_OnClick(MouseEvent mouseEvent) {
        progressBar.setVisible(true);
    }
}
