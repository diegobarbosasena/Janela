package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class JanelaController implements Initializable{
	
	@FXML private Button btnMinimizar;
	@FXML private Button btnMaximizar;
	@FXML private Button btnFechar;
	@FXML private AnchorPane anpJanela;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		btnFechar.setOnAction(o -> fechar());
		btnMaximizar.setOnAction(m -> maximizar());
		btnMinimizar.setOnAction(b -> minimizar());
		
	}
	
	private void minimizar() {
		Stage minimizar =  (Stage)anpJanela.getScene().getWindow();
		minimizar.setIconified(true);
		
	}
	
	private void maximizar() {
		
		Stage maximizar =  (Stage)anpJanela.getScene().getWindow();
		
		if (maximizar.isFullScreen() == true)
			maximizar.setFullScreen(false);
		else
			maximizar.setFullScreen(true);
	}
	
	private void fechar() {
		System.exit(0);
	}
	


}
