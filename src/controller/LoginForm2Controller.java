package controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LoginForm2Controller {
    public AnchorPane loginContext;
    public JFXTextField txtName;
    public JFXPasswordField pwdPassword;
    public JFXButton login;
    public AnchorPane content;


    public void openAdminOnAction(ActionEvent actionEvent) throws IOException {
        if (txtName.getText().toString().equals("admin") && pwdPassword.getText().toString().equals("admin")) {
            URL resource = getClass().getResource("../view/DashBoard2.fxml");
            Parent load = FXMLLoader.load(resource);
            content.getChildren().clear();
            content.getChildren().add(load);
        } else {
            new Alert(Alert.AlertType.WARNING,"Password or User Name you entered is incorrect");
        }

    }

    public void nextOnAction(ActionEvent actionEvent) {
        pwdPassword.requestFocus();
    }

    public void loginOnAction(ActionEvent actionEvent) {
        login.requestFocus();

    }

}
