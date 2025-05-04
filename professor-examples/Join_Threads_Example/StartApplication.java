/*
 * Professor Darrell Payne
 *
 * Multithreaded Java Swing Example
 *
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StartApplication{

  private JFrame frame = new JFrame("Image App Images");

  ImageIcon image1 = new ImageIcon("images_mad/thumb001.jpg");
  ImageIcon image2 = new ImageIcon("images_mad/thumb002.jpg");
  ImageIcon image3 = new ImageIcon("images_mad/thumb003.jpg");
  ImageIcon image4 = new ImageIcon("images_mad/thumb004.jpg");
  ImageIcon image5 = new ImageIcon("images_mad/thumb005.jpg");

  private JLabel jlabelA = new JLabel(image1);
  private JLabel jlabelB = new JLabel(image2);
  private JLabel jlabelC = new JLabel(image3);
  private JLabel jlabelD = new JLabel(image4);
  private JLabel jlabelE = new JLabel(image5);

  private JPanel jpanel1 = new JPanel();
  private JPanel jpanel2 = new JPanel();
  private JPanel jpanel3 = new JPanel();
  private JPanel jpanel4 = new JPanel();
  private JPanel jpanel5 = new JPanel();

  private JButton startA = new JButton("Start");
  private JButton startB = new JButton("Start");
  private JButton startC = new JButton("Start");
  private JButton startD = new JButton("Start");
  private JButton startE = new JButton("Start");

  private JButton stopA = new JButton("Stop");
  private JButton stopB = new JButton("Stop");
  private JButton stopC = new JButton("Stop");
  private JButton stopD = new JButton("Stop");
  private JButton stopE = new JButton("Stop");

  private ChangeImages changeImages1;
  private ChangeImages changeImages2;
  private ChangeImages changeImages3;
  private ChangeImages changeImages4;
  private ChangeImages changeImages5;

  public StartApplication(){

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.getContentPane().setLayout(new GridLayout(5, 1));

    jpanel1.setLayout(new FlowLayout());
    jpanel2.setLayout(new FlowLayout());
    jpanel3.setLayout(new FlowLayout());
    jpanel4.setLayout(new FlowLayout());
    jpanel5.setLayout(new FlowLayout());

    jpanel1.add(jlabelA);
    jpanel1.add(startA);
    jpanel1.add(stopA);

    jpanel2.add(jlabelB);
    jpanel2.add(startB);
    jpanel2.add(stopB);

    jpanel3.add(jlabelC);
    jpanel3.add(startC);
    jpanel3.add(stopC);

    jpanel4.add(jlabelD);
    jpanel4.add(startD);
    jpanel4.add(stopD);

    jpanel5.add(jlabelE);
    jpanel5.add(startE);
    jpanel5.add(stopE);

    frame.getContentPane().add(jpanel1);
    frame.getContentPane().add(jpanel2);
    frame.getContentPane().add(jpanel3);
    frame.getContentPane().add(jpanel4);
    frame.getContentPane().add(jpanel5);

    startA.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        if( changeImages1 != null ){
          changeImages1.stopRunning();
        }
        changeImages1 = new ChangeImages(jlabelA);
        Thread thread = new Thread(changeImages1);
        thread.start();
      }
    });

    stopA.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        if( changeImages1 != null ){
          changeImages1.stopRunning();
        }
      }
    });

    startB.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        if( changeImages2 != null ){
          changeImages2.stopRunning();
        }
        changeImages2 = new ChangeImages(jlabelB);
        Thread thread = new Thread(changeImages2);
        thread.start();
      }
    });

    stopB.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        if( changeImages2 != null ){
          changeImages2.stopRunning();
        }
      }
    });

    startC.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        if( changeImages3 != null ){
          changeImages3.stopRunning();
        }
        changeImages3 = new ChangeImages(jlabelC);
        Thread thread = new Thread(changeImages3);
        thread.start();
      }
    });

    stopC.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        if( changeImages3 != null ){
          changeImages3.stopRunning();
        }
      }
    });

    startD.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        if( changeImages4 != null ){
          changeImages4.stopRunning();
        }
        changeImages4 = new ChangeImages(jlabelD);
        Thread thread = new Thread(changeImages4);
        thread.start();
      }
    });

    stopD.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        if( changeImages4 != null ){
          changeImages4.stopRunning();
        }
      }
    });

    startE.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        if( changeImages5 != null ){
          changeImages5.stopRunning();
        }
        changeImages5 = new ChangeImages2(jlabelE);
        Thread thread = new Thread(changeImages5);
        thread.start();
      }
    });

    stopE.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        if( changeImages5 != null ){
        changeImages5.stopRunning();
        }
      }
    });
  }

  public void launchJFrame(){
    // width, height
    frame.setSize(400, 500);
    frame.setVisible(true);
  }

  public static void main(String[] args){
    StartApplication thread = new StartApplication();
    thread.launchJFrame();
  }
}