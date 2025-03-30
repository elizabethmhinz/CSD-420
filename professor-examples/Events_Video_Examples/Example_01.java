/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Handle Event
 *
 * HBox = setAlignment at Pos.CENTER
 *
 * Create Event Handler
 * Register Handler
 * 
 * Extends EventHandler
 *  signal sent to a program
 *  source object that creates and fires an event
 *
 * Defines common behavior for all handlers
 * Must uses an instance which is registered with the event source
 * Must override the handler method
 *
 * Handler Class
 *
 */
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Example_01 extends Application {

  @Override
  public void start(Stage primaryStage) {

    HBox pane = new HBox(10);
    // Center pane alignment
    pane.setAlignment(Pos.CENTER);

    Button btOK = new Button("OK");
    Button btCancel = new Button("Cancel");

    // Create Event Handler
    OKHandlerClass oKHandlerClass = new OKHandlerClass();
    // Register Handler
    btOK.setOnAction(oKHandlerClass);

    // Create Event Handler
    CancelHandlerClass cancelHandlerClass = new CancelHandlerClass();
    // Register Handler
    btCancel.setOnAction(cancelHandlerClass);

    pane.getChildren().addAll(btOK, btCancel);
    
    Scene scene = new Scene(pane);
    primaryStage.setTitle("HandleEvent");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
} 

/* 
 * Extends EventHandler
 *  signal sent to a program
 *  source object that creates and fires an event
 *
 * Defines common behavior for all handlers
 * Must uses an instance which is registered with the event source
 * Must override the handler method
 *
 * Handler Class
 */
class OKHandlerClass implements EventHandler<ActionEvent>{

  // Handle event
  @Override
  public void handle(ActionEvent e) {
    System.out.println("OK button clicked"); 
  }
}

/*
 * Handler Class
 */
class CancelHandlerClass implements EventHandler<ActionEvent> {

  // Handle event
  @Override
  public void handle(ActionEvent e) {
    System.out.println("Cancel button clicked");
  }
}
