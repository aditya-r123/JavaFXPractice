/*
 * Name: Aditya Rao
 * Period: 4
 * Date: 3/28/21
 * Take taken: 2 hours
 * 
 * This was a fun but quite time taking lab for me. It took me a while to get the idea of what
 * I wanted to make, but I also spent time researching on the different times of panes to implement.
 * One of the major issues I ran into was with how the right panel of the border pane wasn't showing 
 * initially, and it had to be extended rightward for it to be visible. To resolve this issue, I had 
 * to resize the window, along with a few other fixes. Overall, this was a fun lab for me and I look 
 * forward to make it fully functional in the next lab. 
 */
import java.util.ArrayList;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.stage.Stage;

public class P4_Rao_Aditya_JavaFX_HW2 extends Application {

	ArrayList<String> al = new ArrayList<String>();
	int numChecked;

	public static void main(String[] args) {
		launch();

	}

	public void start(Stage stage) throws Exception {
		stage.setTitle("List Maker");
		stage.setResizable(true);
		VBox rootNode = new VBox();
		BorderPane border = new BorderPane();

		// TOP PART
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(15, 12, 15, 12));
		hbox.setSpacing(5);
		hbox.setStyle("-fx-background-color: #60cde6;");
		Button clearList = new Button("Clear List");
		clearList.setTooltip(new Tooltip("Clear all items in the list"));
		clearList.setPrefHeight(30);
		ObservableList<String> options = FXCollections.observableArrayList(
				"Choose a list background color", "Red list background",
				"Orange list background", "Yellow list background",
				"Green list background", "Blue list background",
				"Purple list background");
		final ComboBox<String> listColor = new ComboBox<String>(options);
		listColor.getSelectionModel().selectFirst();
		listColor.setPrefHeight(30);
		listColor
				.setTooltip(new Tooltip("Set the background color of the list"));
		ObservableList<String> options2 = FXCollections.observableArrayList(
				"Choose a text background color", "Red text", "Orange text",
				"Yellow text", "Green text", "Blue text", "Purple text");
		final ComboBox<String> textColor = new ComboBox<String>(options2);
		textColor.getSelectionModel().selectFirst();
		textColor.setPrefHeight(30);
		textColor.setTooltip(new Tooltip("Set the color of items in the list"));
		ProgressIndicator progressIndicator = new ProgressIndicator(0.6);
		progressIndicator.setTooltip(new Tooltip(
				"Shows the percentage of items in the list checked off"));
		progressIndicator.setPrefWidth(60);
		progressIndicator.setPrefHeight(60);
		progressIndicator.setMinHeight(40);
		progressIndicator.setMinWidth(40);
		Button addButton = new Button("Add Item To List");
		addButton.setPrefHeight(30);
		addButton.setTooltip(new Tooltip(
				"Add the item typed on the right to the list"));
		TextField addField = new TextField();
		addField.setTooltip(new Tooltip("Type the item you want to add"));
		addField.setPrefWidth(300);
		addField.setText("Replace this text with the item to add to the list");
		addField.setAlignment(Pos.CENTER);
		addField.setPrefHeight(30);
		HBox.setHgrow(addField, Priority.ALWAYS);
		hbox.getChildren().addAll(clearList, listColor, textColor,
				progressIndicator, addButton, addField);
		border.setTop(hbox);

