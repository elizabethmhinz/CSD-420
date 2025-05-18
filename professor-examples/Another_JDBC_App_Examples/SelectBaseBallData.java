/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Uses class MyRecord
 */
import java.net.URL;
import java.sql.*;
import oracle.jdbc.OracleResultSetMetaData;

public class SelectBaseBallData{

  Connection con;

  Statement stmt;

  ResultSet resultSet;

  public SelectBaseBallData(){

    try{

      Class.forName("com.mysql.cj.jdbc.Driver");

      String url = "jdbc:mysql://localhost:3306/databasedb?";

      con = DriverManager.getConnection(url + "user=student1&password=pass");

      stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
    }
    catch(Exception e){

      System.out.println("Error connection to database.");
      System.exit(0);
    }

    try{

      resultSet = stmt.executeQuery("SELECT * FROM Wins_WK_02");
    }
    catch(SQLException e){

      System.out.println(e);
      System.out.println("Result Request Failed");
    }
  }

  /*
   *
   * To make complete I need a
   *    next() and previous()
   *    method in this class
   *
   */

  public MyRecord getFirst(){

    MyRecord myRecord = new MyRecord();

    try{

      /*
       * Move cursor to first record
       */
      resultSet.first();

      /*
       * Specify column name
       */
      myRecord.setTeam(resultSet.getString(resultSet.findColumn("team")));
      myRecord.setCity(resultSet.getString(resultSet.findColumn("city")));
      myRecord.setYear_T(resultSet.getString(resultSet.findColumn("year_T")));
      myRecord.setLoserTeam(resultSet.getString(resultSet.findColumn("loserTeam")));
      myRecord.setLoserCity(resultSet.getString(resultSet.findColumn("loserCity")));
    }
    catch(Exception e){

      System.out.println(e);
    }

    return myRecord;
  }

  public MyRecord getLast(){

    MyRecord myRecord = new MyRecord();

    try{

      /*
       * Move cursor to last record
       */
      resultSet.last();

      myRecord.setTeam(resultSet.getString(resultSet.findColumn("team")));
      myRecord.setCity(resultSet.getString(resultSet.findColumn("city")));
      myRecord.setYear_T(resultSet.getString(resultSet.findColumn("year_T")));
      myRecord.setLoserTeam(resultSet.getString(resultSet.findColumn("loserTeam")));
      myRecord.setLoserCity(resultSet.getString(resultSet.findColumn("loserCity")));
    }
    catch(Exception e){

      System.out.println(e);
    }

    return myRecord;
  }

  public void close(){

    try{
      stmt.close();
      con.close();
    }
    catch(SQLException e){

      System.out.println("Connection close failed");
    }
  }

  public static void main(String args[]) {

    SelectBaseBallData selectBaseBallData = new SelectBaseBallData();

    System.out.println(selectBaseBallData.getFirst());
    System.out.println(selectBaseBallData.getLast());

    selectBaseBallData.close();
  }
}