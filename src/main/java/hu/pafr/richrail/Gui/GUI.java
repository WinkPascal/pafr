package hu.pafr.richrail.Gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class GUI extends Application{
	
	private BorderPane layout;
	private Scene scene;
	
	public static void main (String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage window) throws Exception {
		layout = new BorderPane ();
		scene = new Scene(layout, 450, 80);
		
		window.setScene(scene);
		window.show();
	}

}