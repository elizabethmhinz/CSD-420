/*
 * Controller
 * 
 * The C - Controller is an interface between Model and View.
 *
 */
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class DataModelController extends JPanel{

  private ModelObservable modelObservable;

  private JButton increaseBtn;
  private JButton decreaseBtn;

  public DataModelController(ModelObservable modelObservable){

    super();

    this.modelObservable = modelObservable;

    increaseBtn = new JButton("Increase");
    decreaseBtn = new JButton("Decrease");

    setBackground(Color.white);

    increaseBtn.addActionListener(

      new ActionListener(){

        public void actionPerformed(ActionEvent event){

          DataModelController.this.modelObservable.increase();
        }
      }
    );


    decreaseBtn.addActionListener(

      new ActionListener(){

        public void actionPerformed(ActionEvent event){

          DataModelController.this.modelObservable.decrease();
        }
      }
    );

    setLayout(new FlowLayout());
    add(increaseBtn);
    add(decreaseBtn);
  }
}