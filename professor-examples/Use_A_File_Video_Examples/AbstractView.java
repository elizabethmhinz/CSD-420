/*
 * Abstract View
 *
 * Provides one method an extended class must implement
 *
 * updateDisplay();
 *
 * The V - View layer of the MVC design pattern represents the output of the application.
 * The View layer displays the data.
 *
 */
import java.util.*;
import java.awt.*;

import javax.swing.JPanel;
import javax.swing.border.*;

public abstract class AbstractView extends JPanel implements Observer{

  private ModelObservable modelObservable;

  public AbstractView(ModelObservable modelObservable) throws NullPointerException{

    if(modelObservable == null){

      throw new NullPointerException();
    }

    this.modelObservable = modelObservable;

    modelObservable.addObserver(this);

    setBackground(Color.white);
    setBorder(new MatteBorder(1,1,1,1,Color.black));
  }

  public ModelObservable getModelObservable(){

    return modelObservable;
  }

  protected abstract void updateDisplay();

  public void update(Observable observable, Object object){

    updateDisplay();
  }
}