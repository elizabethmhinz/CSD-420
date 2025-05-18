/*
 * Model
 *
 * All data accessed via this class
 *
 */

/*
 * You may need to change the user id and password in this file
 */

import java.sql.*;
import java.net.URL;
import java.util.Observable;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Arrays;

/*
 * import java.util.Iterator;
 */

/*
 *
 * Constructors
 * public DataModel();
 * public DataModel(String id, String pass);
 * public DataModel(String id, String pass, String conn);
 *
 *
 * Setter 
 * Must invoke first or results are not meaningful
 * public void setTeam(String team);
 *
 *
 * Getters
 * public Object[] getTeamList();
 * public String getTeam();
 * public int getTotalSeriesYears();
 * public getYearsAppeared();
 * public getTotalWins();
 * public getTotalLoses();
 * public getTotalSeriesWins();
 * public getTotalSeriesLoses();
 * public double getPercentGamesWon();
 * public double getPercentSeriesWon();
 * public double getPercentSeriesAppeared();
 *
 *
 * Other methods
 * public void closeConnection();
 *
 * Debugs
 * public void printState();
 *
 */

/*
 *
 * My model must extend Observable
 *
 */
public class DataModel extends Observable{

  private Connection connection = null;
  private Statement statement = null;
  private ResultSet resultSet = null;

  private String connectionString = null;

  private boolean connectionIsOpen = false;

  private String userID = null;
  private String password = null;
  private String team = null;

  private int totalYears = 0;

  private int yearsAppeared = 0;
  private int totalWins = 0;
  private int totalLoses = 0;
  private int totalSeriesWins = 0;
  private int totalSeriesLoses = 0;

  private Set <String> allTeams = null;

  public DataModel(){

    this("Student1", "pass", "jdbc:oracle:thin:@localhost:1521:XE");
  }

  public DataModel(String id, String pass){

    this(id, pass, "jdbc:oracle:thin:@localhost:1521:XE");
  }

  public DataModel(String id, String pass, String conn){

    userID = id;
    password = pass;
    connectionString = conn;

    connectionIsOpen = openConnection();

    if(connectionIsOpen){

      init();
    }
    else{

      System.out.println("Connection Is Not Open");
    }
  }

  public void setTeam(String team){

    if(this.team == null || !this.team.equals(team)){

      this.team = team;

      if(connectionIsOpen){

        setYearsAppeared();
        setTotalWins();
        setTotalLoses();

        /*
         *
         * When my data changes I must
         *
         * Ensure all data is updated
         *  note method calls above
         * and
         * I must set the change flag to changed
         *  note following method call setChanged()
         * and
         * I must notify all the views
         *  note method call notifyObservers()
         *
         * Views then know to update themselves
         */
        setChanged();

        notifyObservers();
      }
    }
    else{

      System.err.println("Error executeQuery:setTeam");
    }
  }

  public String getTeam(){

    return team;
  }

  public int getTotalSeriesYears(){

    return totalYears;
  }

  public int getYearsAppeared(){

    return yearsAppeared;
  }

  public int getTotalWins(){

    return totalWins;
  }

  public int getTotalLoses(){

    return totalLoses;
  }

  public int getTotalSeriesWins(){

    return totalSeriesWins;
  }

  public int getTotalSeriesLoses(){

    return totalSeriesLoses;
  }

  public double getPercentGamesWon(){

    int totalGames = totalWins + totalLoses;

    if(totalGames == 0){

      return 0.0;
    }
    else{

      return totalWins / ((double)totalGames);
    }
  }

  public double getPercentSeriesWon(){

    int totalSeries = totalSeriesWins + totalSeriesLoses;

    if(totalSeries == 0){

      return 0.0;
    }
    else{

      return totalSeriesWins / ((double)totalSeries);
    }
  }

  public double getPercentSeriesAppeared(){

    if(yearsAppeared == 0){

      return 0.0;
    }
    else{

      return yearsAppeared / ((double)totalYears);
    }
  }

  // Debug Tool
  public void printState(){

    System.out.println();

    System.out.println("Total Years = " + totalYears);
    System.out.println("Total Years Appeared = " + yearsAppeared);
    System.out.println("Total Wins = " + totalWins);
    System.out.println("Total Loses = " + totalLoses);
    System.out.println("Total totalSeriesWins = " + totalSeriesWins);
    System.out.println("Total totalSeriesLoses = " + totalSeriesLoses);

    System.out.println("Percent Games Won = " + getPercentGamesWon());
    System.out.println("Percent Series Won = " + getPercentSeriesWon());
    System.out.println("Percent Series Appeared = " + getPercentSeriesAppeared());

    System.out.println();
  }

  public void closeConnection(){

    try{

      statement.close();

      connection.close();
    }
    catch(SQLException e){

      e.printStackTrace();
    }
  }

  public Object[] getTeamList(){

    Object [] teamArray = allTeams.toArray();

    Arrays.sort(teamArray);

    return teamArray;
  }

