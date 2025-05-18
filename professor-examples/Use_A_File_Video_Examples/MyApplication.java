/*
 * GUI Container for All GUI Items
 * 
 * The Main Java Class
 *
 */
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class MyApplication extends JFrame{

  public MyApplication(){

    super("MyApplication manager");

    ModelObservable modelObservable = new ModelObservable();
/*********************************************************************************/
    JPanel dataPanel1 = new JPanel();

    dataPanel1.setBackground(Color.orange);

    dataPanel1.setBorder(new TitledBorder("Team Selected"));

    DataModelView_01 dataModelView_01 = new DataModelView_01(modelObservable);

    dataPanel1.add(dataModelView_01);
/*********************************************************************************/
    JPanel dataPanel2 = new JPanel();

    dataPanel2.setBackground(Color.green);

    dataPanel2.setBorder(new TitledBorder("Team Selected"));

    DataModelView_02 dataModelView_02 = new DataModelView_02(modelObservable);

    dataPanel2.add(dataModelView_02);
/*********************************************************************************/
    JPanel dataPanel5 = new JPanel();

    dataPanel5.setBackground(Color.white);

    dataPanel5.setBorder(new TitledBorder("Submit Team"));

    DataModelController dataModelController = new DataModelController(modelObservable);

    dataPanel5.add(dataModelController);
/*********************************************************************************/
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    this.setSize(430, 260);

    this.getContentPane().setLayout(null);

    this.getContentPane().add(dataPanel1);
    dataPanel1.setBounds(new Rectangle(0, 0, 420, 75));

    this.getContentPane().add(dataPanel2);
    dataPanel2.setBounds(new Rectangle(0, 75, 420, 75));

    this.getContentPane().add(dataPanel5);
    dataPanel5.setBounds(new Rectangle(0, 150, 420, 75));

    this.setVisible(true);
  }

  public static void main(String [] args){

    MyApplication myApplication = new MyApplication();

  }
}