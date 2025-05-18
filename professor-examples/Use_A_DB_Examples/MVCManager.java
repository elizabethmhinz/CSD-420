/*
 *
 * Run This Class
 *
 * Application
 *
 * GUI Container for All GUI Items
 */

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class MVCManager extends JFrame{

  public MVCManager(){

    super("DataModel Controler");

    DataModel dataModel = new DataModel();
/*********************************************************************************/
    JPanel dataPanel1 = new JPanel();

    dataPanel1.setBackground(Color.orange);

    dataPanel1.setBorder(new TitledBorder("Team Selected"));

    DataModelTextView dataModelTextView_01 = new DataModelTextView(dataModel);

    dataPanel1.add(dataModelTextView_01);
/*********************************************************************************/
    JPanel dataPanel2 = new JPanel();

    dataPanel2.setBorder(new TitledBorder("Percent Years Appeared in Series"));

    DataModelPieView dataModelPieView_02 = new DataModelPieView(dataModel);

    dataPanel2.add(dataModelPieView_02);
/*********************************************************************************/
    JPanel dataPanel3 = new JPanel();

    dataPanel3.setBorder(new TitledBorder("Percent Games Wons vs Games Lost"));

    DataModelPieView2 dataModelPieView_03 = new DataModelPieView2(dataModel);

    dataPanel3.add(dataModelPieView_03);
/*********************************************************************************/
    JPanel dataPanel4 = new JPanel();

    dataPanel4.setBorder(new TitledBorder("Percent World Series Wons vs Series lost"));

    DataModelPieView3 dataModelPieView_04 = new DataModelPieView3(dataModel);

    dataPanel4.add(dataModelPieView_04);
/*********************************************************************************/
    JPanel dataPanel5 = new JPanel();

    dataPanel5.setBackground(Color.orange);

    dataPanel5.setBorder(new TitledBorder("Submit Team"));

    DataModelController dataModelController_05 = new DataModelController(dataModel);

    dataPanel5.add(dataModelController_05);
/*********************************************************************************/
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    this.setSize(430, 630);

    this.getContentPane().setLayout(null);

    this.getContentPane().add(dataPanel1);
    dataPanel1.setBounds(new Rectangle(0, 0, 420, 75));

    this.getContentPane().add(dataPanel2);
    dataPanel2.setBounds(new Rectangle(0, 75, 420, 150));

    this.getContentPane().add(dataPanel3);
    dataPanel3.setBounds(new Rectangle(0, 225, 420, 150));

    this.getContentPane().add(dataPanel4);
    dataPanel4.setBounds(new Rectangle(0, 375, 420, 150));

    this.getContentPane().add(dataPanel5);
    dataPanel5.setBounds(new Rectangle(0, 525, 420, 75));

    this.setVisible(true);
  }

  public static void main(String [] args){

    MVCManager mvc = new MVCManager();

  }
}