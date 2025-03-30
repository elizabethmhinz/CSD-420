/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * FlowPane holds nodes
 *
 * Flowpane lays out its children in such a way that wraps at the flowpane’s boundary. 
 *   A horizontal flowpane (the default) will layout nodes in rows, wrapping at the flowpane’s width. 
 *   A vertical flowpane lays out nodes in columns, wrapping at the flowpane’s height. FlowPane class inherits Pane class.
 * Constructors of the class:
 *   FlowPane()
 *   FlowPane(double h, double v)
 *   FlowPane(double h, double v, Node... c)
 *   FlowPane(Node... c)
 *   FlowPane(Orientation o)
 *   FlowPane(Orientation o, double h, double v)
 *   FlowPane(Orientation o, double h, double v, Node... c)
 *   FlowPane(Orientation o, Node... c)
 * https://www.geeksforgeeks.org/javafx-flowpane-class/
 *
 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Example_13 extends Application {

  @Override
  public void start(Stage primaryStage) {

    // Create FlowPane, Set properties
    FlowPane pane = new FlowPane();
    pane.setPadding(new Insets(11, 12, 13, 14));
    pane.setHgap(5);
    pane.setVgap(5);

    // Place Nodes in FlowPane
    
    pane.getChildren().addAll(new Label("First Name:"), 
      new TextField(), new Label("MI:"));

    TextField tfMi = new TextField();
    tfMi.setPrefColumnCount(1);

    // Add Label to FlowPane
    pane.getChildren().addAll(tfMi, new Label("Last Name:"),
      new TextField());
    
    // Create Scene, place in Stage
    //                            width   height
    Scene scene = new Scene(pane, 350,    100);
    primaryStage.setTitle("ShowFlowPane");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
  
  public static void main(String[] args) {
    launch(args);
  }
}
