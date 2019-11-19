package dk.aau.address.view;

/*Importere javafx filer*/
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.util.StringConverter;
/*Danner klasse for MenuController, der indeholder activering af knappen*/

public class MenuController{
@FXML
private Button anatomyButton;

@FXML
private Button treatmentButton;

@FXML
private Button faqButton;

@FXML
	private void initialize() {
		// Handle Button event.
		anatomyButton.setOnAction((event) -> {
			outputTextArea.appendText("Button Action\n");
		});

}
}