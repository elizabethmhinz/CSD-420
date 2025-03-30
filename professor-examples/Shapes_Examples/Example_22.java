/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Text
 *
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;

public class Example_22 extends Application {

  @Override
  public void start(Stage primaryStage) {

    // Create Pane to hold and display texts
    Pane pane = new Pane();
    pane.setPadding(new Insets(5, 5, 5, 5));
    Text text1 = new Text(30, 30, "Programming is fun\nDisplay text");
    text1.setFont(Font.font("Courier", FontWeight.BOLD, 
      FontPosture.ITALIC, 15));
    pane.getChildren().add(text1);     

    // Note newlines in display "\n"
    Text text2 = new Text(80, 80, "Programming is fun\nDisplay text");
    pane.getChildren().add(text2);     

    // Note newlines in display "\n"
    Text text3 = new Text(10, 130, "Programming is fun\nDisplay text");
    text3.setFill(Color.RED);

    // Underline
    text3.setUnderline(true);
    // Strikethrough
    text3.setStrikethrough(true);    
    pane.getChildren().add(text3); 
    
    // Create Scene and place in Stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("ShowText");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
  
  public static void main(String[] args) {
    launch(args);
  }
}
