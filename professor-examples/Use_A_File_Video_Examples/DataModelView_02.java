/*
 * View 2
 *
 * extends AbstractView
 *
 * Provides updateDisplay()
 */

import java.util.*;
import java.awt.*;

import javax.swing.*;

public class DataModelView_02 extends AbstractView{

  private JTextField currentValue = new JTextField(25);

  public DataModelView_02(ModelObservable modelObservable){

    super(modelObservable);

    currentValue.setEditable(false);
    currentValue.setBackground(Color.green); 
    currentValue.setFont(new Font("SansSerif", Font.BOLD, 12));

    add(new JLabel("Current Value: "));

    add(currentValue);

    updateDisplay();
  }

  public void updateDisplay(){

    currentValue.setText(Integer.toString(getModelObservable().getData()));
  }
}