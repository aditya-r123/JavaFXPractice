/*
 * Name: Aditya Rao
 * Period: 4
 * Date: 3/31/21
 * Take taken: 1 hour
 * 
 * This was a fun lab for me. At first, it was a bit confusing on how to add the code for mouse click
 *  interactions, but once I looked through the api and videos uploaded by the teachers, I was able 
 *  to get it. In this checkpoint, I added the core functionality. This includes the buttons, checkboxes+progress
 *  indicator, and textfields. However, I would like to replace my closeList buttons with something 
 *  else, as this is the same thing as clicking on the "X". I'm planning to implement a clear function 
 *  instead, that resets the whole list. Additionally. in the future, I plan to add the code that responds 
 *  to the text and background colors the user chooses from the dropdown menus. 
 */

import java.util.ArrayList;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class P4_Rao_Aditya_GUI_3a extends Application {
	private double cur;
	private double checkCount;
	private Button closeList;
	private ObservableList<String> options;
	private ComboBox<String> listColor;
	private ObservableList<String> options2;
	private ComboBox<String> textColor;
	ProgressIndicator progressIndicator;
	private Button addButton;
	private TextField addField;

	private VBox rootNode;
	private VBox vbox;
	private VBox vbox2;
	private VBox vbox3;
	private HBox hbox;
	private BorderPane border;

	private Button editButton1;
	private TextField editField1;
	private Text item1;
	private CheckBox check1;
	private HBox box1;

	private Button editButton2;
	private TextField editField2;
	private Text item2;
	private CheckBox check2;
	private HBox box2;

	private Button editButton3;
	private TextField editField3;
	private Text item3;
	private CheckBox check3;
	private HBox box3;

	private Button editButton4;
	private TextField editField4;
	private Text item4;
	private CheckBox check4;
	private HBox box4;

	private Button editButton5;
	private TextField editField5;
	private Text item5;
	private CheckBox check5;
	private HBox box5;

	private Button editButton6;
	private TextField editField6;
	private Text item6;
	private CheckBox check6;
	private HBox box6;

	private Button editButton7;
	private TextField editField7;
	private Text item7;
	private CheckBox check7;
	private HBox box7;

	private Button editButton8;
	private TextField editField8;
	private Text item8;
	private CheckBox check8;
	private HBox box8;

	private Button editButton9;
	private TextField editField9;
	private Text item9;
	private CheckBox check9;
	private HBox box9;

	private Button editButton10;
	private TextField editField10;
	private Text item10;
	private CheckBox check10;
	private HBox box10;

	private Button editButton11;
	private TextField editField11;
	private Text item11;
	private CheckBox check11;
	private HBox box11;

	private Button editButton12;
	private TextField editField12;
	private Text item12;
	private CheckBox check12;
	private HBox box12;

	private Button editButton13;
	private TextField editField13;
	private Text item13;
	private CheckBox check13;
	private HBox box13;

	private Button editButton14;
	private TextField editField14;
	private Text item14;
	private CheckBox check14;
	private HBox box14;

	private Button editButton15;
	private TextField editField15;
	private Text item15;
	private CheckBox check15;
	private HBox box15;

	ArrayList<String> al = new ArrayList<String>();
	int numChecked;

	public static void main(String[] args) {
		launch();

	}

	public void start(Stage stage) throws Exception {
		stage.setTitle("List Maker");
		stage.setResizable(true);
		rootNode = new VBox();
		border = new BorderPane();

		// TOP PART
		hbox = new HBox();
		hbox.setPadding(new Insets(15, 12, 15, 12));
		hbox.setSpacing(5);
		hbox.setStyle("-fx-background-color: #60cde6;");
		closeList = new Button("Close");
		closeList
				.setTooltip(new Tooltip("Clears everything and closes the app"));
		closeList.setPrefHeight(30);
		closeList.setOnAction(new ClickHandler());
		options = FXCollections.observableArrayList(
				"Choose a list background color", "Red list background",
				"Orange list background", "Yellow list background",
				"Green list background", "Blue list background",
				"Purple list background");
		listColor = new ComboBox<String>(options);
		listColor.getSelectionModel().selectFirst();
		listColor.setPrefHeight(30);
		listColor
				.setTooltip(new Tooltip("Set the background color of the list"));
		options2 = FXCollections.observableArrayList(
				"Choose a text background color", "Red text", "Orange text",
				"Yellow text", "Green text", "Blue text", "Purple text");
		textColor = new ComboBox<String>(options2);
		textColor.getSelectionModel().selectFirst();
		textColor.setPrefHeight(30);
		textColor.setTooltip(new Tooltip("Set the color of items in the list"));
		progressIndicator = new ProgressIndicator(0);
		progressIndicator.setTooltip(new Tooltip(
				"Shows the percentage of items in the list checked off"));
		progressIndicator.setPrefWidth(60);
		progressIndicator.setPrefHeight(60);
		progressIndicator.setMinHeight(40);
		progressIndicator.setMinWidth(40);
		addButton = new Button("Add item to list (upto 15 items)");
		addButton.setPrefHeight(30);
		addButton.setTooltip(new Tooltip(
				"Add the item typed on the right to the list"));
		addButton.setOnAction(new ClickHandler());
		addField = new TextField();
		addField.setTooltip(new Tooltip("Type the item you want to add"));
		addField.setPrefWidth(300);
		addField.setText("Replace this text with the item to add to the list");
		addField.setAlignment(Pos.CENTER);
		addField.setPrefHeight(30);
		HBox.setHgrow(addField, Priority.ALWAYS);
		hbox.getChildren().addAll(closeList, listColor, textColor,
				progressIndicator, addButton, addField);
		border.setTop(hbox);

		// FIRST COLUMN - CHECKBOXES
		vbox = new VBox();
		vbox.setPadding(new Insets(15, 12, 15, 12));
		vbox.setSpacing(23);
		vbox.setStyle("-fx-background-color: #FFFF88;");
		check1 = new CheckBox();
		check2 = new CheckBox();
		check3 = new CheckBox();
		check4 = new CheckBox();
		check5 = new CheckBox();
		check6 = new CheckBox();
		check7 = new CheckBox();
		check8 = new CheckBox();
		check9 = new CheckBox();
		check10 = new CheckBox();
		check11 = new CheckBox();
		check12 = new CheckBox();
		check13 = new CheckBox();
		check14 = new CheckBox();
		check15 = new CheckBox();

		check1.setOnAction(new ClickHandler());
		check2.setOnAction(new ClickHandler());
		check3.setOnAction(new ClickHandler());
		check4.setOnAction(new ClickHandler());
		check5.setOnAction(new ClickHandler());
		check6.setOnAction(new ClickHandler());
		check7.setOnAction(new ClickHandler());
		check8.setOnAction(new ClickHandler());
		check9.setOnAction(new ClickHandler());
		check10.setOnAction(new ClickHandler());
		check11.setOnAction(new ClickHandler());
		check12.setOnAction(new ClickHandler());
		check13.setOnAction(new ClickHandler());
		check14.setOnAction(new ClickHandler());
		check15.setOnAction(new ClickHandler());

		check1.setTooltip(new Tooltip("Mark this item done or complete"));
		check2.setTooltip(new Tooltip("Mark this item done or complete"));
		check3.setTooltip(new Tooltip("Mark this item done or complete"));
		check4.setTooltip(new Tooltip("Mark this item done or complete"));
		check5.setTooltip(new Tooltip("Mark this item done or complete"));
		check6.setTooltip(new Tooltip("Mark this item done or complete"));
		check7.setTooltip(new Tooltip("Mark this item done or complete"));
		check8.setTooltip(new Tooltip("Mark this item done or complete"));
		check9.setTooltip(new Tooltip("Mark this item done or complete"));
		check10.setTooltip(new Tooltip("Mark this item done or complete"));
		check11.setTooltip(new Tooltip("Mark this item done or complete"));
		check12.setTooltip(new Tooltip("Mark this item done or complete"));
		check13.setTooltip(new Tooltip("Mark this item done or complete"));
		check14.setTooltip(new Tooltip("Mark this item done or complete"));
		check15.setTooltip(new Tooltip("Mark this item done or complete"));

		border.setLeft(vbox);

		// SECOND COLUMN - LIST ITEMS
		vbox2 = new VBox();
		vbox2.setPadding(new Insets(15, 12, 15, 12));
		vbox2.setSpacing(12);
		vbox2.setStyle("-fx-background-color: #FFFF88;");
		item1 = new Text("");
		item2 = new Text("");
		item3 = new Text("");
		item4 = new Text("");
		item5 = new Text("");
		item6 = new Text("");
		item7 = new Text("");
		item8 = new Text("");
		item9 = new Text("");
		item10 = new Text("");
		item11 = new Text("");
		item12 = new Text("");
		item13 = new Text("");
		item14 = new Text("");
		item15 = new Text("");
		Font font4 = Font.font("arial", FontWeight.NORMAL, FontPosture.REGULAR,
				24);
		item1.setFont(font4);
		item2.setFont(font4);
		item3.setFont(font4);
		item4.setFont(font4);
		item5.setFont(font4);
		item6.setFont(font4);
		item7.setFont(font4);
		item8.setFont(font4);
		item9.setFont(font4);
		item10.setFont(font4);
		item11.setFont(font4);
		item12.setFont(font4);
		item13.setFont(font4);
		item14.setFont(font4);
		item15.setFont(font4);
		vbox2.setAlignment(Pos.CENTER);
		vbox3 = new VBox();
		vbox3.setPadding(new Insets(15, 12, 15, 12));
		vbox3.setSpacing(9);
		vbox3.setStyle("-fx-background-color: #FFFF88;");
		box1 = new HBox();
		box1.setSpacing(5);
		editButton1 = new Button("Replace item");
		editButton1.setPrefHeight(30);
		editField1 = new TextField();
		editField1.setPrefWidth(300);
		editField1.setText("Replace this text with the new item");
		editField1.setAlignment(Pos.CENTER);
		editField1.setPrefHeight(30);
		HBox.setHgrow(editField1, Priority.ALWAYS);
		box1.getChildren().addAll(editButton1, editField1);
		box2 = new HBox();
		box2.setSpacing(5);
		editButton2 = new Button("Replace item");
		editButton2.setPrefHeight(30);
		editField2 = new TextField();
		editField2.setPrefWidth(300);
		editField2.setText("Replace this text with the new item");
		editField2.setAlignment(Pos.CENTER);
		editField2.setPrefHeight(30);
		HBox.setHgrow(editField2, Priority.ALWAYS);
		box2.getChildren().addAll(editButton2, editField2);
		box3 = new HBox();
		box3.setSpacing(5);
		editButton3 = new Button("Replace item");
		editButton3.setPrefHeight(30);
		editField3 = new TextField();
		editField3.setPrefWidth(300);
		editField3.setText("Replace this text with the new item");
		editField3.setAlignment(Pos.CENTER);
		editField3.setPrefHeight(30);
		HBox.setHgrow(editField3, Priority.ALWAYS);
		box3.getChildren().addAll(editButton3, editField3);
		box4 = new HBox();
		box4.setSpacing(5);
		editButton4 = new Button("Replace item");
		editButton4.setPrefHeight(30);
		editField4 = new TextField();
		editField4.setPrefWidth(300);
		editField4.setText("Replace this text with the new item");
		editField4.setAlignment(Pos.CENTER);
		editField4.setPrefHeight(30);
		HBox.setHgrow(editField4, Priority.ALWAYS);
		box4.getChildren().addAll(editButton4, editField4);
		box5 = new HBox();
		box5.setSpacing(5);
		editButton5 = new Button("Replace item");
		editButton5.setPrefHeight(30);
		editField5 = new TextField();
		editField5.setPrefWidth(300);
		editField5.setText("Replace this text with the new item");
		editField5.setAlignment(Pos.CENTER);
		editField5.setPrefHeight(30);
		HBox.setHgrow(editField5, Priority.ALWAYS);
		box5.getChildren().addAll(editButton5, editField5);
		box6 = new HBox();
		box6.setSpacing(5);
		editButton6 = new Button("Replace item");
		editButton6.setPrefHeight(30);
		editField6 = new TextField();
		editField6.setPrefWidth(300);
		editField6.setText("Replace this text with the new item");
		editField6.setAlignment(Pos.CENTER);
		editField6.setPrefHeight(30);
		HBox.setHgrow(editField6, Priority.ALWAYS);
		box6.getChildren().addAll(editButton6, editField6);
		box7 = new HBox();
		box7.setSpacing(5);
		editButton7 = new Button("Replace item");
		editButton7.setPrefHeight(30);
		editField7 = new TextField();
		editField7.setPrefWidth(300);
		editField7.setText("Replace this text with the new item");
		editField7.setAlignment(Pos.CENTER);
		editField7.setPrefHeight(30);
		HBox.setHgrow(editField7, Priority.ALWAYS);
		box7.getChildren().addAll(editButton7, editField7);
		box8 = new HBox();
		box8.setSpacing(5);
		editButton8 = new Button("Replace item");
		editButton8.setPrefHeight(30);
		editField8 = new TextField();
		editField8.setPrefWidth(300);
		editField8.setText("Replace this text with the new item");
		editField8.setAlignment(Pos.CENTER);
		editField8.setPrefHeight(30);
		HBox.setHgrow(editField8, Priority.ALWAYS);
		box8.getChildren().addAll(editButton8, editField8);
		box9 = new HBox();
		box9.setSpacing(5);
		editButton9 = new Button("Replace item");
		editButton9.setPrefHeight(30);
		editField9 = new TextField();
		editField9.setPrefWidth(300);
		editField9.setText("Replace this text with the new item");
		editField9.setAlignment(Pos.CENTER);
		editField9.setPrefHeight(30);
		HBox.setHgrow(editField9, Priority.ALWAYS);
		box9.getChildren().addAll(editButton9, editField9);
		box10 = new HBox();
		box10.setSpacing(5);
		editButton10 = new Button("Replace item");
		editButton10.setPrefHeight(30);
		editField10 = new TextField();
		editField10.setPrefWidth(300);
		editField10.setText("Replace this text with the new item");
		editField10.setAlignment(Pos.CENTER);
		editField10.setPrefHeight(30);
		HBox.setHgrow(editField10, Priority.ALWAYS);
		box10.getChildren().addAll(editButton10, editField10);
		box11 = new HBox();
		box11.setSpacing(5);
		editButton11 = new Button("Replace item");
		editButton11.setPrefHeight(30);
		editField11 = new TextField();
		editField11.setPrefWidth(300);
		editField11.setText("Replace this text with the new item");
		editField11.setAlignment(Pos.CENTER);
		editField11.setPrefHeight(30);
		HBox.setHgrow(editField11, Priority.ALWAYS);
		box11.getChildren().addAll(editButton11, editField11);
		box12 = new HBox();
		box12.setSpacing(5);
		editButton12 = new Button("Replace item");
		editButton12.setPrefHeight(30);
		editField12 = new TextField();
		editField12.setPrefWidth(300);
		editField12.setText("Replace this text with the new item");
		editField12.setAlignment(Pos.CENTER);
		editField12.setPrefHeight(30);
		HBox.setHgrow(editField12, Priority.ALWAYS);
		box12.getChildren().addAll(editButton12, editField12);
		box13 = new HBox();
		box13.setSpacing(5);
		editButton13 = new Button("Replace item");
		editButton13.setPrefHeight(30);
		editField13 = new TextField();
		editField13.setPrefWidth(300);
		editField13.setText("Replace this text with the new item");
		editField13.setAlignment(Pos.CENTER);
		editField13.setPrefHeight(30);
		HBox.setHgrow(editField13, Priority.ALWAYS);
		box13.getChildren().addAll(editButton13, editField13);
		box14 = new HBox();
		box14.setSpacing(5);
		editButton14 = new Button("Replace item");
		editButton14.setPrefHeight(30);
		editField14 = new TextField();
		editField14.setPrefWidth(300);
		editField14.setText("Replace this text with the new item");
		editField14.setAlignment(Pos.CENTER);
		editField14.setPrefHeight(30);
		HBox.setHgrow(editField14, Priority.ALWAYS);
		box14.getChildren().addAll(editButton14, editField14);
		box15 = new HBox();
		box15.setSpacing(5);
		editButton15 = new Button("Replace item");
		editButton15.setPrefHeight(30);
		editField15 = new TextField();
		editField15.setPrefWidth(300);
		editField15.setText("Replace this text with the new item");
		editField15.setAlignment(Pos.CENTER);
		editField15.setPrefHeight(30);

		editField1.setTooltip(new Tooltip(
				"Type the new item you want to replace the current one with"));
		editField2.setTooltip(new Tooltip(
				"Type the new item you want to replace the current one with"));
		editField3.setTooltip(new Tooltip(
				"Type the new item you want to replace the current one with"));
		editField4.setTooltip(new Tooltip(
				"Type the new item you want to replace the current one with"));
		editField5.setTooltip(new Tooltip(
				"Type the new item you want to replace the current one with"));
		editField6.setTooltip(new Tooltip(
				"Type the new item you want to replace the current one with"));
		editField7.setTooltip(new Tooltip(
				"Type the new item you want to replace the current one with"));
		editField8.setTooltip(new Tooltip(
				"Type the new item you want to replace the current one with"));
		editField9.setTooltip(new Tooltip(
				"Type the new item you want to replace the current one with"));
		editField10.setTooltip(new Tooltip(
				"Type the new item you want to replace the current one with"));
		editField11.setTooltip(new Tooltip(
				"Type the new item you want to replace the current one with"));
		editField12.setTooltip(new Tooltip(
				"Type the new item you want to replace the current one with"));
		editField13.setTooltip(new Tooltip(
				"Type the new item you want to replace the current one with"));
		editField14.setTooltip(new Tooltip(
				"Type the new item you want to replace the current one with"));
		editField15.setTooltip(new Tooltip(
				"Type the new item you want to replace the current one with"));

		editButton1
				.setTooltip(new Tooltip(
						"Replace the current item with the new one typed on the right"));
		editButton2
				.setTooltip(new Tooltip(
						"Replace the current item with the new one typed on the right"));
		editButton3
				.setTooltip(new Tooltip(
						"Replace the current item with the new one typed on the right"));
		editButton4
				.setTooltip(new Tooltip(
						"Replace the current item with the new one typed on the right"));
		editButton5
				.setTooltip(new Tooltip(
						"Replace the current item with the new one typed on the right"));
		editButton6
				.setTooltip(new Tooltip(
						"Replace the current item with the new one typed on the right"));
		editButton7
				.setTooltip(new Tooltip(
						"Replace the current item with the new one typed on the right"));
		editButton8
				.setTooltip(new Tooltip(
						"Replace the current item with the new one typed on the right"));
		editButton9
				.setTooltip(new Tooltip(
						"Replace the current item with the new one typed on the right"));
		editButton10
				.setTooltip(new Tooltip(
						"Replace the current item with the new one typed on the right"));
		editButton11
				.setTooltip(new Tooltip(
						"Replace the current item with the new one typed on the right"));
		editButton12
				.setTooltip(new Tooltip(
						"Replace the current item with the new one typed on the right"));
		editButton13
				.setTooltip(new Tooltip(
						"Replace the current item with the new one typed on the right"));
		editButton14
				.setTooltip(new Tooltip(
						"Replace the current item with the new one typed on the right"));
		editButton15
				.setTooltip(new Tooltip(
						"Replace the current item with the new one typed on the right"));
		editButton1.setOnAction(new ClickHandler());
		editButton2.setOnAction(new ClickHandler());
		editButton3.setOnAction(new ClickHandler());
		editButton4.setOnAction(new ClickHandler());
		editButton5.setOnAction(new ClickHandler());
		editButton6.setOnAction(new ClickHandler());
		editButton7.setOnAction(new ClickHandler());
		editButton8.setOnAction(new ClickHandler());
		editButton9.setOnAction(new ClickHandler());
		editButton10.setOnAction(new ClickHandler());
		editButton11.setOnAction(new ClickHandler());
		editButton12.setOnAction(new ClickHandler());
		editButton13.setOnAction(new ClickHandler());
		editButton14.setOnAction(new ClickHandler());
		editButton15.setOnAction(new ClickHandler());

		HBox.setHgrow(editField15, Priority.ALWAYS);
		box15.getChildren().addAll(editButton15, editField15);
		if (!item1.getText().trim().equals("")) {
			vbox.getChildren().addAll(check1);
			vbox2.getChildren().addAll(item1);
			vbox3.getChildren().addAll(box1);
		}
		if (!item2.getText().trim().equals("")) {
			vbox.getChildren().addAll(check2);
			vbox2.getChildren().addAll(item2);
			vbox3.getChildren().addAll(box2);
		}
		if (!item3.getText().trim().equals("")) {
			vbox.getChildren().addAll(check3);
			vbox2.getChildren().addAll(item3);
			vbox3.getChildren().addAll(box3);
		}
		if (!item4.getText().trim().equals("")) {
			vbox.getChildren().addAll(check4);
			vbox2.getChildren().addAll(item4);
			vbox3.getChildren().addAll(box4);
		}
		if (!item5.getText().trim().equals("")) {
			vbox.getChildren().addAll(check5);
			vbox2.getChildren().addAll(item5);
			vbox3.getChildren().addAll(box5);
		}
		if (!item6.getText().trim().equals("")) {
			vbox.getChildren().addAll(check6);
			vbox2.getChildren().addAll(item6);
			vbox3.getChildren().addAll(box6);
		}
		if (!item7.getText().trim().equals("")) {
			vbox.getChildren().addAll(check7);
			vbox2.getChildren().addAll(item7);
			vbox3.getChildren().addAll(box7);
		}
		if (!item8.getText().trim().equals("")) {
			vbox.getChildren().addAll(check8);
			vbox2.getChildren().addAll(item8);
			vbox3.getChildren().addAll(box8);
		}
		if (!item9.getText().trim().equals("")) {
			vbox.getChildren().addAll(check9);
			vbox2.getChildren().addAll(item9);
			vbox3.getChildren().addAll(box9);
		}

		if (!item10.getText().trim().equals("")) {
			vbox.getChildren().addAll(check10);
			vbox2.getChildren().addAll(item10);
			vbox3.getChildren().addAll(box10);
		}
		if (!item11.getText().trim().equals("")) {
			vbox.getChildren().addAll(check11);
			vbox2.getChildren().addAll(item11);
			vbox3.getChildren().addAll(box11);
		}
		if (!item12.getText().trim().equals("")) {
			vbox.getChildren().addAll(check12);
			vbox2.getChildren().addAll(item12);
			vbox3.getChildren().addAll(box12);
		}
		if (!item13.getText().trim().equals("")) {
			vbox.getChildren().addAll(check13);
			vbox2.getChildren().addAll(item13);
			vbox3.getChildren().addAll(box13);
		}
		if (!item14.getText().trim().equals("")) {
			vbox.getChildren().addAll(check14);
			vbox2.getChildren().addAll(item14);
			vbox3.getChildren().addAll(box14);
		}
		if (!item15.getText().trim().equals("")) {
			vbox.getChildren().addAll(check15);
			vbox2.getChildren().addAll(item15);
			vbox3.getChildren().addAll(box15);
		}

		border.setCenter(vbox2);
		border.setRight(vbox3);

		Scene scene = new Scene(rootNode, 1600, 700);
		VBox bottom = new VBox();
		bottom.setStyle("-fx-background-color: #FFFF88;");
		bottom.setMinHeight(Screen.getPrimary().getVisualBounds().getHeight());
		border.setBottom(bottom);

		rootNode.getChildren().addAll(border);
		stage.setScene(scene);
		stage.sizeToScene();
		stage.show();

	}

	private class ClickHandler implements EventHandler<ActionEvent> {

		public void handle(ActionEvent event) {
			if (event.getSource() == check1) {
				if (check1.isSelected()) {
					checkCount++;
					item1.setStrikethrough(true);
				} else {
					checkCount--;
					item1.setStrikethrough(false);
				}
			} else if (event.getSource() == check2) {
				if (check2.isSelected()) {
					checkCount++;
					item2.setStrikethrough(true);
				} else {
					checkCount--;
					item2.setStrikethrough(false);
				}
			} else if (event.getSource() == check3) {
				if (check3.isSelected()) {
					checkCount++;
					item3.setStrikethrough(true);
					
				} else {
					checkCount--;
					item3.setStrikethrough(false);
				}
			} else if (event.getSource() == check4) {
				if (check4.isSelected()) {
					checkCount++;
					item4.setStrikethrough(true);
				} else {
					checkCount--;
					item4.setStrikethrough(false);
				}
			} else if (event.getSource() == check5) {
				if (check5.isSelected()) {
					checkCount++;
					item5.setStrikethrough(true);
				} else {
					checkCount--;
					item5.setStrikethrough(false);
				}
			} else if (event.getSource() == check6) {
				if (check6.isSelected()) {
					checkCount++;
					item6.setStrikethrough(true);
				} else {
					checkCount--;
					item6.setStrikethrough(false);
				}
			} else if (event.getSource() == check7) {
				if (check7.isSelected()) {
					checkCount++;
					item7.setStrikethrough(true);
				} else {
					checkCount--;
					item7.setStrikethrough(false);
				}
			} else if (event.getSource() == check8) {
				if (check8.isSelected()) {
					checkCount++;
					item8.setStrikethrough(true);
				} else {
					checkCount--;
					item8.setStrikethrough(false);
				}
			} else if (event.getSource() == check9) {
				if (check9.isSelected()) {
					checkCount++;
					item9.setStrikethrough(true);
				} else {
					checkCount--;
					item9.setStrikethrough(false);
				}
			} else if (event.getSource() == check10) {
				if (check10.isSelected()) {
					checkCount++;
					item10.setStrikethrough(true);
					
				} else {
					checkCount--;
					item10.setStrikethrough(false);
				}
			} else if (event.getSource() == check11) {
				if (check11.isSelected()) {
					checkCount++;
					item11.setStrikethrough(true);
				} else {
					checkCount--;
					item11.setStrikethrough(false);
				}
			} else if (event.getSource() == check12) {
				if (check12.isSelected()) {
					checkCount++;
					item12.setStrikethrough(true);
				} else {
					checkCount--;
					item12.setStrikethrough(false);
				}
			} else if (event.getSource() == check13) {
				if (check13.isSelected()) {
					checkCount++;
					item13.setStrikethrough(true);
				} else {
					checkCount--;
					item13.setStrikethrough(false);
				}
			} else if (event.getSource() == check14) {
				if (check14.isSelected()) {
					checkCount++;
					item14.setStrikethrough(true);
				} else {
					checkCount--;
					item14.setStrikethrough(false);
				}

			} else if (event.getSource() == check15) {
				if (check15.isSelected()) {
					checkCount++;
					item15.setStrikethrough(true);
				} else {
					checkCount--;
					item15.setStrikethrough(false);
				}

			} else if (event.getSource() == closeList) {
				System.exit(0);
			} else if (event.getSource() == addButton) {
				if (cur == 0) {
					vbox.getChildren().addAll(check1);
					item1.setText(addField.getText());
					vbox2.getChildren().addAll(item1);
					vbox3.getChildren().addAll(box1);
					cur++;
				} else if (cur == 1) {
					vbox.getChildren().addAll(check2);
					item2.setText(addField.getText());
					vbox2.getChildren().addAll(item2);
					vbox3.getChildren().addAll(box2);
					cur++;
				} else if (cur == 2) {
					vbox.getChildren().addAll(check3);
					item3.setText(addField.getText());
					vbox2.getChildren().addAll(item3);
					vbox3.getChildren().addAll(box3);
					cur++;
				} else if (cur == 3) {
					vbox.getChildren().addAll(check4);
					item4.setText(addField.getText());
					vbox2.getChildren().addAll(item4);
					vbox3.getChildren().addAll(box4);
					cur++;
				} else if (cur == 4) {
					vbox.getChildren().addAll(check5);
					item5.setText(addField.getText());
					vbox2.getChildren().addAll(item5);
					vbox3.getChildren().addAll(box5);
					cur++;
				} else if (cur == 5) {
					vbox.getChildren().addAll(check6);
					item6.setText(addField.getText());
					vbox2.getChildren().addAll(item6);
					vbox3.getChildren().addAll(box6);
					cur++;
				} else if (cur == 6) {
					vbox.getChildren().addAll(check7);
					item7.setText(addField.getText());
					vbox2.getChildren().addAll(item7);
					vbox3.getChildren().addAll(box7);
					cur++;
				} else if (cur == 7) {
					vbox.getChildren().addAll(check8);
					item8.setText(addField.getText());
					vbox2.getChildren().addAll(item8);
					vbox3.getChildren().addAll(box8);
					cur++;
				} else if (cur == 8) {
					vbox.getChildren().addAll(check9);
					item9.setText(addField.getText());
					vbox2.getChildren().addAll(item9);
					vbox3.getChildren().addAll(box9);
					cur++;
				} else if (cur == 9) {
					vbox.getChildren().addAll(check10);
					item10.setText(addField.getText());
					vbox2.getChildren().addAll(item10);
					vbox3.getChildren().addAll(box10);
					cur++;
				} else if (cur == 10) {
					vbox.getChildren().addAll(check11);
					item11.setText(addField.getText());
					vbox2.getChildren().addAll(item11);
					vbox3.getChildren().addAll(box11);
					cur++;
				} else if (cur == 11) {
					vbox.getChildren().addAll(check12);
					item12.setText(addField.getText());
					vbox2.getChildren().addAll(item12);
					vbox3.getChildren().addAll(box12);
					cur++;
				} else if (cur == 12) {
					vbox.getChildren().addAll(check13);
					item13.setText(addField.getText());
					vbox2.getChildren().addAll(item13);
					vbox3.getChildren().addAll(box13);
					cur++;
				} else if (cur == 13) {
					vbox.getChildren().addAll(check14);
					item14.setText(addField.getText());
					vbox2.getChildren().addAll(item14);
					vbox3.getChildren().addAll(box14);
					cur++;
				} else if (cur == 14) {
					vbox.getChildren().addAll(check15);
					item15.setText(addField.getText());
					vbox2.getChildren().addAll(item15);
					vbox3.getChildren().addAll(box15);
					cur++;
				}
			} else if (event.getSource() == editButton1) {
				item1.setText(editField1.getText());
			} else if (event.getSource() == editButton2) {
				item2.setText(editField2.getText());
			} else if (event.getSource() == editButton3) {
				item3.setText(editField3.getText());
			} else if (event.getSource() == editButton4) {
				item4.setText(editField4.getText());
			} else if (event.getSource() == editButton5) {
				item5.setText(editField5.getText());
			} else if (event.getSource() == editButton6) {
				item6.setText(editField6.getText());
			} else if (event.getSource() == editButton7) {
				item7.setText(editField7.getText());
			} else if (event.getSource() == editButton8) {
				item8.setText(editField8.getText());
			} else if (event.getSource() == editButton9) {
				item9.setText(editField9.getText());
			} else if (event.getSource() == editButton10) {
				item10.setText(editField10.getText());
			} else if (event.getSource() == editButton11) {
				item11.setText(editField11.getText());
			} else if (event.getSource() == editButton12) {
				item12.setText(editField12.getText());
			} else if (event.getSource() == editButton13) {
				item13.setText(editField13.getText());
			} else if (event.getSource() == editButton14) {
				item14.setText(editField14.getText());
			} else if (event.getSource() == editButton15) {
				item15.setText(editField15.getText());
			}
			progressIndicator.setProgress(checkCount / cur);

		}

	}

}
