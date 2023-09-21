import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Demo extends Application {

	public static void main(String[] args) {
		launch();
	}

	public void start(Stage stage) throws Exception {
		stage.setTitle("User Login");

		VBox rootNode = new VBox();
		rootNode.setAlignment(Pos.CENTER);
		rootNode.setPadding(new Insets(20));
		rootNode.setSpacing(10);

		// Top region (username)
		HBox topBox = new HBox();
		//topBox.setBackground(new Background(new BackgroundFill(Color.GREENYELLOW, new CornerRadii(0), new Insets(0))));
		topBox.setSpacing(10.0);
		Label nameLbl = new Label("Username");
		nameLbl.setMinWidth(80);
		TextField nameField = new TextField();
		nameField.setPrefWidth(300);
		HBox.setHgrow(nameField, Priority.ALWAYS);
		ColorPicker c = new ColorPicker();
		c.accessibleTextProperty();
		topBox.getChildren().addAll(nameLbl, nameField, c);

		// Middle region (passwords)
		HBox midBox = new HBox();
		midBox.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(0), new Insets(0))));

		midBox.setSpacing(10.0);
		Label pwdLbl = new Label("Password");
		pwdLbl.setMinWidth(80);
		PasswordField pwdField = new PasswordField();
		HBox.setHgrow(pwdField, Priority.ALWAYS);
		midBox.getChildren().addAll(pwdLbl, pwdField);

		// Bottom region (buttons)
		HBox bottomBox = new HBox();
		bottomBox.setBackground(new Background(new BackgroundFill(Color.GREENYELLOW, new CornerRadii(0), new Insets(0))));
		bottomBox.setAlignment(Pos.CENTER_RIGHT);
		bottomBox.setSpacing(10);

		Button okBtn = new Button("Ok");
		Button cancelBtn = new Button("Cancel");
		bottomBox.getChildren().addAll(okBtn, cancelBtn);

		rootNode.getChildren().addAll(topBox, midBox, bottomBox);

		Scene scene = new Scene(rootNode);
		stage.setScene(scene);
		stage.sizeToScene();
		stage.show();

	}
}
