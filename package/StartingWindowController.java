package com.example.myfirst;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;



public class StartingWindowController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToAdminUserSelection(ActionEvent event) throws IOException {
        root= FXMLLoader.load(getClass().getResource("admin_user_selection.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
  @FXML
    public void switchToCashierUserSelection(ActionEvent event) throws IOException {
        root= FXMLLoader.load(getClass().getResource("cashier_user_selection.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void Maximized_clicked(MouseEvent event)
    {
        stage.setMaximized(true);
    }



}
