package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class MealForm2Controller {
    public AnchorPane content;

    public void roomsOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/EditRoomForm.fxml");
        Parent load = FXMLLoader.load(resource);
        content.getChildren().clear();
        content.getChildren().add(load);
    }

    public void mealPlansOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MealForm2.fxml");
        Parent load = FXMLLoader.load(resource);
        content.getChildren().clear();
        content.getChildren().add(load);
    }

    public void packageOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/PackageForm2.fxml");
        Parent load = FXMLLoader.load(resource);
        content.getChildren().clear();
        content.getChildren().add(load);
    }

    public void incomeReportOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/IncomeReportsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        content.getChildren().clear();
        content.getChildren().add(load);
    }

    public void logoutOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DashBoard2.fxml");
        Parent load = FXMLLoader.load(resource);
        content.getChildren().clear();
        content.getChildren().add(load);
    }
}
