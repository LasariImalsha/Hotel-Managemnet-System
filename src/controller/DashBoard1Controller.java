package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class DashBoard1Controller {
    public AnchorPane content;

    public void openAddNewGuest(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/GuestForm.fxml");
        Parent load = FXMLLoader.load(resource);
        content.getChildren().clear();
        content.getChildren().add(load);
    }

    public void openPackage(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/PackageForm1.fxml");
        Parent load = FXMLLoader.load(resource);
        content.getChildren().clear();
        content.getChildren().add(load);
    }

    public void openRoom(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/RoomDetailForm.fxml");
        Parent load = FXMLLoader.load(resource);
        content.getChildren().clear();
        content.getChildren().add(load);
    }

    public void openMealOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MealForm1.fxml");
        Parent load = FXMLLoader.load(resource);
        content.getChildren().clear();
        content.getChildren().add(load);
    }

    public void openGuestDetails(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/SearchForm.fxml");
        Parent load = FXMLLoader.load(resource);
        content.getChildren().clear();
        content.getChildren().add(load);
    }

    public void logoutOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/LoginForm.fxml");
        Parent load = FXMLLoader.load(resource);
        content.getChildren().clear();
        content.getChildren().add(load);
    }
}