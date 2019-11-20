package dk.aau.address.view;

/*Importere javafx filer*/
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;

import javafx.fxml.FXML;

/*SceneBuilder imports */
import javafx.scene.control.Button;
//import javafx.scene.layout.AnchorPane;
//import javafx.scene.text.Font;
//import javafx.scene.text.Text;

/*Danner klasse for MenuController, der indeholder activering af knappen*/
public class MenuController{

@FXML
private Button anatomyButton;

@FXML
	public void buttonClicked(){
		anatomyButton.setText("Button clicked!");
		treatmentButton.setText("hej");
	}

@FXML
private Button treatmentButton;
@FXML
private Button faqButton;
@FXML
private Button askButton;

}