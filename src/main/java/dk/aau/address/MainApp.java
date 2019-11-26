package dk.aau.address;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
//import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class MainApp extends Application {
    
    private Stage primaryStage;
    private BorderPane Menu;
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub
        
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("AddressApp");
        
        initMenu();
        //showAnatomy(); 
    }
    
    /**
    * Initializes the root layout.
    */
    public void initMenu() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("/view/Menu.fxml"));
            Menu = (BorderPane) loader.load();
            
            // Show the scene containing the root layout.
            Scene scene = new Scene(Menu);
            primaryStage.setScene(scene);
            primaryStage.show();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
  

    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
