package dk.aau.address;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class MainApp extends Application {
    
    private Stage primaryStage;
    private BorderPane Anatomy;
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub
        
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("AddressApp");
        
        initAnatomy();
        showAnatomy(); 
    }
    
    /**
    * Initializes the root layout.
    */
    public void initAnatomy() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/Anatomy.fxml"));
            Anatomy = (BorderPane) loader.load();
            
            // Show the scene containing the root layout.
            Scene scene = new Scene(Anatomy);
            primaryStage.setScene(scene);
            primaryStage.show();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void showAnatomy() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/Anatomy.fxml"));
            AnchorPane Anatomy = (AnchorPane) loader.load();
            
            // Show the scene containing the root layout.
            Anatomy.setHover(Anatomy);
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
