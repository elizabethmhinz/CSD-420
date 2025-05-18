/*
 * Controller
 */

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class DataModelController extends JPanel{

  private DataModel dataModel;

  private JComboBox teamComboBox;

  public DataModelController(DataModel dm){

    super();

    dataModel = dm;

    teamComboBox = new JComboBox(dataModel.getTeamList());

    JButton selectTeam = new JButton("Select Team");

    setBackground(Color.white);

    selectTeam.addActionListener(

      new ActionListener(){

        public void actionPerformed(ActionEvent event){

          /*
           * Data changed here
           */
          dataModel.setTeam((teamComboBox.getSelectedItem()).toString());
        }
      }
    );

    setLayout(new FlowLayout());
    add(teamComboBox);
    add(selectTeam);
  }
}