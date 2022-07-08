package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LoginForm3Controller {
    public JFXTextField username;
    public JFXPasswordField password;
    public JFXButton Button;
    public AnchorPane loginContext;
    public AnchorPane content;


    public void openReceptionistOnAction(ActionEvent actionEvent) throws IOException {
        if (username.getText().toString().equals("receptionist") && password.getText().toString().equals("receptionist")) {
            URL resource = getClass().getResource("../view/DashBoard1.fxml");
            Parent load = FXMLLoader.load(resource);
            Stage window = (Stage) content.getScene().getWindow();
            window.setScene(new Scene(load));
        } else {
            new Alert(Alert.AlertType.WARNING,"Password or User Name you entered is incorrect");
        }

    }

    public void nextOnAction(ActionEvent actionEvent) {
        password.requestFocus();
    }

    public void loginOnAction(ActionEvent actionEvent) {
        Button.requestFocus();
    }


}


