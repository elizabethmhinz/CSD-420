/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
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

      stmt = con.createStatement();
    }
    catch(Exception e){

      System.out.println("Error connection to database.");
      System.exit(0);
    }

    try{

      resultSet = stmt.executeQuery("SELECT * FROM Wins_WK_02 WHERE year_t >= 1971 ORDER BY Year_T");

      System.out.println("Result Requested");
    }
    catch(SQLException e){

      System.out.println(e);
      System.out.println("Result Request Failed");
    }

    try{

      while(resultSet.next()){

        for(int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++){

          System.out.print((resultSet.getString(i)).trim() + ",  ");
        }
        System.out.println("\n");
      }      
    }
    catch(SQLException e){

      System.out.println(e);
      System.out.println("Print of result set failed");
    }

    try{

      stmt.close();

      con.close();
      System.out.println("Database connections closed");
    }
    catch(SQLException e){

      System.out.println("Connection close failed");
    }
  }

  public static void main(String args[]) {

    SelectData SelectData = new SelectData();
  }
}