  private final boolean openConnection(){

    try{

      DriverManager.registerDriver (new oracle.jdbc.OracleDriver());

      connection = DriverManager.getConnection(connectionString, userID, password);

      statement = connection.createStatement();

      return true;
    }
    catch(Exception e){

      return false;
    }
  }

  private final void init(){

    getTotalYears();    
    setAllTeams();
  }

  private final void setAllTeams(){

    allTeams = new LinkedHashSet <String>();

    try{

      resultSet = statement.executeQuery("SELECT team, loserTeam FROM Wins_S002MVC");
    }
    catch(SQLException e){

      System.err.println("Error executeQuery:setAllTeams - 1");
    }

    try{

      while(resultSet.next()){

        allTeams.add((resultSet.getString(1)).trim());
        allTeams.add((resultSet.getString(2)).trim());
      }
    }
    catch(Exception e){

      System.err.println("Error executeQuery:setAllTeams - 2");
    }
/*
 * Test code
 *
    Iterator iterator;

    iterator = allTeams.iterator();

    while(iterator.hasNext()){

      System.out.println(iterator.next());
    }
*/
  }

  private final void getTotalYears(){

    try{

      resultSet = statement.executeQuery("SELECT count(year_t) FROM Wins_S002MVC");
      resultSet.next();
      totalYears = Integer.parseInt((resultSet.getString(1)).trim());
    }
    catch(SQLException sqle){

      System.err.println("Error executeQuery:getTotalYears");
    }
  }

  private void setYearsAppeared(){

    try{

      resultSet = statement.executeQuery("SELECT count(year_t) FROM Wins_S002MVC WHERE Team = '" + team + "'");

      if(resultSet == null){

        yearsAppeared = totalSeriesWins = 0;
      }
      else{

        resultSet.next();
        yearsAppeared = totalSeriesWins = Integer.parseInt((resultSet.getString(1)).trim());
      }
    }
    catch(SQLException sqle){

      System.err.println("Error executeQuery:setYearsAppeared - 1");
    }

    try{

      resultSet = statement.executeQuery("SELECT count(year_t) FROM Wins_S002MVC WHERE LoserTeam = '" + team + "'");

      if(resultSet == null){

        yearsAppeared = 0;
        totalSeriesLoses = 0;
      }
      else{

        resultSet.next();
        totalSeriesLoses = Integer.parseInt((resultSet.getString(1)).trim());
        yearsAppeared += totalSeriesLoses;
      }
    }
    catch(SQLException sqle){

      System.err.println("Error executeQuery:setYearsAppeared - 2");
    }
  }

  private void setTotalWins(){

    try{

      resultSet = statement.executeQuery("SELECT sum(numWins) FROM Wins_S002MVC WHERE team = '" + team + "'");

      try{

        resultSet.next();
        totalWins = Integer.parseInt((resultSet.getString(1)).trim());
      }
      catch(Exception e){

        totalWins = 0;
      }
    }
    catch(SQLException sqle){

      System.err.println("Error executeQuery:setTotalWins - 1");
    }

    try{

      resultSet = statement.executeQuery("SELECT sum(numLoses) FROM Wins_S002MVC WHERE loserteam = '" + team + "'");

      try{

        resultSet.next();
        totalWins += Integer.parseInt((resultSet.getString(1)).trim());
      }
      catch(Exception e){

        totalWins += 0;
      }
    }
    catch(SQLException sqle){

      System.err.println("Error executeQuery:setTotalWins - 2");
    }
  }

  private void setTotalLoses(){

    try{

      resultSet = statement.executeQuery("SELECT sum(numLoses) FROM Wins_S002MVC WHERE team = '" + team + "'");

      try{

        resultSet.next();
        totalLoses = Integer.parseInt((resultSet.getString(1)).trim());
      }
      catch(Exception e){

        totalLoses = 0;
      }
    }
    catch(SQLException sqle){

      System.err.println("Error executeQuery:setTotalWins - 1");
    }

    try{

      resultSet = statement.executeQuery("SELECT sum(numWins) FROM Wins_S002MVC WHERE loserteam = '" + team + "'");

      try{

        resultSet.next();
        totalLoses += Integer.parseInt((resultSet.getString(1)).trim());
      }
      catch(Exception e){

        totalLoses += 0;
      }
    }
    catch(SQLException sqle){

      System.err.println("Error executeQuery:setTotalWins - 2");
    }
  }


/*
  Test code

  public static void main(String [] args){

    DataModel dataModel = new DataModel();

    dataModel.printState();

    dataModel.setTeam("Cardinals");

    dataModel.printState();

    dataModel.setTeam("Yankees");

    dataModel.printState();

    dataModel.setTeam("Cubs");

    dataModel.printState();

    Object [] objectArray = dataModel.getTeamList();

    for(int i = 0; i < objectArray.length; ++i){

      System.out.println(objectArray[i]);
    }

    dataModel.closeConnection();
  }
*/
}