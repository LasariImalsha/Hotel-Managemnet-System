package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class FrontPageFormController {
    public Label lblCaption1;
    public Label lblCaption2;
    public Label lblHeading;
    public AnchorPane content;


    public void loginOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/LoginForm.fxml");
        Parent load = FXMLLoader.load(resource);
        content.getChildren().clear();
        content.getChildren().add(load);
    }

}
