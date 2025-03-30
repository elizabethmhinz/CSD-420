/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * HBox - Displays in only one row
 * VBox - Displays in only one column
 *
 * HBox - places nodes horizontally
 * Constructors of the class:
 *   HBox(): Creates an HBox object with no nodes.
 *   HBox(double s): Creates an HBox with spacing in between nodes.
 * https://www.geeksforgeeks.org/javafx-hbox-class/
 *
 * VBox - places nodes vertically
 * Constructor of the class:
 *   VBox(): Creates a VBox layout with spacing = 0 and alignment at TOP_LEFT.
 *   VBox(double s): Creates a new VBox with specified spacing between children.
 *   VBox(double s, Node... c): Creates a new VBox with specified nodes and spacing between them.
 *   VBox(Node... c): Creates an VBox layout with spacing = 0.
 * https://www.geeksforgeeks.org/javafx-vbox-class/
 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Example_21 extends Application {

  @Override
  public void start(Stage primaryStage) {

    BorderPane pane = new BorderPane();

    // Place Nodes in Pane
    pane.setTop(getHBox()); 
    pane.setLeft(getVBox());
    
    // Create Scene, place in Stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("Show - HBox - VBox");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
  
  // Create and return HBox
  private HBox getHBox() {

    HBox hBox = new HBox(15); 
    hBox.setPadding(new Insets(15, 15, 15, 15));
    hBox.setStyle("-fx-background-color: gold");
    hBox.getChildren().add(new Button("Computer Science - HBox"));
    hBox.getChildren().add(new Button("Chemistry"));
    ImageView imageView = new ImageView(new Image("us.gif"));
    hBox.getChildren().add(imageView);

    return hBox;
  }
  
  // Create and return VBox
  private VBox getVBox() {

    VBox vBox = new VBox(15);
    vBox.setPadding(new Insets(15, 5, 5, 5));
    vBox.getChildren().add(new Label("Courses - VBox"));
    
    Label[] courses = {new Label("CSCI 1301"), new Label("CSCI 1302"), 
        new Label("CSCI 2410"), new Label("CSCI 3720")};

    for (Label course: courses) {
      VBox.setMargin(course, new Insets(0, 0, 0, 15));
      vBox.getChildren().add(course);
    }
    
    return vBox;
  }
  public static void main(String[] args) {
    launch(args);
  }
} 
