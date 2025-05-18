/*
 *
 * Professor Darrell Payne
 * Bellevue University
 * 
 * Will use SelectData
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Null_Layout_8 extends JFrame{

  SelectData selectData = new SelectData();

  private JButton btnFirst;
  private JButton btnPrevious;
  private JButton btnNext;
  private JButton btnLast;
  private JButton btnExit;

  private JTextField txtTeam;
  private JTextField txtCity;
  private JTextField txtYear;
  private JTextField txtLoserTeam;
  private JTextField txtLoserCity;

  private JLabel lblTeam;
  private JLabel lblCity;
  private JLabel lblYear;
  private JLabel lblLoserTeam;
  private JLabel lblLoserCity;

  private ActionListener buttonListener = new ActionListener(){

    public void actionPerformed(ActionEvent e){

      String buttonSelected = ((JButton)e.getSource()).getText();
 
      if(buttonSelected.equals("First")){

        update(selectData.getFirst());
      }     

      if(buttonSelected.equals("Previous")){

        update(selectData.getPrevious());
      }     

      if(buttonSelected.equals("Next")){

        update(selectData.getNext());
      }     

      if(buttonSelected.equals("Last")){

        update(selectData.getLast());
      }     

      if(buttonSelected.equals("Exit")){

        shutDown();
      }     
    }
  };

  public Null_Layout_8(){

    super("Null Layout 5");

    btnFirst = new JButton("First");
    btnPrevious = new JButton("Previous");
    btnNext = new JButton("Next");
    btnLast = new JButton("Last");
    btnExit = new JButton("Exit");

    txtTeam = new JTextField("");
    txtCity = new JTextField("");
    txtYear = new JTextField("");
    txtLoserTeam = new JTextField("");
    txtLoserCity = new JTextField("");

    lblTeam = new JLabel("Winning Team");
    lblCity = new JLabel("Winning City");
    lblYear = new JLabel("Year Played");
    lblLoserTeam = new JLabel("Losing Team");
    lblLoserCity = new JLabel("Losing City");

    txtTeam.setEditable(false);
    txtCity.setEditable(false);
    txtYear.setEditable(false);
    txtLoserTeam.setEditable(false);
    txtLoserCity.setEditable(false);
  }

  public void launchJFrame(){

    // width - height
    setSize(500, 300);
    getContentPane().setLayout(null);
    getContentPane().setBackground(Color.white);

    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

    getContentPane().add(btnFirst);
    getContentPane().add(btnPrevious);
    getContentPane().add(btnNext);
    getContentPane().add(btnLast);
    getContentPane().add(btnExit);

    getContentPane().add(txtTeam);
    getContentPane().add(txtCity);
    getContentPane().add(txtYear);
    getContentPane().add(txtLoserTeam);
    getContentPane().add(txtLoserCity);

    getContentPane().add(lblTeam);
    getContentPane().add(lblCity);
    getContentPane().add(lblYear);
    getContentPane().add(lblLoserTeam);
    getContentPane().add(lblLoserCity);

    lblTeam.setBounds(new Rectangle(65, 10, 100, 30));
    lblCity.setBounds(new Rectangle(65, 45, 100, 30));
    lblYear.setBounds(new Rectangle(65, 80, 100, 30));
    lblLoserTeam.setBounds(new Rectangle(65, 115, 100, 30));
    lblLoserCity.setBounds(new Rectangle(65, 150, 100, 30));

    txtTeam.setBounds(new Rectangle(210, 10, 100, 30));
    txtCity.setBounds(new Rectangle(210, 45, 100, 30));
    txtYear.setBounds(new Rectangle(210, 80, 100, 30));
    txtLoserTeam.setBounds(new Rectangle(210, 115, 100, 30));
    txtLoserCity.setBounds(new Rectangle(210, 150, 100, 30));

    btnFirst.setBounds(new Rectangle(10, 200, 90, 30));
    btnNext.setBounds(new Rectangle(100, 200, 90, 30));
    btnPrevious.setBounds(new Rectangle(190, 200, 90, 30));
    btnLast.setBounds(new Rectangle(280, 200, 90, 30));
    btnExit.setBounds(new Rectangle(370, 200, 90, 30));

    setVisible(true);

    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowClosing(java.awt.event.WindowEvent evt) {
        shutDown();
      }
    });

    btnFirst.addActionListener(buttonListener);
    btnPrevious.addActionListener(buttonListener);
    btnNext.addActionListener(buttonListener);
    btnLast.addActionListener(buttonListener);
    btnExit.addActionListener(buttonListener);
  }

  private void update(MyRecord record){

    txtTeam.setText(record.getTeam());
    txtCity.setText(record.getCity());
    txtYear.setText(record.getYear_T());
    txtLoserTeam.setText(record.getLoserTeam());
    txtLoserCity.setText(record.getLoserCity());
  }

  private void shutDown(){

    int returnVal = JOptionPane.showConfirmDialog(this, "Are you sure you want to quit?");

    if(returnVal == JOptionPane.YES_OPTION){

      System.exit(0);
    }
  }

  public static void main(String[] args){

    Null_Layout_8 layout = new Null_Layout_8();
    layout.launchJFrame();
    
  }
}