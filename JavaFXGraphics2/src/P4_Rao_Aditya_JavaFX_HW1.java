import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/*
 * Name: Aditya Rao
 * Period: 4
 * Date: 3/16/20
 * Take taken: 40 minutes
 * 
 * This was a fun an easy lab for me. I enjoyed looking at different methods in various APIs i found online. 
 * I made a pencil that consists of many shapes. The body, 3 metal bands, and lead of the pencil is a rectangle, 
 * the eraser is an arc, and the wood part is a polygon (isoceles triangle). I also added a background behind 
 * the pencil. I did not have any difficulties, but I wish there was a way to automatically close graphics windows 
 * or use only one since for every little test I did, it opened up a new window. 
 */
public class P4_Rao_Aditya_JavaFX_HW1 extends Application {
	
	// dimensions
	
	private static final double PENCIL_HEIGHT = 600; // EVERYTHING IS BASED ON THIS
	private static final double PENCIL_WIDTH = PENCIL_HEIGHT/15;
	
	private static final double ERASER_WIDTH = PENCIL_HEIGHT/30;
	private static final double ERASER_HEIGHT = PENCIL_HEIGHT/15;
	private static final double ERASER_OFFSET = PENCIL_HEIGHT/45;
	private static final double BAND_HEIGHT = PENCIL_HEIGHT/70;
	
	
	private final double WOOD_EXTRA_DOWN = PENCIL_HEIGHT / 12.5;
	
	
	private final double BAND_OFFSET = PENCIL_HEIGHT/40;

	
	private static final double TIP_WIDTH = PENCIL_HEIGHT/175;
	private static final double TIP_HEIGHT = PENCIL_HEIGHT/35;

	// offsets


	// colors
	private final Color BG_COLOR = Color.web("rgba(39, 47, 107, 0.3)");
	private final Color PENCIL_COLOR = Color.web("rgba(252, 201, 33,1.0)");
	private final Color WOOD_COLOR = Color.web("rgba(255, 206, 122,1.0)");//255, 206, 122
	private final Color ERASER_COLOR = Color.web("rgba(255, 151, 127,1.0)");
	private final Color BAND_COLOR = Color.web("rgba(17, 140, 35,1.0)");
	private final Color TIP_COLOR = Color.web("rgba(56, 52, 40,1.0)");

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Pencil");
		stage.setResizable(false);
		stage.sizeToScene();
		
		Group root = new Group();
		Scene scene = new Scene(root, 700, 700);
		stage.setScene(scene);
		
		Rectangle bg = new Rectangle(scene.getWidth(), scene.getHeight());
		bg.setX(0);
		bg.setY(0);
		bg.setFill(BG_COLOR);
		root.getChildren().add(bg);
		
		Rectangle pencil = new Rectangle(PENCIL_WIDTH, PENCIL_HEIGHT);
		pencil.setX(scene.getWidth() / 2 - pencil.getWidth()/2);
		pencil.setY(0+scene.getHeight()/2 - pencil.getHeight()/2);
		pencil.setFill(PENCIL_COLOR);
		
		root.getChildren().add(pencil);
		
		Rectangle band1 = new Rectangle(PENCIL_WIDTH, BAND_HEIGHT);
		band1.setX(pencil.getX());
		band1.setY(0+scene.getHeight()/2 - pencil.getHeight()/2);
		band1.setFill(BAND_COLOR);
		
		root.getChildren().add(band1);
		
		Rectangle band2 = new Rectangle(PENCIL_WIDTH, BAND_HEIGHT*5/4);
		band2.setX(pencil.getX());
		band2.setY(BAND_OFFSET+scene.getHeight()/2 - pencil.getHeight()/2);
		band2.setFill(BAND_COLOR);
		
		root.getChildren().add(band2);
		
		Rectangle band3 = new Rectangle(PENCIL_WIDTH, BAND_HEIGHT);
		band3.setX(pencil.getX());
		band3.setY(BAND_OFFSET*2.15+scene.getHeight()/2 - pencil.getHeight()/2);
		band3.setFill(BAND_COLOR);
		
		root.getChildren().add(band3);
		
		
		Polygon wood = new Polygon(pencil.getX(), pencil.getY()+pencil.getHeight()+WOOD_EXTRA_DOWN, pencil.getX() + pencil.getWidth(), pencil.getY()+pencil.getHeight()+WOOD_EXTRA_DOWN, pencil.getX() + pencil.getWidth()/2, pencil.getY()+pencil.getHeight()+WOOD_EXTRA_DOWN-PENCIL_HEIGHT/12.5);
		wood.setFill(WOOD_COLOR);
		wood.setRotate(180);
		root.getChildren().add(wood);
		
		
		Arc eraser = new Arc(pencil.getX()+pencil.getWidth()/2, pencil.getY()+ERASER_OFFSET, ERASER_WIDTH, ERASER_HEIGHT, -200, -140);
		eraser.setFill(ERASER_COLOR);
		root.getChildren().add(eraser);
		
		Rectangle tip = new Rectangle(TIP_WIDTH, TIP_HEIGHT);
		tip.setX(pencil.getX()+pencil.getWidth()/2-TIP_WIDTH/2);
		tip.setY(pencil.getY()+pencil.getHeight()+WOOD_EXTRA_DOWN*0.85);
		tip.setFill(TIP_COLOR);
		
		root.getChildren().add(tip);
	    
	    stage.show();
		

	}

}
