package salesTaxes;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class MainWindowController {
	
	@FXML
	public ChoiceBox<String> categoryChoice, productChoice, stateChoice;
	public TextField priceText, taxText, resultText;
	
	public void setInitData() {
		priceText.setEditable(true);
		taxText.setEditable(false);
		resultText.setEditable(false);
	}
}
