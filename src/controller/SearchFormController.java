package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class SearchFormController {
    public TextField txtNic;
    public TextField txtMeal;
    public TextField txtRoom;
    public AnchorPane content;

    public void searchOnAction(ActionEvent actionEvent) {
    }

    public void search2OnAction(ActionEvent actionEvent) {
    }

    public void view2OnAction(ActionEvent actionEvent) {
    }

    public void view1OnAction(ActionEvent actionEvent) {
    }




    public void addGuestOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/GuestForm.fxml");
        Parent load = FXMLLoader.load(resource);
        content.getChildren().clear();
        content.getChildren().add(load);
    }

    public void packageOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/PackageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        content.getChildren().clear();
        content.getChildren().add(load);
    }

    public void roomOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/RoomDetail.fxml");
        Parent load = FXMLLoader.load(resource);
        content.getChildren().clear();
        content.getChildren().add(load);
    }

    public void mealOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MealForm.fxml");
        Parent load = FXMLLoader.load(resource);
        content.getChildren().clear();
        content.getChildren().add(load);
    }

    public void searchDetailOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/SearchForm.fxml");
        Parent load = FXMLLoader.load(resource);
        content.getChildren().clear();
        content.getChildren().add(load);
    }

    public void logoutOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DashBoard1.fxml");
        Parent load = FXMLLoader.load(resource);
        content.getChildren().clear();
        content.getChildren().add(load);
    }
}
