/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Anonymous Inner-Class
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Example_03 extends Application {

  @Override
  public void start(Stage primaryStage) {

    // Hold two buttons in an HBox
    HBox hBox = new HBox();
    hBox.setSpacing(10);
    hBox.setAlignment(Pos.CENTER);

    Button btNew = new Button("New");
    Button btOpen = new Button("Open");
    Button btSave = new Button("Save");
    Button btPrint = new Button("Print");

    hBox.getChildren().addAll(btNew, btOpen, btSave, btPrint);
    
    // Create and register the handler
    // Anonymous Inner-Class
    btNew.setOnAction(new EventHandler<ActionEvent>() {

      @Override
      public void handle(ActionEvent e) {
        System.out.println("Process New");
      }
    }); // Note the end of the middle clas that is registered

    // Anonymous Inner-Class
    btOpen.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent e) {
        System.out.println("Process Open");
      }
    });
    
    // Anonymous Inner-Class
    btSave.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent e) {
        System.out.println("Process Save");
      }
    });
    
    // Anonymous Inner-Class
    btPrint.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent e) {
        System.out.println("Process Print");
      }
    });  // Note the end of the middle clas that is registered

    Scene scene = new Scene(hBox, 300, 50);
    primaryStage.setTitle("AnonymousHandlerDemo");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
  
  public static void main(String[] args) {
    launch(args);
  }
}
