/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * GridPane
 *
 * Displays nodes in a column/row display
 * column #, row #
 *
 */
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Example_14 extends Application {

  @Override

  public void start(Stage primaryStage) {

    // Create Pane, Set properties
    GridPane pane = new GridPane();
    pane.setAlignment(Pos.CENTER);
    pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
    pane.setHgap(5.5);
    pane.setVgap(5.5);
    
    // Place Nodes in Pane
    pane.add(new Label("First Name:"), 0, 0); // column 0, row 0
    pane.add(new TextField(), 1, 0); // column 1, row 0
    pane.add(new Label("MI:"), 0, 1); // column 0, row 1
    pane.add(new TextField(), 1, 1); // column 1, row 1
    pane.add(new Label("Last Name:"), 0, 2); // column 0, row 2
    pane.add(new TextField(), 1, 2); // column 1, row 2
    Button btAdd = new Button("Add Name");
    pane.add(btAdd, 1, 3); // column 1, row 3
    GridPane.setHalignment(btAdd, HPos.RIGHT);
    
    // Create Scene, Place it Stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("ShowGridPane");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
  
  public static void main(String[] args) {
    launch(args);
  }
} 