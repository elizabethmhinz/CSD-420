/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
import java.net.URL;
import java.sql.*;

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

      System.out.println("Error connection to databasedb line 30.");
      System.exit(0);
    }


    try{

      // stmt.executeUpdate("DROP TABLE address");
      stmt.executeUpdate("DROP TABLE IF EXISTS addressdb");
      System.out.println("Table addressdb Dropped");
    }
    catch(SQLException e){

      System.out.println("SQLException: Drop table addressdb does not exist");
    }

    try{

      stmt.executeUpdate("CREATE TABLE addressdb(ID int PRIMARY KEY,LASTNAME varchar(40)," +
                         "FIRSTNAME varchar(40), STREET varchar(40), CITY varchar(40), STATE varchar(40)," +
                         "ZIP varchar(40))");
      System.out.println("Table address Created");
    }
    catch(SQLException e){

      System.out.println("Table addressdb Creation failed");
    }

    try{

      stmt.close();

      con.close();
      System.out.println("databasedb connections closed");
    }
    catch(SQLException e){

      System.out.println("Connection close failed");
    }
  }

  public static void main(String args[]) {

    CreateTable createTable = new CreateTable();
  }
}