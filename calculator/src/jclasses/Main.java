/**
 * @author: Carlos Rodriguez
 * Class executes application. */

package jclasses;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;

public class Main extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		try {
			AnchorPane pane = (AnchorPane) FXMLLoader.load(getClass().getResource("/fxmls/Calculator.fxml"));
			Scene scene = new Scene(pane);
			stage.setScene(scene);
			stage.setTitle("Calculator.io");
			stage.getIcons().add(new Image("calc.png"));
			stage.setResizable(false);
			stage.show();	
		}
		catch(Exception e) {
			
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
 	
}
