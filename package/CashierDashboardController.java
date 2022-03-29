package com.example.myfirst;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class CashierDashboardController {

    private Stage stage;
    private Scene scene;
    private Parent root;


    public void switchToCashierDashboard(ActionEvent event) throws IOException {

      /*  try (BufferedReader reader = new BufferedReader(new FileReader(new File("/home/user/IdeaProjects/okkk/src/main/resources/com/example/myfirst/myFile.txt")))) {

            String line;
            while ((line = reader.readLine()) != null)
                System.out.println(line);

        } catch (IOException e) {
            e.printStackTrace();
        }
*/


        root= FXMLLoader.load(getClass().getResource("Dashboard.fxml"));



        /*Rectangle rect = new Rectangle(200, 200, Color.RED);
        ScrollPane s1 = new ScrollPane();
        s1.setPrefSize(120, 120);
        s1.setContent(rect);
         root.getChildrenUnmodifiable().add(s1);
*/
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void backbuttonpressed(ActionEvent event) throws IOException {

        root= FXMLLoader.load(getClass().getResource("startingwindow.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();


    }



}
