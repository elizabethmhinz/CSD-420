/*
 * View #1
 */

import java.util.*;
import java.awt.*;

import javax.swing.*;

public class DataModelTextView extends AbstractDataView{

  private JTextField teamSelected = new JTextField(25);

  public DataModelTextView(DataModel dataModel){

    super(dataModel);

    teamSelected.setEditable(false);
    teamSelected.setBackground(Color.orange); 
    teamSelected.setFont(new Font("SansSerif", Font.BOLD, 12));

    add(new JLabel("Team Selected: "));

    add(teamSelected);

    updateDisplay();
  }

  public void updateDisplay(){

    teamSelected.setText(getDataModel().getTeam());
  }
}