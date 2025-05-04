/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Strokes
 *
 * Paints a stroke
 * setStroke
 *
 * Set width of a stroke
 * setStrokeWidth
 *
 * Set stoke type
 *   StrokeType.INSIDE
 *   StrokeType.OUTSIDE
 *   StrokeType.CENTERED
 * setStrokeType(StrokeType.INSIDE)
 * 
 * Set stroke end types
 * setStrokeLineCap(StrokeLineCap.BUTT)
 *   StrokeLineCap.BUTT
 *   StrokeLineCap.ROUND
 *   StrokeLineCap.SQUARE
 * 
 * Set stroke line join
 * setStrokeLineJoin(StrokeLineJoin.ROUND)
 *   StrokeLineJoin.ROUND
 *   StrokeLineJoin.BEVEL
 *   StrokeLineJoin.MITER
 *
 * This is an example from our text.
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.*;
  
public class StrokeDemo extends Application {

  @Override
  public void start(Stage primaryStage) { 

    Rectangle rectangle1 = new Rectangle(20, 20, 70, 120);
    rectangle1.setFill(Color.WHITE);
    rectangle1.setStrokeWidth(15);
    rectangle1.setStroke(Color.ORANGE);
      
    Rectangle rectangle2 = new Rectangle(20, 20, 70, 120);
    rectangle2.setFill(Color.WHITE);
    rectangle2.setStrokeWidth(15);
    rectangle2.setStroke(Color.ORANGE);
    rectangle2.setTranslateX(100);
    rectangle2.setStrokeLineJoin(StrokeLineJoin.BEVEL);
       
    Rectangle rectangle3 = new Rectangle(20, 20, 70, 120);
    rectangle3.setFill(Color.WHITE);
    rectangle3.setStrokeWidth(15);
    rectangle3.setStroke(Color.ORANGE);
    rectangle3.setTranslateX(200);
    rectangle3.setStrokeType(StrokeType.INSIDE);
    rectangle3.setStrokeLineJoin(StrokeLineJoin.ROUND);
         
    Line line1 = new Line(320, 20, 420, 20);
    line1.setStrokeLineCap(StrokeLineCap.BUTT);
    line1.setStrokeWidth(20);
      
    Line line2 = new Line(320, 70, 420, 70);
    line2.setStrokeLineCap(StrokeLineCap.ROUND);
    line2.setStrokeWidth(20);
     
    Line line3 = new Line(320, 120, 420, 120);
    line3.setStrokeLineCap(StrokeLineCap.SQUARE);
    line3.setStrokeWidth(20);
  
    Line line4 = new Line(460, 20, 560, 120);
    line4.getStrokeDashArray().addAll(10.0, 20.0, 30.0, 40.0);
    
    Pane pane = new Pane();
    pane.getChildren().addAll(rectangle1, rectangle2, rectangle3,
    line1, line2, line3, line4);
  
    Scene scene = new Scene(pane, 610, 180);           
    primaryStage.setTitle("StrokeDemo");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  /*
   * Launch the program from command-line
   */
  public static void main(String[] args) {
    launch(args);
  }
}