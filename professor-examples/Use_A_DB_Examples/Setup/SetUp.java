import java.net.URL;
import java.sql.*;
import oracle.jdbc.OracleResultSetMetaData;

public class SetUp{

  Connection con;

  Statement stmt;

  String rawData[] = {
      "Red Sox", "Boston", "Massachusetts", "5", "1903", "Pirates", "Pittsburgh", "Pennsylvania", "3", "SYSDATE",

      "Giants", "New York", "New York", "4", "1905", "Athletics", "Philadelphia", "Pennsylvania", "1", "SYSDATE",
      "White Sox", "Chicago", "Illinois", "4", "1906", "Cubs", "Chicago", "Illinois", "2", "SYSDATE",
      "Cubs", "Chicago", "Illinois", "4", "1907", "Tigers", "Detroit", "Michigan", "0", "SYSDATE",
      "Cubs", "Chicago", "Illinois", "4", "1908", "Tigers", "Detroit", "Michigan", "1", "SYSDATE",
      "Pirates", "Pittsburgh", "Pennsylvania", "4", "1909", "Tigers", "Detroit", "Michigan", "3", "SYSDATE",
      "Athletics", "Philadelphia", "Pennsylvania", "4", "1910", "Cubs", "Chicago", "Illinois", "1", "SYSDATE",
      "Athletics", "Philadelphia", "Pennsylvania", "4", "1911", "Giants", "New York", "New York", "2", "SYSDATE",
      "Red Sox", "Boston", "Massachusetts", "4", "1912", "Giants", "New York", "New York", "3", "SYSDATE",
      "Athletics", "Philadelphia", "Pennsylvania", "4", "1913", "Giants", "New York", "New York", "1", "SYSDATE",
      "Braves", "Boston", "Massachusetts", "4", "1914", "Athletics", "Philadelphia", "Pennsylvania", "0", "SYSDATE",
      "Red Sox", "Boston", "Massachusetts", "4", "1915", "Phillies", "Philadelphia", "Pennsylvania", "1", "SYSDATE",
      "Red Sox", "Boston", "Massachusetts", "4", "1916", "Robins", "Brooklyn", "New York", "1", "SYSDATE",
      "White Sox", "Chicago", "Illinois", "4", "1917", "Giants", "New York", "New York", "2", "SYSDATE",
      "Red Sox", "Boston", "Massachusetts", "4", "1918", "Cubs", "Chicago", "Illinois", "2", "SYSDATE",
      "Reds", "Cincinnati", "Ohio", "5", "1919", "White Sox", "Chicago", "Illinois", "3", "SYSDATE",
      "Indians", "Cleveland", "Ohio", "5", "1920", "Robins", "Brooklyn", "New York", "2", "SYSDATE",
      "Giants", "New York", "New York", "5", "1921", "Yankees", "New York", "New York", "3", "SYSDATE",
      "Giants", "New York", "New York", "4", "1922", "Yankees", "New York", "New York", "0", "SYSDATE",
      "Yankees", "New York", "New York", "4", "1923", "Giants", "New York", "New York", "2", "SYSDATE",
      "Senators", "Washington", "Washington DC", "4", "1924", "Giants", "New York", "New York", "3", "SYSDATE",
      "Pirates", "Pittsburgh", "Pennsylvania", "4", "1925", "Nationals", "Wasnington", "Washington DC", "3", "SYSDATE",
      "Cardinals", "St. Louis", "Missouri", "4", "1926", "Yankees", "New York", "New York", "3", "SYSDATE",
      "Yankees", "New York", "New York", "4", "1927", "Pirates", "Pittsburgh", "Pennsylvania", "0", "SYSDATE",
      "Yankees", "New York", "New York", "4", "1928", "Cardinals", "St. Louis", "Missouri", "0", "SYSDATE",
      "Athletics", "Philadelphia", "Pennsylvania", "4", "1929", "Cubs", "Chicago", "Illinois", "1", "SYSDATE",
      "Athletics", "Philadelphia", "Pennsylvania", "4", "1930", "Cardinals", "St. Louis", "Missouri", "2", "SYSDATE",
      "Cardinals", "St. Louis", "Missouri", "4", "1931", "Athletics", "Philadelphia", "Pennsylvania", "3", "SYSDATE",
      "Yankees", "New York", "New York", "4", "1932", "Cubs", "Chicago", "Illinois", "0", "SYSDATE",
      "Giants", "New York", "New York", "4", "1933", "Nationals", "Wasnington", "Washington DC", "1", "SYSDATE",
      "Cardinals", "St. Louis", "Missouri", "4", "1934", "Tigers", "Detroit", "Michigan", "3", "SYSDATE",
      "Tigers", "Detroit", "Michigan", "4", "1935", "Cubs", "Chicago", "Illinois", "2", "SYSDATE",
      "Yankees", "New York", "New York", "4", "1936", "Giants", "New York", "New York", "2", "SYSDATE",
      "Yankees", "New York", "New York", "4", "1937", "Giants", "New York", "New York", "1", "SYSDATE",
      "Yankees", "New York", "New York", "4", "1938", "Cubs", "Chicago", "Illinois", "0", "SYSDATE",
      "Yankees", "New York", "New York", "4", "1939", "Reds", "Cincinnati", "Ohio", "0", "SYSDATE",
      "Reds", "Cincinnati", "Ohio", "4", "1940", "Tigers", "Detroit", "Michigan", "3", "SYSDATE",
      "Yankees", "New York", "New York", "4", "1941", "Dodgers", "Brooklyn", "New York", "1", "SYSDATE",
      "Cardinals", "St. Louis", "Missouri", "4", "1942", "Yankees", "New York", "New York", "1", "SYSDATE",
      "Yankees", "New York", "New York", "4", "1943", "Cardinals", "St. Louis", "Missouri", "1", "SYSDATE",
      "Cardinals", "St. Louis", "Missouri", "4", "1944", "Browns", "St. Louis", "Missouri", "2", "SYSDATE",
      "Tigers", "Detroit", "Michigan", "4", "1945", "Cubs", "Chicago", "Illinois", "3", "SYSDATE",
      "Cardinals", "St. Louis", "Missouri", "4", "1946", "Red Sox", "Boston", "Massachusetts", "3", "SYSDATE",
      "Yankees", "New York", "New York", "4", "1947", "Dodgers", "Brooklyn", "New York", "3", "SYSDATE",
      "Indians", "Cleveland", "Ohio", "4", "1948", "Braves", "Boston", "Georgia", "2", "SYSDATE",
      "Yankees", "New York", "New York", "4", "1949", "Dodgers", "Brooklyn", "New York", "1", "SYSDATE",
      "Yankees", "New York", "New York", "4", "1950", "Phillies", "Philadelphia", "Pennsylvania", "0", "SYSDATE",
      "Yankees", "New York", "New York", "4", "1951", "Giants", "New York", "New York", "2", "SYSDATE",
      "Yankees", "New York", "New York", "4", "1952", "Dodgers", "Brooklyn", "New York", "3", "SYSDATE",
      "Yankees", "New York", "New York", "4", "1953", "Dodgers", "Brooklyn", "New York", "2", "SYSDATE",
      "Giants", "New York", "New York", "4", "1954", "Indians", "Cleveland", "Ohio", "0", "SYSDATE",
      "Dodgers", "Brooklyn", "New York", "4", "1955", "Yankees", "New York", "New York", "3", "SYSDATE",
      "Yankees", "New York", "New York", "4", "1956", "Dodgers", "Brooklyn", "New York", "3", "SYSDATE",
      "Braves", "Milwaukee", "Minnesota", "4", "1957", "Yankees", "New York", "New York", "3", "SYSDATE",
      "Yankees", "New York", "New York", "4", "1958", "Braves", "Milwaukee", "Minnesota", "3", "SYSDATE",
      "Dodgers", "Los Angeles", "California", "4", "1959", "White Sox", "Chicago", "Illinois", "2", "SYSDATE",
      "Pirates", "Pittsburgh", "Pennsylvania", "4", "1960", "Yankees", "New York", "New York", "3", "SYSDATE",
      "Yankees", "New York", "New York", "4", "1961", "Reds", "Cincinnati", "Ohio", "1", "SYSDATE",
      "Yankees", "New York", "New York", "4", "1962", "Giants", "San Francisco", "California", "3", "SYSDATE",
      "Dodgers", "Los Angeles", "California", "4", "1963", "Yankees", "New York", "New York", "0", "SYSDATE",
      "Cardinals", "St. Louis", "Missouri", "4", "1964", "Yankees", "New York", "New York", "3", "SYSDATE",
      "Dodgers", "Los Angeles", "California", "4", "1965", "Twins", "Minnesota", "Minnesota", "3", "SYSDATE",
      "Orioles", "Baltimore", "Maryland", "4", "1966", "Dodgers", "Los Angeles", "California", "0", "SYSDATE",
      "Cardinals", "St. Louis", "Missouri", "4", "1967", "Red Sox", "Boston", "Massachusetts", "3", "SYSDATE",
      "Tigers", "Detroit", "Michigan", "4", "1968", "Cardinals", "St. Louis", "Missouri", "3", "SYSDATE",
      "Mets", "New York", "New York", "4", "1969", "Orioles", "Baltimore", "Maryland", "1", "SYSDATE",
      "Orioles", "Baltimore", "Maryland", "4", "1970", "Reds", "Cincinnati", "Ohio", "1", "SYSDATE",
      "Pirates", "Pittsburgh", "Pennsylvania", "4", "1971", "Orioles", "Baltimore", "Maryland", "3", "SYSDATE",
      "Athletics", "Oakland", "California", "4", "1972", "Reds", "Cincinnati", "Ohio", "3", "SYSDATE",
      "Athletics", "Oakland", "California", "4", "1973", "Mets", "New York", "New York", "3", "SYSDATE",
      "Athletics", "Oakland", "California", "4", "1974", "Dodgers", "Los Angeles", "California", "1", "SYSDATE",
      "Reds", "Cincinnati", "Ohio", "4", "1975", "Red Sox", "Boston", "Massachusetts", "3", "SYSDATE",
      "Reds", "Cincinnati", "Ohio", "4", "1976", "Yankees", "New York", "New York", "0", "SYSDATE",
      "Yankees", "New York", "New York", "4", "1977", "Dodgers", "Los Angeles", "California", "2", "SYSDATE",
      "Yankees", "New York", "New York", "4", "1978", "Dodgers", "Los Angeles", "California", "2", "SYSDATE",
      "Pirates", "Pittsburgh", "Pennsylvania", "4", "1979", "Orioles", "Baltimore", "Maryland", "3", "SYSDATE",
      "Phillies", "Philadelphia", "Pennsylvania", "4", "1980", "Royals", "Kansas City", "Missouri", "2", "SYSDATE",
      "Dodgers", "Los Angeles", "California", "4", "1981", "Yankees", "New York", "New York", "2", "SYSDATE",
      "Cardinals", "St. Louis", "Missouri", "4", "1982", "Brewers", "Milwaukee", "Minnesota", "3", "SYSDATE",
      "Orioles", "Baltimore", "Maryland", "4", "1983", "Phillies", "Philadelphia", "Pennsylvania", "1", "SYSDATE",
      "Tigers", "Detroit", "Michigan", "4", "1984", "Padres", "San Diego", "California", "1", "SYSDATE",
      "Royals", "Kansas City", "Missouri", "4", "1985", "Cardinals", "St. Louis", "Missouri", "3", "SYSDATE",
      "Mets", "New York", "New York", "4", "1986", "Red Sox", "Boston", "Maryland", "3", "SYSDATE",
      "Twins", "Minnesota", "Minnesota", "4", "1987", "Cardinals", "St. Louis", "Missouri", "3", "SYSDATE",
      "Dodgers", "Los Angeles", "California", "4", "1988", "Athletics", "Oakland", "California", "1", "SYSDATE",
      "Athletics", "Oakland", "California", "4", "1989", "Giants", "San Francisco", "California", "0", "SYSDATE",
      "Reds", "Cincinnati", "Ohio", "4", "1990", "Athletics", "Oakland", "California", "0", "SYSDATE",
      "Twins", "Minnesota", "Minnesota", "4", "1991", "Braves", "Atlanta", "Georgia", "3", "SYSDATE",
      "Blue Jays", "Toronto", "Canada", "4", "1992", "Braves", "Atlanta", "Georgia", "2", "SYSDATE",
      "Blue Jays", "Toronto", "Canada", "4", "1993", "Phillies", "Philadelphia", "Pennsylvania", "2", "SYSDATE",

      "Braves", "Atlanta", "Georgia", "4", "1995", "Indians", "Cleveland", "Ohio", "2", "SYSDATE",
      "Yankees", "New York", "New York", "4", "1996", "Braves", "Atlanta", "Georgia", "2", "SYSDATE",
      "Marlins", "Florida", "Florida", "4", "1997", "Indians", "Cleveland", "Ohio", "3", "SYSDATE",
      "Yankees", "New York", "New York", "4", "1998", "Padres", "San Diego", "California", "0", "SYSDATE",
      "Yankees", "New York", "New York", "4", "1999", "Braves", "Atlanta", "Georgia", "0", "SYSDATE",
      "Yankees", "New York", "New York", "4", "2000", "Mets", "New York", "New York", "1", "SYSDATE",
      "Diamondbacks", "Arizona", "Arizona", "4", "2001", "Yankees", "New York", "New York", "3", "SYSDATE",
      "Angels", "Anaheim", "California", "4", "2002", "Giants", "San Francisco", "California", "3", "SYSDATE",
      "Marlins", "Florida", "Florida", "4", "2003", "Yankees", "New York", "New York", "2", "SYSDATE",
      "Red Sox", "Boston", "Massachusetts", "4", "2004", "Cardinals", "St. Louis", "Missouri", "0", "SYSDATE",
      "White Sox", "Chicago", "Illinois", "4", "2005", "Astros", "Houston", "Texas", "0", "SYSDATE",
      "Cardinals", "St. Louis", "Missouri", "4", "2006", "Tigers", "Detroit", "Michigan", "1", "SYSDATE",
      "Red Sox", "Boston", "Massachusetts", "4", "2007", "Rockies", "Colorado", "Colorado", "0", "SYSDATE",
      "Phillies", "Philadelphia", "Pennsylvania", "4", "2008", "Rays", "Tampa Bay", "Florida", "1", "SYSDATE",
      "Yankees", "New York", "New York", "4", "2009", "Phillies", "Philadelphia", "Pennsylvania", "2", "SYSDATE",
      "Giants", "San Francisco", "California", "4", "2010", "Rangers", "Texas", "Texas", "1", "SYSDATE",
      "Cardinals", "St. Louis", "Missouri", "4", "2011", "Rangers", "Texas", "Texas", "3", "SYSDATE",
      "Giants", "San Francisco", "California", "4", "2012", "Tigers", "Detroit", "Michigan", "0", "SYSDATE",
      "Red Sox", "Boston", "Massachusetts", "4", "2013", "Cardinals", "St. Louis", "Missouri", "2", "SYSDATE",
      "Giants", "San Francisco", "California", "4", "2014", "Royals", "Kansas City", "Missouri", "3", "SYSDATE",
      "Royals", "Kansas City", "Missouri", "4", "2015", "Mets", "New York", "New York", "1", "SYSDATE",
      "Cubs", "Chicago", "Illinois", "4", "2016", "Indians", "Cleveland", "Ohio", "3", "SYSDATE",
      "Astros", "Houston", "Texas", "4", "2017", "Dodgers", "Los Angeles", "California", "3", "SYSDATE",
      "Red Sox", "Boston", "Massachusetts", "4", "2018", "Dodgers", "Los Angeles", "California", "1", "SYSDATE",
      "Nationals", "Wasnington", "Washington DC", "4", "2019", "Astros", "Houston", "Texas", "3", "SYSDATE"
  };

