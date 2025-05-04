/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Some additional advanced features for developing GUI applications
 *
 * JavaFX Cascading Style Sheets CSS are "based" on CSS with some extensions
 * Used to define style separated from UI code
 *  
 * This is an example from our text.
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class StyleSheetDemo extends Application {

  /*
   * Override the start method in the Application class
   */
  @Override
  public void start(Stage primaryStage) {

    HBox hBox = new HBox(5);
    Scene scene = new Scene(hBox, 400, 250);   
    /*
     * Load the stylesheet
     * Adds to the stylesheets property - 
     *    Loads the style sheet from the file mystyle.css
     * File location in the same directory as the .java file
     */     
    scene.getStylesheets().add("mystyle.css");
    Pane pane1 = new Pane();
    Circle circle1 = new Circle(50, 50, 30);
    Circle circle2 = new Circle(150, 50, 30);
    Circle circle3 = new Circle(100, 100, 30);
    pane1.getChildren().addAll(circle1, circle2, circle3);
    /*
     * Style class is set for this panel
     */
    pane1.getStyleClass().add("border");
    
    /*
     * Add a style class
     */
    circle1.getStyleClass().add("plaincircle");
    circle2.getStyleClass().add("plaincircle");
    /*
     * Add a style ID
     */
    circle3.setId("redcircle");
    
    Pane pane2 = new Pane();
    Circle circle4 = new Circle(100, 100, 30);
    /*
     * Sets Style class for circle4
     */
    circle4.getStyleClass().addAll("circleborder", "plainCircle"); 
    /*
     * Add a style ID
     */
    circle4.setId("greencircle");
    pane2.getChildren().add(circle4);
    pane2.getStyleClass().add("border");

    hBox.getChildren().addAll(pane1, pane2); 
    
    /*
     * Set the window title
     */
    primaryStage.setTitle("StyleSheetDemo");
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
