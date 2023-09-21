import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class App extends Application{
	private Circle c;
	
	
	
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("App Demo");
		Group root = new Group();
		c = new Circle(50, 50, 50);
		c.setFill(new Color(100/256.0, 50/255.0, 40/255.0, 0.5));
		root.getChildren().add(c);
		Scene scene = new Scene(root, 300, 300);
		stage.setScene(scene);
		stage.show();
		
		c.setOnMouseClicked(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent event) {
				System.out.println("You clicked on me lol");
				
			}
			
		});
		AnimationTimer timer = new AnimationTimer(){
			private long prevTime = 0;
			@Override
			public void handle(long now) {
				long dt = now - prevTime;
				if(dt > 15e6){
					
					prevTime = now;
					c.setCenterX(c.getCenterX()+1);
					c.setCenterY(c.getCenterY()+1);
					
				}
			}
			
		};
		timer.start();
		
		
	}
	
	
	public static void main(String[] args) {launch(args);}
	
	
}