  public SetUp(){

    try{

      DriverManager.registerDriver (new oracle.jdbc.OracleDriver());

      con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "student1","pass");

      stmt = con.createStatement();
    }
    catch(Exception e){

      System.out.println("Error connection to database.");
      return;
    }

    try{

      stmt.executeUpdate("DROP TABLE Wins_S002MVC");
      System.out.println("Table Wins_S002MVC Dropped");
    }
    catch(SQLException e){

      System.out.println("Table Wins_S002MVC does not exist");
    }

    try{

      stmt.executeUpdate("CREATE TABLE Wins_S002MVC(Team CHAR(20), City CHAR(20), State CHAR(20), NumWins NUMBER(1, 0), Year_T INT NOT NULL, LoserTeam CHAR(20), LoserCity CHAR(20), LoserState CHAR(20), NumLoses NUMBER(1, 0), DateInserted DATE DEFAULT SYSDATE, CONSTRAINT Wins_S002MVC_pk PRIMARY KEY(Year_T))");
      System.out.println("Table Wins_S002MVC Created");
    }
    catch(SQLException e){

      System.out.println("Table Wins_S002MVC Creation failed");
    }


    try{

      for(int i = 0; i < rawData.length; i = i + 10){

        try{

          stmt.executeUpdate("INSERT INTO Wins_S002MVC(Team, City, State, NumWins, Year_T, LoserTeam, LoserCity, LoserState, NumLoses, DateInserted)" +
                                                 "VALUES('" + rawData[i] + "', '" + //team
                                                              rawData[i + 1] + "', '" + // city
                                                              rawData[i + 2] + "', " + // state
                                                              Integer.parseInt(rawData[i + 3]) + ", " + // num wins
                                                              Integer.parseInt(rawData[i + 4]) + ", '" + // year
                                                              rawData[i + 5] + "', '" + // loser team
                                                              rawData[i + 6] + "', '" + // loser city
                                                              rawData[i + 7] + "', " + // loser state
                                                              Integer.parseInt(rawData[i + 8]) + ", " + // num loses
                                                              rawData[i + 9] + ")"); // inseert date



          System.out.println("The year " + rawData[i + 4] + " was successfully entered.");
        }
        catch(SQLException e){

          System.out.println("The year " + rawData[i + 4] + " was NOT successfully entered.");
        }

      }

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

    SetUp setUp = new SetUp();
  }
}