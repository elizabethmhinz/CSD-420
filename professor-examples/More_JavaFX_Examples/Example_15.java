/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * BorderPane
 *
 * setTop, setBottom, setLeft, setRight, setCenter
 *
   |----------------|
   |     North      |
   |----------------|
   |   |        |   |
   | E |        | W |
   | a |        | e |
   | s | Center | s |
   | t |        | t |
   |   |        |   |
   |----------------|
   |     South      |
   |----------------|

 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Example_15 extends Application {

  @Override

  public void start(Stage primaryStage) {

    // Create Border Pane 
    BorderPane pane = new BorderPane();

    // Place Nodes in Pane
    pane.setTop(new CustomPane("Top")); 
    pane.setRight(new CustomPane("Right"));
    pane.setBottom(new CustomPane("Bottom"));
    pane.setLeft(new CustomPane("Left"));
    pane.setCenter(new CustomPane("Center")); 
    
    // Create Scene, place in Stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("ShowBorderPane");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
} 

// Define custom Pane to hold Label in center of the Pane
class CustomPane extends StackPane {

  public CustomPane(String title) {

    getChildren().add(new Label(title));
    setStyle("-fx-border-color: red");
    setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
  }
}