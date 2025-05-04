/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Rotations
 *
 * Theta - Anchor Point - Pivot Point
 *   Rotates coordinates around an anchor point
 *   A double value in degrees
 *
 * Positive - Clockwise
 * Negative = Counter Clockwise
 *
 * This is an example from our text.
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RotateDemo extends Application {

  /*
   * Override the start method in the Application class
   */
  @Override

  public void start(Stage primaryStage) {   

    Pane pane = new Pane();
    java.util.Random random = new java.util.Random();
    /*
     * The radius of the circle for anchoring rectangles
     */
    double radius = 90; 
    /*
     * Width of the rectangle
     */
    double width = 20;
    /*
     * Height of the rectangle
     */
    double height = 40;

    /*
     * for (int i = 0; i < 8; i++) {
     * Used to show direction
     */
    for (int i = 0; i < 8; i++) {

      /*
       * Center of a rectangle around the loop
       * Try -i
       */
      double x = 150 + radius * Math.cos(i * 2 * Math.PI / 8);
      double y = 150 + radius * Math.sin(i * 2 * Math.PI / 8);   
           
      Rectangle rectangle = new Rectangle(
        x - width / 2, y - height / 2, width, height);  

      rectangle.setFill(Color.color(random.nextDouble(), 
        random.nextDouble(), random.nextDouble()));
      rectangle.setStroke(Color.color(random.nextDouble(), 
        random.nextDouble(), random.nextDouble()));

      /*
       * Rotate the (each) rectangle
       */
      rectangle.setRotate(i * 360 / 8); 
      pane.getChildren().add(rectangle);
    }

    Scene scene = new Scene(pane, 300, 300);           
    /*
     * Set the window title
     */
    primaryStage.setTitle("RotateDemo");
    /*
     * Place the scene in the window
     */
    primaryStage.setScene(scene); 
    /*
     * Display the window
     */
    primaryStage.show();
  }

  /*
   * Launch the program from command-line
   */
  public static void main(String[] args) {

    launch(args);
  }
}


