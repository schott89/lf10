package com.example.lf10;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class TestController {
    @FXML
    private Label welcomeText;
    @FXML
    private Button detailsBtn;


    @FXML
    public void initialize() {
        detailsBtn.setStyle("-fx-background-color: "+ Color.PINK.toString().substring(2) + ";");
        System.out.println("Testcontroller initialized");


    }

    @FXML
    protected void onDetailsBtnClick() throws IOException {
        Stage stage = TestApplication.mainStage;
        FXMLLoader fxmlLoader = new FXMLLoader(TestApplication.class.getResource("/fxml/details-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        stage.setScene(scene);
        stage.show();
    }
}