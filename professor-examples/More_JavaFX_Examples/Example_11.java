/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Font
 * Color
 * 
 * BEIGE, BLACK, BLUE, BROWN,
 * CYAN, DARKGRAY, GOLD, GRAY, LIGHTGRAY, MAGENTA, NAVY, 
 * ORANGE, PINK, RED, SILVER, WHITE, Yellow
 *
 * Add Circle to Pane
 * Add Label to Pane
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class Example_11 extends Application {

/*
 *  Color [] colors = {Color.BEIGE, Color.BLACK, Color.BLUE, Color.BROWN,
 *                     Color.CYAN, Color.DARKGRAY, Color.GOLD, Color.GRAY, 
 *                     Color.LIGHTGRAY, Color.MAGENTA, Color.NAVY, Color.ORANGE, 
 *                     Color.PINK, Color.RED, Color.SILVER, Color.WHITE, Color.YELLOW};
 */
  @Override
  public void start(Stage primaryStage) {    

    // Create pane to hold Circle 
    // StackPane is-a Pane
    Pane pane = new StackPane();
    
    // Create Circle, set properties
    Circle circle = new Circle();
    circle.setRadius(100);
    circle.setStroke(Color.RED); 
    circle.setFill((Color.BLACK));

    // Add Circle to Pane
    pane.getChildren().add(circle);


    // Create Label, set properties
    Label label = new Label("JavaFX");
    label.setTextFill(Color.RED);

//    label.setFont(Font.font("Courier New", 
    label.setFont(Font.font("Times New Roman", 
    FontWeight.BOLD, FontPosture.ITALIC, 20));

    // Add Label to Pane
    pane.getChildren().add(label);

    // Create Scene, place in Stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("FontDemo");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
