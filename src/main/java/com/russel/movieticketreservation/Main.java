package com.russel.movieticketreservation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException, SQLException {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        ArrayList<ArrayList> data = new ArrayList<>();
        DatabaseConnection databaseConnection = new DatabaseConnection();
        data = databaseConnection.retrieveData();

       System.out.println(data);

    }
    public static void main(String[] args) {
        launch(args);
    }
}
