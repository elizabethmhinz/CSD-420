/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Groups
 */
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;

public class Example_23 extends Application {

  @Override
  public void start(Stage primaryStage) {       

    // Create Rectangles 
    Rectangle r1 = new Rectangle(25, 10, 60, 30);
      r1.setStroke(Color.BLACK);
      r1.setFill(Color.WHITE);    
    Rectangle r2 = new Rectangle(25, 50, 60, 30);    
      r2.setStroke(Color.GREEN);
      r2.setFill(Color.ORANGE);    
    Rectangle r3 = new Rectangle(25, 90, 60, 30);
      r3.setStroke(Color.BLUE);
      r3.setFill(Color.RED);    
      r3.setArcWidth(25);
      r3.setArcHeight(25);    
    
    // Create Group, add Nodes to Group
    Group group = new Group();
    group.getChildren().addAll(new Text(10, 27, "r1"), r1, 
      new Text(10, 67, "r2"), r2, new Text(10, 107, "r3"), r3);
    
    for (int i = 0; i < 4; i++) {

      // Random Colors used
      Rectangle r = new Rectangle(100, 50, 100, 30);
        // Differently rotate each rectangle 
        r.setRotate(i * 360 / 8);
        // Randomly select color border
        r.setStroke(Color.color(Math.random(), Math.random(), 
          Math.random()));
        // Randomly select fill color
        r.setFill(Color.color(Math.random(), Math.random(), 
          Math.random()));
        // r.setFill(Color.WHITE);

      // Add each Rectangle to Group
      group.getChildren().add(r);
    }
    
    // Create Scene, place Group in Border Layout, place in Stage
    // Create Scene, place Group in BorderPane, place in Scene
    Scene scene = new Scene(new BorderPane(group), 250, 150);
    primaryStage.setTitle("ShowRectangle");
    // Place Scene in Stage
    primaryStage.setScene(scene);
    primaryStage.show();
  }
  
  public static void main(String[] args) {
    launch(args);
  }
}
