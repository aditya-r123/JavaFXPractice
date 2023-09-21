import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MyApp extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Stage bob = new Stage();
		bob.setTitle("hi");
		bob.show();
		
		
		
		
		primaryStage.setTitle("My First Program");
		/*
		primaryStage.setMaxHeight(400);
		primaryStage.setResizable(true);
		primaryStage.setMaxWidth(300);
		primaryStage.setMinHeight(100);
		primaryStage.setMinWidth(100);
		primaryStage.centerOnScreen();
		*/
		BorderPane pane = new BorderPane();
		Label label = new Label("Hello");
		pane.setTop(label);
		pane.setCenter(new Button("press me"));
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		
		
		
	
	
	
	}
}