		// FIRST COLUMN - CHECKBOXES
		VBox vbox = new VBox();
		vbox.setPadding(new Insets(15, 12, 15, 12));
		vbox.setSpacing(23);
		vbox.setStyle("-fx-background-color: #FFFF88;");
		CheckBox check1 = new CheckBox();
		CheckBox check2 = new CheckBox();
		CheckBox check3 = new CheckBox();
		CheckBox check4 = new CheckBox();
		CheckBox check5 = new CheckBox();
		CheckBox check6 = new CheckBox();
		CheckBox check7 = new CheckBox();
		CheckBox check8 = new CheckBox();
		CheckBox check9 = new CheckBox();
		CheckBox check10 = new CheckBox();
		CheckBox check11 = new CheckBox();
		CheckBox check12 = new CheckBox();
		CheckBox check13 = new CheckBox();
		CheckBox check14 = new CheckBox();
		CheckBox check15 = new CheckBox();
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
		VBox vbox2 = new VBox();
		vbox2.setPadding(new Insets(15, 12, 15, 12));
		vbox2.setSpacing(12);
		vbox2.setStyle("-fx-background-color: #FFFF88;");
		Text item1 = new Text("sdfsdf");
		Text item2 = new Text("sdsfsff");
		Text item3 = new Text("sdsdf");
		Text item4 = new Text("sdsd");
		Text item5 = new Text("sddsfsd");
		Text item6 = new Text("dssdf");
		Text item7 = new Text("sssfd");
		Text item8 = new Text("sdsdsd");
		Text item9 = new Text("sfdssd");
		Text item10 = new Text("ssdsfd");
		Text item11 = new Text("ssddsd");
		Text item12 = new Text("sddfgfg");
		Text item13 = new Text("ssddfsd");
		Text item14 = new Text("sdssdsdd");
		Text item15 = new Text("sdsdsdf");
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
		VBox vbox3 = new VBox();
		vbox3.setPadding(new Insets(15, 12, 15, 12));
		vbox3.setSpacing(9);
		vbox3.setStyle("-fx-background-color: #FFFF88;");
		HBox box1 = new HBox();
		box1.setSpacing(5);
		Button editButton1 = new Button("Replace item");
		editButton1.setPrefHeight(30);
		TextField editField1 = new TextField();
		editField1.setPrefWidth(300);
		editField1.setText("Replace this text with the new item");
		editField1.setAlignment(Pos.CENTER);
		editField1.setPrefHeight(30);
		HBox.setHgrow(editField1, Priority.ALWAYS);
		box1.getChildren().addAll(editButton1, editField1);
		HBox box2 = new HBox();
		box2.setSpacing(5);
		Button editButton2 = new Button("Replace item");
		editButton2.setPrefHeight(30);
		TextField editField2 = new TextField();
		editField2.setPrefWidth(300);
		editField2.setText("Replace this text with the new item");
		editField2.setAlignment(Pos.CENTER);
		editField2.setPrefHeight(30);
		HBox.setHgrow(editField2, Priority.ALWAYS);
		box2.getChildren().addAll(editButton2, editField2);
		HBox box3 = new HBox();
		box3.setSpacing(5);
		Button editButton3 = new Button("Replace item");
		editButton3.setPrefHeight(30);
		TextField editField3 = new TextField();
		editField3.setPrefWidth(300);
		editField3.setText("Replace this text with the new item");
		editField3.setAlignment(Pos.CENTER);
		editField3.setPrefHeight(30);
		HBox.setHgrow(editField3, Priority.ALWAYS);
		box3.getChildren().addAll(editButton3, editField3);
		HBox box4 = new HBox();
		box4.setSpacing(5);
		Button editButton4 = new Button("Replace item");
		editButton4.setPrefHeight(30);
		TextField editField4 = new TextField();
		editField4.setPrefWidth(300);
		editField4.setText("Replace this text with the new item");
		editField4.setAlignment(Pos.CENTER);
		editField4.setPrefHeight(30);
		HBox.setHgrow(editField4, Priority.ALWAYS);
		box4.getChildren().addAll(editButton4, editField4);
		HBox box5 = new HBox();
		box5.setSpacing(5);
		Button editButton5 = new Button("Replace item");
		editButton5.setPrefHeight(30);
		TextField editField5 = new TextField();
		editField5.setPrefWidth(300);
		editField5.setText("Replace this text with the new item");
		editField5.setAlignment(Pos.CENTER);
		editField5.setPrefHeight(30);
		HBox.setHgrow(editField5, Priority.ALWAYS);
		box5.getChildren().addAll(editButton5, editField5);
		HBox box6 = new HBox();
		box6.setSpacing(5);
		Button editButton6 = new Button("Replace item");
		editButton6.setPrefHeight(30);
		TextField editField6 = new TextField();
		editField6.setPrefWidth(300);
		editField6.setText("Replace this text with the new item");
		editField6.setAlignment(Pos.CENTER);
		editField6.setPrefHeight(30);
		HBox.setHgrow(editField6, Priority.ALWAYS);
		box6.getChildren().addAll(editButton6, editField6);
		HBox box7 = new HBox();
		box7.setSpacing(5);
		Button editButton7 = new Button("Replace item");
		editButton7.setPrefHeight(30);
		TextField editField7 = new TextField();
		editField7.setPrefWidth(300);
		editField7.setText("Replace this text with the new item");
		editField7.setAlignment(Pos.CENTER);
		editField7.setPrefHeight(30);
		HBox.setHgrow(editField7, Priority.ALWAYS);
		box7.getChildren().addAll(editButton7, editField7);
		HBox box8 = new HBox();
		box8.setSpacing(5);
		Button editButton8 = new Button("Replace item");
		editButton8.setPrefHeight(30);
		TextField editField8 = new TextField();
		editField8.setPrefWidth(300);
		editField8.setText("Replace this text with the new item");
		editField8.setAlignment(Pos.CENTER);
		editField8.setPrefHeight(30);
		HBox.setHgrow(editField8, Priority.ALWAYS);
		box8.getChildren().addAll(editButton8, editField8);
		HBox box9 = new HBox();
		box9.setSpacing(5);
		Button editButton9 = new Button("Replace item");
		editButton9.setPrefHeight(30);
		TextField editField9 = new TextField();
		editField9.setPrefWidth(300);
		editField9.setText("Replace this text with the new item");
		editField9.setAlignment(Pos.CENTER);
		editField9.setPrefHeight(30);
		HBox.setHgrow(editField9, Priority.ALWAYS);
		box9.getChildren().addAll(editButton9, editField9);
		HBox box10 = new HBox();
		box10.setSpacing(5);
		Button editButton10 = new Button("Replace item");
		editButton10.setPrefHeight(30);
		TextField editField10 = new TextField();
		editField10.setPrefWidth(300);
		editField10.setText("Replace this text with the new item");
		editField10.setAlignment(Pos.CENTER);
		editField10.setPrefHeight(30);
		HBox.setHgrow(editField10, Priority.ALWAYS);
		box10.getChildren().addAll(editButton10, editField10);
		HBox box11 = new HBox();
		box11.setSpacing(5);
		Button editButton11 = new Button("Replace item");
		editButton11.setPrefHeight(30);
		TextField editField11 = new TextField();
		editField11.setPrefWidth(300);
		editField11.setText("Replace this text with the new item");
		editField11.setAlignment(Pos.CENTER);
		editField11.setPrefHeight(30);
		HBox.setHgrow(editField11, Priority.ALWAYS);
		box11.getChildren().addAll(editButton11, editField11);
		HBox box12 = new HBox();
		box12.setSpacing(5);
		Button editButton12 = new Button("Replace item");
		editButton12.setPrefHeight(30);
		TextField editField12 = new TextField();
		editField12.setPrefWidth(300);
		editField12.setText("Replace this text with the new item");
		editField12.setAlignment(Pos.CENTER);
		editField12.setPrefHeight(30);
		HBox.setHgrow(editField12, Priority.ALWAYS);
		box12.getChildren().addAll(editButton12, editField12);
		HBox box13 = new HBox();
		box13.setSpacing(5);
		Button editButton13 = new Button("Replace item");
		editButton13.setPrefHeight(30);
		TextField editField13 = new TextField();
		editField13.setPrefWidth(300);
		editField13.setText("Replace this text with the new item");
		editField13.setAlignment(Pos.CENTER);
		editField13.setPrefHeight(30);
		HBox.setHgrow(editField13, Priority.ALWAYS);
		box13.getChildren().addAll(editButton13, editField13);
		HBox box14 = new HBox();
		box14.setSpacing(5);
		Button editButton14 = new Button("Replace item");
		editButton14.setPrefHeight(30);
		TextField editField14 = new TextField();
		editField14.setPrefWidth(300);
		editField14.setText("Replace this text with the new item");
		editField14.setAlignment(Pos.CENTER);
		editField14.setPrefHeight(30);
		HBox.setHgrow(editField14, Priority.ALWAYS);
		box14.getChildren().addAll(editButton14, editField14);
		HBox box15 = new HBox();
		box15.setSpacing(5);
		Button editButton15 = new Button("Replace item");
		editButton15.setPrefHeight(30);
		TextField editField15 = new TextField();
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

		// vbox.setMinWidth(100);
		// vbox2.setMinWidth(300);

		Scene scene = new Scene(rootNode, 1600, 700);
		VBox bottom = new VBox();
		bottom.setStyle("-fx-background-color: #FFFF88;");
		bottom.setPrefHeight(Integer.MAX_VALUE-1000);
		border.setBottom(bottom);

		rootNode.getChildren().addAll(border);
		stage.setScene(scene);
		stage.sizeToScene();
		stage.show();

	}

}
