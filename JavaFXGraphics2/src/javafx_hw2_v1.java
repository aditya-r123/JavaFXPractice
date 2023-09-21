import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

//ADD A BUTTON FOR EACH LIST THING THAT WHEN U CLICK ON IT, IT STRIKES THROUGH 
public class javafx_hw2_v1 extends Application {

	ArrayList<String> al = new ArrayList<String>();
	int numChecked;

	public static void main(String[] args) {
		launch();

	}

	/*
	 * say length of list (items) is listLen make an instance variable called
	 * numChecked; as soon as u click on a check box, either increment or
	 * decrement numChecked; update the progress bar with
	 * p.setProgress(numChecked/listLen) update the label of the bar with
	 * numChecked/listLen*100 %
	 */
	public void start(Stage stage) throws Exception {
		stage.setTitle("List");
		stage.setResizable(true);
		VBox rootNode = new VBox();
		rootNode.setAlignment(Pos.BASELINE_CENTER);
		Color BG_COLOR = Color.web("rgba(122, 235, 199, 1.0)");
		Color BG_COLOR_2 = Color.web("rgba(255, 255, 136, 1.0)");

		// Top region
		HBox topBox = new HBox();
		topBox.setBackground(new Background(new BackgroundFill(BG_COLOR,
				new CornerRadii(0), new Insets(0))));
		topBox.setSpacing(65.0);
		Font font = Font.font("arial", FontWeight.NORMAL, FontPosture.REGULAR,
				12);

		Label label1 = new Label("         List Color");
		label1.setFont(font);
		Label label2 = new Label("\t      Text Color");
		label2.setFont(font);

		Label label3 = new Label("\t       Progress Bar");
		label3.setFont(font);
		Label label4 = new Label("     Clear List");
		label4.setFont(font);

		Label label5 = new Label("\t        Add Item To List");
		label4.setFont(font);
		// add a label "clear the list"
		topBox.getChildren().addAll(label4, label1, label3, label2, label5);

		// Middle region
		HBox midBox = new HBox();
		midBox.setBackground(new Background(new BackgroundFill(BG_COLOR, new CornerRadii(0), new Insets(0))));
		midBox.setSpacing(45.0);
		ColorPicker cp = new ColorPicker();
		cp.setTooltip(new Tooltip("Set the background color of the list"));
		ColorPicker cp2 = new ColorPicker();
		cp2.setTooltip(new Tooltip("Set the text color of each item in the list"));
		ProgressBar pb = new ProgressBar(0.6);
		pb.setPrefWidth(160);
		pb.setPrefHeight(25);
		pb.setTooltip(new Tooltip("Shows the percentage of items in the list checked off"));
		TextField tf = new TextField();
		tf.setPrefWidth(190);
		tf.setTooltip(new Tooltip("Type the item you want to add"));
		Button c = new Button("Clear");
		c.setTooltip(new Tooltip("Clear all items from the list"));
		c.setPrefWidth(100);
		midBox.getChildren().addAll(c, cp, pb, cp2, tf);

		// Bottom region
		HBox bottomBox = new HBox();
		bottomBox.setBackground(new Background(new BackgroundFill(BG_COLOR, new CornerRadii(0), new Insets(0))));
		bottomBox.setAlignment(Pos.CENTER_LEFT);
		Button ab = new Button("Add");
		ab.setTooltip(new Tooltip("Add the above item to the list"));
		Label l = new Label("XX%");
		Font font2 = Font.font("arial", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 12);
		l.setFont(font2);
		l.setAlignment(Pos.CENTER);
		String gapBeg = "\t\t\t\t\t\t\t\t\t\t\t\t\t";
		String gapEnd = "\t\t\t\t\t\t\t\t\t\t\t\t     ";
		l.setText(gapBeg + pb.getProgress() * 100 + "%" + gapEnd);
		bottomBox.getChildren().addAll(l, ab);
		HBox titleBox = new HBox();
		titleBox.setBackground(new Background(new BackgroundFill(BG_COLOR_2, new CornerRadii(0), new Insets(0))));
		Font font3 = Font.font("arial", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 30);
		
		//Title
		Label label6 = new Label("My List");
		titleBox.setAlignment(Pos.CENTER);
		label6.setFont(font3);
		label6.setUnderline(true);
		titleBox.getChildren().addAll(label6);
		
		//Actual list
		HBox box1 = new HBox();
		Button b1 = new Button("Delete");
		box1.setSpacing(40);
		CheckBox cb1 = new CheckBox();
		box1.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(0), new Insets(0))));
		box1.setAlignment(Pos.CENTER);
		Font font4 = Font.font("arial", FontWeight.NORMAL, FontPosture.REGULAR, 24);
		Text l1 = new Text("Cheese");
		l1.setFont(font4);
		if(!l1.getText().trim().equals(""))box1.getChildren().addAll(cb1, l1, b1);
		HBox box2 = new HBox();
		Button b2 = new Button("Delete");
		box2.setSpacing(40);
		CheckBox cb2 = new CheckBox();
		box2.setBackground(new Background(new BackgroundFill(BG_COLOR_2, new CornerRadii(0), new Insets(0))));
		box2.setAlignment(Pos.CENTER);
		Text l2 = new Text("Bananas");
		l2.setFont(font4);
		if(!l2.getText().trim().equals(""))box2.getChildren().addAll(cb2, l2, b2);
		HBox box3 = new HBox();
		Button b3 = new Button("Delete");
		box3.setSpacing(40);
		CheckBox cb3 = new CheckBox();
		box3.setBackground(new Background(new BackgroundFill(BG_COLOR_2, new CornerRadii(0), new Insets(0))));
		box3.setAlignment(Pos.CENTER);
		Text l3 = new Text("Bread");
		l3.setFont(font4);
		if(!l3.getText().trim().equals(""))box3.getChildren().addAll(cb3, l3, b3);
		HBox box4 = new HBox();
		Button b4 = new Button("Delete");
		box4.setSpacing(40);
		CheckBox cb4 = new CheckBox();
		box4.setBackground(new Background(new BackgroundFill(BG_COLOR_2, new CornerRadii(0), new Insets(0))));
		box4.setAlignment(Pos.CENTER);
		Text l4 = new Text("Cashews");
		l4.setFont(font4);
		if(!l4.getText().trim().equals(""))box4.getChildren().addAll(cb4, l4, b4);
		HBox box5 = new HBox();
		Button b5 = new Button("Delete");
		box5.setSpacing(40);
		CheckBox cb5 = new CheckBox();
		box5.setBackground(new Background(new BackgroundFill(BG_COLOR_2, new CornerRadii(0), new Insets(0))));
		box5.setAlignment(Pos.CENTER);
		Text l5 = new Text("fsddds");
		l5.setFont(font4);
		if(!l5.getText().trim().equals(""))box5.getChildren().addAll(cb5, l5, b5);
		HBox box6 = new HBox();
		Button b6 = new Button("Delete");
		box6.setSpacing(40);
		CheckBox cb6 = new CheckBox();
		box6.setBackground(new Background(new BackgroundFill(BG_COLOR_2, new CornerRadii(0), new Insets(0))));
		box6.setAlignment(Pos.CENTER);
		Text l6 = new Text("Pineapple");
		l6.setFont(font4);
		if(!l6.getText().trim().equals(""))box6.getChildren().addAll(cb6, l6, b6);
		HBox box7 = new HBox();
		Button b7 = new Button("Delete");
		box7.setSpacing(40);
		CheckBox cb7 = new CheckBox();
		box7.setBackground(new Background(new BackgroundFill(BG_COLOR_2, new CornerRadii(0), new Insets(0))));
		box7.setAlignment(Pos.CENTER);
		Text l7 = new Text("ssdsdd");
		l7.setFont(font4);
		if(!l7.getText().trim().equals(""))box7.getChildren().addAll(cb7, l7, b7);
		HBox box8 = new HBox();
		Button b8 = new Button("Delete");
		box8.setSpacing(40);
		CheckBox cb8 = new CheckBox();
		box8.setBackground(new Background(new BackgroundFill(BG_COLOR_2, new CornerRadii(0), new Insets(0))));
		box8.setAlignment(Pos.CENTER);
		Text l8 = new Text("sdfsdsdf");
		l8.setFont(font4);
		if(!l8.getText().trim().equals(""))box8.getChildren().addAll(cb8, l8, b8);
		HBox box9 = new HBox();
		Button b9 = new Button("Delete");
		box9.setSpacing(40);
		CheckBox cb9 = new CheckBox();
		box9.setBackground(new Background(new BackgroundFill(BG_COLOR_2, new CornerRadii(0), new Insets(0))));
		box9.setAlignment(Pos.CENTER);
		Text l9 = new Text("sdsfsd");
		l9.setFont(font4);
		if(!l9.getText().trim().equals(""))box9.getChildren().addAll(cb9, l9, b9);
		HBox box10 = new HBox();
		Button b10 = new Button("Delete");
		box10.setSpacing(40);
		CheckBox cb10 = new CheckBox();
		box10.setBackground(new Background(new BackgroundFill(BG_COLOR_2, new CornerRadii(0), new Insets(0))));
		box10.setAlignment(Pos.CENTER);
		Text l10 = new Text("sdfsdsf");
		l10.setFont(font4);
		if(!l10.getText().trim().equals(""))box10.getChildren().addAll(cb10, l10, b10);
		HBox box11 = new HBox();
		Button b11 = new Button("Delete");
		b11.setAlignment(Pos.CENTER);
		box11.setSpacing(40);
		CheckBox cb11 = new CheckBox();
		box11.setBackground(new Background(new BackgroundFill(BG_COLOR_2, new CornerRadii(0), new Insets(0))));
		box11.setAlignment(Pos.CENTER);
		Text l11 = new Text("ssdfsdfdf");
		l11.setFont(font4);
		if(!l11.getText().trim().equals(""))box11.getChildren().addAll(cb11, l11, b11);
		HBox box12 = new HBox();
		Button b12 = new Button("Delete");
		box12.setSpacing(40);
		CheckBox cb12 = new CheckBox();
		box12.setBackground(new Background(new BackgroundFill(BG_COLOR_2, new CornerRadii(0), new Insets(0))));
		box12.setAlignment(Pos.CENTER);
		Text l12 = new Text("fnhmghjk,");
		l12.setFont(font4);
		if(!l12.getText().trim().equals(""))box12.getChildren().addAll(cb12, l12, b12);
		HBox box13 = new HBox();
		Button b13 = new Button("Delete");
		box13.setSpacing(40);
		CheckBox cb13 = new CheckBox();
		box13.setBackground(new Background(new BackgroundFill(BG_COLOR_2, new CornerRadii(0), new Insets(0))));
		box13.setAlignment(Pos.CENTER);
		Text l13 = new Text("fgadfgas");
		l13.setFont(font4);
		if(!l13.getText().trim().equals(""))box13.getChildren().addAll(cb13, l13, b13);
		HBox box14 = new HBox();
		CheckBox cb14 = new CheckBox();
		Button b14 = new Button("Delete");
		box14.setSpacing(40);
		box14.setBackground(new Background(new BackgroundFill(BG_COLOR_2, new CornerRadii(0), new Insets(0))));
		box14.setAlignment(Pos.CENTER);
		Text l14 = new Text("holaamigos");
		l14.setFont(font4);
		if(!l14.getText().trim().equals(""))box14.getChildren().addAll(cb14, l14, b14);
		HBox box15 = new HBox();
		Button b15 = new Button("Delete");
		box15.setSpacing(40);
		CheckBox cb15 = new CheckBox();
		box15.setBackground(new Background(new BackgroundFill(BG_COLOR_2, new CornerRadii(0), new Insets(0))));
		box15.setAlignment(Pos.CENTER);
		Text l15 = new Text("sdfgfsf");
		l15.setFont(font4);
		if(!l15.getText().trim().equals(""))box15.getChildren().addAll(cb15, l15, b15);
		

		//Bottom rectangle
		Rectangle band3 = new Rectangle(820, 300);
		band3.setFill(BG_COLOR_2);
		band3.setX(100);
		band3.setY(300);
		
		
		
		Scene scene = new Scene(rootNode, 820, 510);
		rootNode.getChildren().addAll(topBox, midBox, bottomBox, titleBox, box1, box2, box3, box4, box5, box6, box7, box8, box9, box10, box11, box12, box13, box14, box15);
		rootNode.getChildren().add(band3);
		stage.setScene(scene);
		stage.sizeToScene();
		stage.show();
		
		/*
		* INITIALIZE:
		* l14.setText("");
		* cb.setVisible(false);
		*/
		
		/*
		 * TO DELETE AN ITEM DO:
		 * l14.setText("");
			cb14.setVisible(false);
		 */
		
		/*/
		 * TO ADD AN ITEM DO:
		 * l14.setText("whatever_the_user_inputs);
		 * cb14.setVisible(true);
		 * 
		 */
		
		

	}
}
