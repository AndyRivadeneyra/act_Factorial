/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author PC
 */
public class Factorial extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Label etiqueta = new Label();    
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));
        
        Scene scene = new Scene(grid, 300, 250);
        
        etiqueta.setText("Número");
        grid.add(etiqueta,0,1);
        
        TextField numero = new TextField();
        grid.add(numero,1,1);
        
        Button factorial = new Button("FACTORIAL");
        grid.add(factorial,1,2);
        
        Label resultado = new Label();  
        grid.add(resultado,1,3);
        
        factorial.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                int dato = Integer.parseInt(numero.getText());
                int suma=1;
                for(int i=dato;i>=1;i--){
                    suma*=i;
                }
                String total = Integer.toString(suma);
                resultado.setText(total);
            }  
        });
        
        primaryStage.setTitle("FACTORIAL");
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
