/*
 * Professor Darrell Payne
 */
import javax.swing.*;
import java.awt.*;

class ChangeImages implements Runnable{

  protected JLabel label;
  protected ImageIcon image;
  boolean timeToStop = false;

  public ChangeImages(JLabel label){
    this.label = label;
  }

  @Override
  public void run(){
    while( ! timeToStop){

      int i = (int)(Math.random() * 450 + 1);

      if(i < 10){
        image = new ImageIcon("images_mad/thumb00" + i + ".jpg");
      }
      else{
        if(i < 100){
          image = new ImageIcon("images_mad/thumb0" + i + ".jpg");
        }
        else{
          image = new ImageIcon("images_mad/thumb" + i + ".jpg");
        }
      }

      label.setIcon(image);

      try{
        Thread.sleep(650);
      }
      catch(Exception exception){
        exception.printStackTrace();
      }
    }
  }

  public void stopRunning(){
    timeToStop = true;
  }
}