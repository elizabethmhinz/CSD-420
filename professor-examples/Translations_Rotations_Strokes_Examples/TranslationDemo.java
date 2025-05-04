/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Translate Coordinates
 *  
 * This is an example from our text.
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TranslationDemo extends Application {

  /*
   * Override the start method in the Application class
   */
  @Override
  public void start(Stage primaryStage) {   

    Pane pane = new Pane();

    double x = 10; 
    double y = 10;
    java.util.Random random = new java.util.Random();

    for (int i = 0; i < 10; i++) {

      Rectangle rectangle = new Rectangle(10, 10, 50, 60); 
 
      rectangle.setFill(Color.color(random.nextDouble(), 
        random.nextDouble(), random.nextDouble()));

      rectangle.setStroke(Color.color(random.nextDouble(), 
        random.nextDouble(), random.nextDouble()));

      /*
       * X
       * Moves node 20 pixels to the right
       * rectangle.setTranslateX(x += 20);
       * Moves node 20 pixels to the left
       * rectangle.setTranslateX(x -= 20);
       * 
       * Y
       * Moves node 5 pixels down
       * rectangle.setTranslateY(y += 5);
       * Moves node 5 pixels up
       * rectangle.setTranslateY(y -= 5);
       */
      rectangle.setTranslateX(x += 20);
      rectangle.setTranslateY(y += 5);
      pane.getChildren().add(rectangle);
    }

    Scene scene = new Scene(pane, 300, 250);  
    /*
     * Set the window title
     */         
    primaryStage.setTitle("TranslationDemo");
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
   * Lauch the program from command-line
   */
  public static void main(String[] args) {
    launch(args);
  }
}


