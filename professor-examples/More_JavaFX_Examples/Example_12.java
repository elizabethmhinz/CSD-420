/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Display Image
 *
 * Add ImageView(Image) to HBox Pane
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
 *
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Example_12 extends Application {

  @Override
  public void start(Stage primaryStage) {

    // Create HBox Pane to hold Images
    // HBox is-a Pane
    Pane pane = new HBox(10);
    pane.setPadding(new Insets(5, 5, 5, 5));
    Image image = new Image("us.gif");

    // Add ImageView to HBox Pane - instance 1
    pane.getChildren().add(new ImageView(image));
    
    ImageView imageView2 = new ImageView(image);
    imageView2.setFitHeight(100);
    imageView2.setFitWidth(100);

    // Add ImageView to HBox Pane - instance 2
    pane.getChildren().add(imageView2);   

    ImageView imageView3 = new ImageView(image);
    imageView3.setRotate(90);

    // Add ImageView to HBox Pane - instance 3
    pane.getChildren().add(imageView3);     
    
    // Create Scene, place in Stage
    Scene scene = new Scene(pane);
    // Set Stage title
    primaryStage.setTitle("ShowImage");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
  
  public static void main(String[] args) {
    launch(args);
  }
}
