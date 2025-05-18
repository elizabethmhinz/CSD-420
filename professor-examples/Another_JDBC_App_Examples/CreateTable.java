/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
import java.net.URL;
import java.sql.*;
import oracle.jdbc.OracleResultSetMetaData;

public class CreateTable{

  Connection con;

  Statement stmt;


  public CreateTable(){

    try{

      Class.forName("com.mysql.cj.jdbc.Driver");

      String url = "jdbc:mysql://localhost:3306/databasedb?";

      con = DriverManager.getConnection(url + "user=student1&password=pass");

      stmt = con.createStatement();
    }
    catch(Exception e){

      System.out.println("Error connection to databasedb.");
      System.exit(0);
    }

    try{

      stmt.executeUpdate("DROP TABLE IF EXISTS Wins_WK_02");
      System.out.println("Table Wins_WK_02 Dropped");
    }
    catch(SQLException e){

      System.out.println("SQLException: table Wins_WK_02 does not exist");
    }

    try{

      stmt.executeUpdate("CREATE TABLE Wins_WK_02(Team CHAR(20) NOT NULL, City CHAR(20) NOT NULL, Year_T INT NOT NULL PRIMARY KEY, LoserTeam CHAR(20) NOT NULL, LoserCity CHAR(20) NOT NULL)");
      System.out.println("Table Wins_WK_02 Created");
    }
    catch(SQLException e){

      System.out.println("Table Wins_WK_02 Creation failed");
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

    CreateTable createTable = new CreateTable();
  }
}