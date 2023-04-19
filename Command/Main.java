package Command;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Command Pattern");
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();


        Light light = new Light();
        Command command = new FlipUpCommand(light);
        WallButton button1 = new WallButton("ylös", command);
        WallButton button2 = new WallButton("alas", command);

        root.setTop(button1);
        root.setBottom(button2);

        button1.setOnAction(e -> command.execute());
        button2.setOnAction(e -> command.execute());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
