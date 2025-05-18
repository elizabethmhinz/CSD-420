/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Will use MyRecord
 */
import java.net.URL;
import java.sql.*;
import oracle.jdbc.OracleResultSetMetaData;

public class SelectData{

  Connection con;

  Statement stmt;

  ResultSet resultSet;

  public SelectData(){

    try{

      Class.forName("com.mysql.cj.jdbc.Driver");

      String url = "jdbc:mysql://localhost:3306/databasedb?";

      con = DriverManager.getConnection(url + "user=student1&password=pass");

      stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    }
    catch(Exception e){

      System.out.println("Error connection to database.");
      System.exit(0);
    }

    try{

      resultSet = stmt.executeQuery("SELECT * FROM Wins_WK_02a ORDER BY Year_T");
    }
    catch(SQLException e){

      System.out.println(e);
      System.out.println("Result Request Failed");
    }
  }

  public MyRecord getFirst(){

    MyRecord myRecord = new MyRecord();

    try{
      resultSet.first();

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

  public MyRecord getNext(){

    MyRecord myRecord = new MyRecord();

    try{
      resultSet.next();

      myRecord.setTeam(resultSet.getString(resultSet.findColumn("team")));
      myRecord.setCity(resultSet.getString(resultSet.findColumn("city")));
      myRecord.setYear_T(resultSet.getString(resultSet.findColumn("year_T")));
      myRecord.setLoserTeam(resultSet.getString(resultSet.findColumn("loserTeam")));
      myRecord.setLoserCity(resultSet.getString(resultSet.findColumn("loserCity")));
    }
    catch(SQLException e){

      return this.getFirst();
    }
    catch(Exception e){

      System.out.println(e);
    }

    return myRecord;
  }

  public MyRecord getPrevious(){

    MyRecord myRecord = new MyRecord();

    try{
      resultSet.previous();

      myRecord.setTeam(resultSet.getString(resultSet.findColumn("team")));
      myRecord.setCity(resultSet.getString(resultSet.findColumn("city")));
      myRecord.setYear_T(resultSet.getString(resultSet.findColumn("year_T")));
      myRecord.setLoserTeam(resultSet.getString(resultSet.findColumn("loserTeam")));
      myRecord.setLoserCity(resultSet.getString(resultSet.findColumn("loserCity")));
    }
    catch(SQLException e){

      return this.getLast();
    }
    catch(Exception e){

      System.out.println(e);
    }

    return myRecord;
  }

  public MyRecord getLast(){

    MyRecord myRecord = new MyRecord();

    try{
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

    SelectData selectMyData = new SelectData();

    System.out.println(selectMyData.getFirst());
    System.out.println(selectMyData.getLast());

    selectMyData.close();
  }
}