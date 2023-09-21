import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
 * Name: Aditya Rao
 * Period: 4
 * Date: 3/16/20
 * Take taken: 20 minutes
 * 
 * This was a fun an easy lab for me. I enjoyed looking at different methods in various APIs i found online. 
 * The shapes I chose to use for my project were an ellipse, a circle, and a rectangle. I didn't have any 
 * difficulty with making the shapes scale to one constant or making the centering of shapes based on the 
 * canvas or other shapes. Also, to make my output more realistic, I slightly rotated both the leaf and 
 * the stem, along with rounding the edges of the stem. This lab reminds me of the snowman project we 
 * did last year in into to java on CodeHs. 
 */
public class AppleBoi extends Application {

	// dimensions
	Random rand = new Random();
	private final double APPLE_RADIUS = 200; // EVERYTHING IS BASED ON THIS
	private final double LEAF_WIDTH = APPLE_RADIUS / 8;
	private final double LEAF_HEIGHT = APPLE_RADIUS / 4;
	private final double STEM_WIDTH = APPLE_RADIUS / 4 * 1.25;
	private final double STEM_HEIGHT = APPLE_RADIUS / 4 / 10;
	private final double EYE_RADIUS_1 = APPLE_RADIUS / 5;
	private final double EYE_RADIUS_2 = APPLE_RADIUS / 3;
	private final double MOUTH_RADIUS_X = APPLE_RADIUS / 1.5;
	private final double MOUTH_RADIUS_Y = APPLE_RADIUS / 2;
	private final double MOUTH_OFF_Y = APPLE_RADIUS / 3.5;

	// offsets
	private final double LEAF_OFF_Y = APPLE_RADIUS * 1.19;
	private final double STEM_OFF_X = APPLE_RADIUS / 3;
	private final double STEM_OFF_Y = APPLE_RADIUS * 1.1;
	private final double EYE_OFF_X = APPLE_RADIUS / 2.5;
	private final double EYE_OFF_Y = APPLE_RADIUS / 4;

	// colors
	private final Color APPLE_COLOR = Color.RED;
	private final Color LEAF_COLOR = Color.GREEN;
	private final Color STEM_COLOR = Color.BROWN;
	private final Color EYE_COLOR_1 = Color.WHITE;
	private final Color EYE_COLOR_2 = Color.BLACK;
	private final Color MOUTH_COLOR = Color.WHITE;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Say hi to apple boi");
		stage.setResizable(false);
		stage.sizeToScene();

		Group root = new Group();
		Scene scene = new Scene(root, 700, 700);
		stage.setScene(scene);

		Circle apple = new Circle(APPLE_RADIUS);
		apple.setCenterX(scene.getWidth() / 2);
		apple.setCenterY(scene.getHeight() / 2);
		apple.setFill(APPLE_COLOR);
		root.getChildren().add(apple);

		Ellipse leaf = new Ellipse(LEAF_WIDTH, LEAF_HEIGHT);
		leaf.setCenterX(scene.getWidth() / 2);
		leaf.setCenterY(apple.getCenterY() - LEAF_OFF_Y);
		leaf.setFill(LEAF_COLOR);
		leaf.setRotate(45);
		root.getChildren().add(leaf);

		Rectangle stem = new Rectangle(STEM_WIDTH, STEM_HEIGHT);
		stem.setX(scene.getWidth() / 2 - STEM_OFF_X);
		stem.setY(apple.getCenterY() - STEM_OFF_Y);
		stem.setFill(STEM_COLOR);
		stem.setRotate(80);
		stem.setArcWidth(20);
		stem.setArcHeight(20);
		root.getChildren().add(stem);

		Circle leftEyeOut = new Circle(EYE_RADIUS_2);
		leftEyeOut.setCenterX(apple.getCenterX() - EYE_OFF_X);
		leftEyeOut.setCenterY(apple.getCenterY() - EYE_OFF_Y);
		leftEyeOut.setFill(EYE_COLOR_1);
		root.getChildren().add(leftEyeOut);

		Circle leftEyeIn = new Circle(EYE_RADIUS_1);
		leftEyeIn.setCenterX(apple.getCenterX() - EYE_OFF_X);
		leftEyeIn.setCenterY(apple.getCenterY() - EYE_OFF_Y);
		leftEyeIn.setFill(EYE_COLOR_2);
		root.getChildren().add(leftEyeIn);

		Circle rightEyeOut = new Circle(EYE_RADIUS_2);
		rightEyeOut.setCenterX(apple.getCenterX() + EYE_OFF_X);
		rightEyeOut.setCenterY(apple.getCenterY() - EYE_OFF_Y);
		rightEyeOut.setFill(EYE_COLOR_1);
		root.getChildren().add(rightEyeOut);

		Circle rightEyeIn = new Circle(EYE_RADIUS_1);
		rightEyeIn.setCenterX(apple.getCenterX() + EYE_OFF_X);
		rightEyeIn.setCenterY(apple.getCenterY() - EYE_OFF_Y);
		rightEyeIn.setFill(EYE_COLOR_2);
		root.getChildren().add(rightEyeIn);

		Arc mouth = new Arc(apple.getCenterX(), apple.getCenterY()
				+ MOUTH_OFF_Y, MOUTH_RADIUS_X, MOUTH_RADIUS_Y, 200, 140);
		mouth.setFill(MOUTH_COLOR);
		root.getChildren().add(mouth);
		
		Text t = new Text("testing");
		
		
		try {

			t.setX(scene.getWidth() / 2 - STEM_OFF_X);
			t.setY(apple.getCenterY() - STEM_OFF_Y);
			root.getChildren().add(t);
            // delay 5 seconds
            TimeUnit.SECONDS.sleep(10);
            root.getChildren().remove(t);
    		t.setText("YEE");
    		root.getChildren().add(t);

            // delay 0.5 second
            //TimeUnit.MICROSECONDS.sleep(500);

            // delay 1 minute
            //TimeUnit.MINUTES.sleep(1);
            
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
		
		
		
		
		stage.show();

	}

}
