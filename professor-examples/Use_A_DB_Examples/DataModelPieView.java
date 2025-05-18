/*
 * View #2
 */

import java.awt.*;
import java.util.*;
import java.text.*;

import javax.swing.*;
import javax.swing.border.*;

public class DataModelPieView extends AbstractDataView{

  public DataModelPieView(DataModel dataModel){

    super(dataModel);

    updateDisplay();
  }

  public void paintComponent(Graphics g){


    super.paintComponent(g);

    drawPieChartWins(g);
  }

  private void drawPieChartWins(Graphics g){

    DecimalFormat pattern = new DecimalFormat("0.00");

    double percentage = 0.0;
    int startAngle = 0;
    int arcAngle = 0;

    g.setColor(Color.orange);

    percentage = getDataModel().getPercentSeriesAppeared();

    arcAngle = (int) Math.round(percentage * 360);

    g.fillArc(5, 5, 100, 100, 90, -1 * arcAngle);

    g.setColor(Color.darkGray);

    g.fillArc(5, 5, 100, 100, 90, 360 - arcAngle);

    g.setColor(Color.black);

    g.setFont(new Font("SansSerif", Font.BOLD, 12));

    g.drawString("Percent Appearences in World Series", 130, 15);
    g.drawString("Percent appeared in orange:  " + pattern.format((percentage * 100)) + "%", 130, 35);
    g.drawString("There have been " + getDataModel().getTotalSeriesYears() + " World Series", 130, 55);
    g.drawString("The number of years appeared are:  " + getDataModel().getYearsAppeared(), 130, 75);
  }

  public Dimension getPreferredSize(){

    return new Dimension(400, 110);
  }

  public void updateDisplay(){

    repaint();
  }
}