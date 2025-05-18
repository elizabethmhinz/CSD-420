/*
 * View - Abstract
 */
/*
 *
 * Provides one method an extended must implement
 *
 * updateDisplay();
 *
 */
import java.util.*;
import java.awt.*;

import javax.swing.JPanel;
import javax.swing.border.*;

public abstract class AbstractDataView extends JPanel implements Observer{

  private DataModel dataModel;

  public AbstractDataView(DataModel observableData) throws NullPointerException{

    if(observableData == null){

      throw new NullPointerException();
    }

    dataModel = observableData;

    dataModel.addObserver(this);

    setBackground(Color.white);
    setBorder(new MatteBorder(1,1,1,1,Color.black));
  }

  public DataModel getDataModel(){

    return dataModel;
  }

  protected abstract void updateDisplay();

  public void update(Observable observable, Object object){

    updateDisplay();
  }
}