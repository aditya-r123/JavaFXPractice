
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class JavaFXPicture extends Application {
	// measurements
	private final double HEAD_RADIUS = 80; // changing this scales everything
	
	private final double EYE_RADIUS = HEAD_RADIUS / 4;
	private final double EYE_OFF_X = HEAD_RADIUS / 3;
	private final double EYE_OFF_Y = HEAD_RADIUS / 4;
	
	private final double NOSE_HEIGHT = HEAD_RADIUS / 3;
	private final double NOSE_WIDTH = HEAD_RADIUS / 4;
	private final double NOSE_OFF_Y = HEAD_RADIUS / 4;
	
	private final double MOUTH_RADIUS_X = HEAD_RADIUS / 2;
	private final double MOUTH_RADIUS_Y = HEAD_RADIUS / 4;
	private final double MOUTH_OFF_Y = HEAD_RADIUS / 3;
	
	// colors
	private final Color HEAD_COLOR = Color.YELLOW;
	private final Color EYE_COLOR = Color.RED;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Smiley");
		stage.setResizable(false);
		stage.sizeToScene();
		
		Group root = new Group();
		Scene scene = new Scene(root, 200, 200);
		stage.setScene(scene);
		
		
		Circle head = new Circle(HEAD_RADIUS);
		head.setCenterX(scene.getWidth() / 2);
		head.setCenterY(scene.getHeight() / 2);
		head.setFill(HEAD_COLOR);
		head.setStroke(Color.BLACK);
		root.getChildren().add(head);
		
		Circle leftEye = new Circle(EYE_RADIUS);
		leftEye.setCenterX(head.getCenterX() - EYE_OFF_X);
		leftEye.setCenterY(head.getCenterY() - EYE_OFF_Y);
		leftEye.setFill(EYE_COLOR);
		root.getChildren().add(leftEye);
		
		Circle rightEye = new Circle(EYE_RADIUS);
		rightEye.setCenterX(head.getCenterX() + EYE_OFF_X);
		rightEye.setCenterY(head.getCenterY() - EYE_OFF_Y);
		rightEye.setFill(EYE_COLOR);
		root.getChildren().add(rightEye);
		
		Polygon nose = new Polygon(head.getCenterX(), head.getCenterY() + NOSE_OFF_Y - NOSE_HEIGHT,
								   head.getCenterX() - NOSE_WIDTH / 2, head.getCenterY() + NOSE_OFF_Y,
								   head.getCenterX() + NOSE_WIDTH / 2, head.getCenterY() + NOSE_OFF_Y);
		nose.setFill(Color.PLUM);
		root.getChildren().add(nose);
		
		Arc mouth = new Arc(head.getCenterX(), head.getCenterY() + MOUTH_OFF_Y, MOUTH_RADIUS_X, MOUTH_RADIUS_Y, 200, 140);
		mouth.setFill(null);
		mouth.setStroke(Color.BLACK);
		mouth.setStrokeWidth(5);
		root.getChildren().add(mouth);
		
		stage.show();
	}

}
