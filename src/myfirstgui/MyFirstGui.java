/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstgui;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author olive
 */
public class MyFirstGui extends Application {
    
   @Override
   public void start(Stage primaryStage) {
       
        Text greeting_lbl=new Text("Hello, I am the first GUI");
        Button test_btn = new Button("Click Me");
       
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(600,300);
        gridPane.setVgap(10);
        gridPane.setHgap(20);
        gridPane.setAlignment(Pos.CENTER);
     
        gridPane.add(greeting_lbl, 1, 1);
        gridPane.add(test_btn, 1, 2);
        primaryStage.setTitle("First GUI");
       
        test_btn.setOnMouseClicked((new EventHandler<MouseEvent>() {
         @Override
         public void handle(MouseEvent event) {
             SecondGui sg = new SecondGui();
             sg.start(SecondGui.secondGuiStage);          
         }
        }));
       
        Scene scene=new Scene (gridPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
