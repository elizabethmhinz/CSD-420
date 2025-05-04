/*
 * Professor Darrell Payne
 */
import javax.swing.*;
import java.awt.*;

class ChangeImages2 extends ChangeImages implements Runnable{

  int issue = 0;

  public ChangeImages2(JLabel label){
    super(label);
  }

  @Override
  public void run(){
    while( ! timeToStop){

      if( issue < 450 ){
        issue++;
      }
      else{
        issue = 1;
      }

      if(issue < 10){
        image = new ImageIcon("images_mad/thumb00" + issue + ".jpg");
      }
      else{
        if(issue < 100){
          image = new ImageIcon("images_mad/thumb0" + issue + ".jpg");
        }
        else{
          image = new ImageIcon("images_mad/thumb" + issue + ".jpg");
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
}