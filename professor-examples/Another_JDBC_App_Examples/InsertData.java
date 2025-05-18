/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
import java.net.URL;
import java.sql.*;
import oracle.jdbc.OracleResultSetMetaData;

public class InsertData{

  Connection con;

  Statement stmt;

  public InsertData(){

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

      System.out.println(
             stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Red Sox', 'Boston', 1903, 'Pirates', 'Pittsburgh')")
             + " row updated");

      // No 1904 World Series

      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Giants', 'New York', 1905, 'Athletics', 'Philadelphia')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('White Sox', 'Chicago', 1906, 'Cubs', 'Chicago')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Cubs', 'Chicago', 1907, 'Tigers', 'Detroit')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Cubs', 'Chicago', 1908, 'Tigers', 'Detroit')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Pirates', 'Pittsburgh', 1909, 'Tigers', 'Detroit')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Athletics', 'Philadelphia', 1910, 'Cubs', 'Chicago')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Athletics', 'Philadelphia', 1911, 'Giants', 'New York')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Red Sox', 'Boston', 1912, 'Giants', 'New York')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Athletics', 'Philadelphia', 1913, 'Giants', 'New York')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Braves', 'Boston', 1914, 'Athletics', 'Philadelphia')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Red Sox', 'Boston', 1915, 'Phillies', 'Philadelphia')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Red Sox', 'Boston', 1916, 'Robins', 'Brooklyn')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('White Sox', 'Chicago', 1917, 'Giants', 'New York')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Red Sox', 'Boston', 1918, 'Cubs', 'Chicago')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Reds', 'Cincinnati', 1919, 'White Sox', 'Chicago')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Indians', 'Cleveland', 1920, 'Robins', 'Brooklyn')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Giants', 'New York', 1921, 'Yankees', 'New York')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Giants', 'New York', 1922, 'Yankees', 'New York')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Yankees', 'New York', 1923, 'Giants', 'New York')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Senators', 'Washington', 1924, 'Giants', 'New York')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Pirates', 'Pittsburgh', 1925, 'Nationals', 'Wasnington')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Cardinals', 'St. Louis', 1926, 'Yankees', 'New York')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Yankees', 'New York', 1927, 'Pirates', 'Pittsburgh')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Yankees', 'New York', 1928, 'Cardinals', 'St. Louis')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Athletics', 'Philadelphia', 1929, 'Cubs', 'Chicago')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Athletics', 'Philadelphia', 1930, 'Cardinals', 'St. Louis')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Cardinals', 'St. Louis', 1931, 'Athletics', 'Philadelphia')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Yankees', 'New York', 1932, 'Cubs', 'Chicago')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Giants', 'New York', 1933, 'Nationals', 'Wasnington')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Cardinals', 'St. Louis', 1934, 'Tigers', 'Detroit')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Tigers', 'Detroit', 1935, 'Cubs', 'Chicago')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Yankees', 'New York', 1936, 'Giants', 'New York')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Yankees', 'New York', 1937, 'Giants', 'New York')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Yankees', 'New York', 1938, 'Cubs', 'Chicago')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Yankees', 'New York', 1939, 'Reds', 'Cincinnati')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Reds', 'Cincinnati', 1940, 'Tigers', 'Detroit')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Yankees', 'New York', 1941, 'Dodgers', 'Brooklyn')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Cardinals', 'St. Louis', 1942, 'Yankees', 'New York')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Yankees', 'New York', 1943, 'Cardinals', 'St. Louis')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Cardinals', 'St. Louis', 1944, 'Browns', 'St. Louis')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Tigers', 'Detroit', 1945, 'Cubs', 'Chicago')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Cardinals', 'St. Louis', 1946, 'Red Sox', 'Boston')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Yankees', 'New York', 1947, 'Dodgers', 'Brooklyn')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Indians', 'Cleveland', 1948, 'Braves', 'Boston')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Yankees', 'New York', 1949, 'Dodgers', 'Brooklyn')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Yankees', 'New York', 1950, 'Phillies', 'Philadelphia')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Yankees', 'New York', 1951, 'Giants', 'New York')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Yankees', 'New York', 1952, 'Dodgers', 'Brooklyn')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Yankees', 'New York', 1953, 'Dodgers', 'Brooklyn')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Giants', 'New York', 1954, 'Indians', 'Cleveland')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Dodgers', 'Brooklyn', 1955, 'Yankees', 'New York')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Yankees', 'New York', 1956, 'Dodgers', 'Brooklyn')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Braves', 'Milwaukee', 1957, 'Yankees', 'New York')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Yankees', 'New York', 1958, 'Braves', 'Milwaukee')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Dodgers', 'Los Angeles', 1959, 'White Sox', 'Chicago')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Pirates', 'Pittsburgh', 1960, 'Yankees', 'New York')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Yankees', 'New York', 1961, 'Reds', 'Cincinnati')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Yankees', 'New York', 1962, 'Giants', 'San Francisco')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Dodgers', 'Los Angeles', 1963, 'Yankees', 'New York')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Cardinals', 'St. Louis', 1964, 'Yankees', 'New York')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Dodgers', 'Los Angeles', 1965, 'Twins', 'Minnesota')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Orioles', 'Baltimore', 1966, 'Dodgers', 'Los Angeles')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Cardinals', 'St. Louis', 1967, 'Red Sox', 'Boston')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Tigers', 'Detroit', 1968, 'Cardinals', 'St. Louis')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Mets', 'New York', 1969, 'Orioles', 'Baltimore')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Orioles', 'Baltimore', 1970, 'Reds', 'Cincinnati')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Pirates', 'Pittsburgh', 1971, 'Orioles', 'Baltimore')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Athletics', 'Oakland', 1972, 'Reds', 'Cincinnati')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Athletics', 'Oakland', 1973, 'Mets', 'New York')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Athletics', 'Oakland', 1974, 'Dodgers', 'Los Angeles')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Reds', 'Cincinnati', 1975, 'Red Sox', 'Boston')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Reds', 'Cincinnati', 1976, 'Yankees', 'New York')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Yankees', 'New York', 1977, 'Dodgers', 'Los Angeles')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Yankees', 'New York', 1978, 'Dodgers', 'Los Angeles')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Pirates', 'Pittsburgh', 1979, 'Orioles', 'Baltimore')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Phillies', 'Philadelphia', 1980, 'Royals', 'Kansas City')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Dodgers', 'Los Angeles', 1981, 'Yankees', 'New York')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Cardinals', 'St. Louis', 1982, 'Brewers', 'Milwaukee')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Orioles', 'Baltimore', 1983, 'Phillies', 'Philadelphia')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Tigers', 'Detroit', 1984, 'Padres', 'San Diego')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Royals', 'Kansas City', 1985, 'Cardinals', 'St. Louis')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Mets', 'New York', 1986, 'Red Sox', 'Boston')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Twins', 'Minnesota', 1987, 'Cardinals', 'St. Louis')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Dodgers', 'Los Angeles', 1988, 'Athletics', 'Oakland')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Athletics', 'Oakland', 1989, 'Giants', 'San Francisco')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Reds', 'Cincinnati', 1990, 'Athletics', 'Oakland')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Twins', 'Minnesota', 1991, 'Braves', 'Atlanta')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Blue Jays', 'Toronto', 1992, 'Braves', 'Atlanta')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Blue Jays', 'Toronto', 1993, 'Phillies', 'Philadelphia')")
             + " row updated");

      // No 1994 World Series

      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Braves', 'Atlanta', 1995, 'Indians', 'Cleveland')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Yankees', 'New York', 1996, 'Braves', 'Atlanta')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Marlins', 'Florida', 1997, 'Indians', 'Cleveland')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Yankees', 'New York', 1998, 'Padres', 'San Diego')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Yankees', 'New York', 1999, 'Braves', 'Atlanta')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Yankees', 'New York', 2000, 'Mets', 'New York')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Diamondbacks', 'Arizona', 2001, 'Yankees', 'New York')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Angels', 'Anaheim', 2002, 'Giants', 'San Francisco')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Marlins', 'Florida', 2003, 'Yankees', 'New York')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Red Sox', 'Boston', 2004, 'Cardinals', 'St. Louis')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('White Sox', 'Chicago', 2005, 'Astros', 'Houston')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Cardinals', 'St. Louis', 2006, 'Tigers', 'Detroit')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Red Sox', 'Boston', 2007, 'Rockies', 'Colorado')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Phillies', 'Philadelphia', 2008, 'Rays', 'Tampa Bay')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Yankees', 'New York', 2009, 'Phillies', 'Philadelphia')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Giants', 'San Francisco', 2010, 'Rangers', 'Texas')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Cardinals', 'St. Louis', 2011, 'Rangers', 'Texas')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Giants', 'San Francisco', 2012, 'Tigers', 'Detroit')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Red Sox', 'Boston', 2013, 'Cardinals', 'St. Louis')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Giants', 'San Francisco', 2014, 'Royals', 'Kansas City')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Royals', 'Kansas City', 2015, 'Mets', 'New York')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Cubs', 'Chicago', 2016, 'Indians', 'Cleveland')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Astros', 'Houston', 2017, 'Dodgers', 'Los Angeles')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Red Sox', 'Boston', 2018, 'Dodgers', 'Los Angeles')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Nationals', 'Washington', 2019, 'Astros', 'Houston')")
             + " row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO Wins_WK_02(Team, City, Year_T, LoserTeam, LoserCity)VALUES('Dodgers', 'Los Angeles', 2020, 'Rays', 'Tampa Bay')")
             + " row updated");

      stmt.executeUpdate("COMMIT");

      System.out.println("Data Inserted");
    }
    catch(SQLException e){

      System.out.println(e);
      System.out.println("Insert Data Failed");
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

    InsertData InsertData = new InsertData();
  }
}