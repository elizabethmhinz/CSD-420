/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 *
 * Record class to hold a single years World Series's data
 *
 * Mostly getters and setters with an
 *   overloaded toString() method
 *
 */

public class MyRecord{

  String team;
  String city;
  String year_T;
  String loserTeam;
  String loserCity;

  public String getTeam(){

    return team;
  }

  public void setTeam(String team){

    this.team = new String(team);
  }

  public String getCity(){

    return city;
  }

  public void setCity(String city){

    this.city = new String(city);
  }

  public String getYear_T(){

    return year_T;
  }
  
  public void setYear_T(String year_T){

    this.year_T = new String(year_T);
  }

  public String getLoserTeam(){

    return loserTeam;
  }

  public void setLoserTeam(String loserTeam){

    this.loserTeam = new String(loserTeam);
  }

  public String getLoserCity(){

    return loserCity;
  }

  public void setLoserCity(String loserCity){

    this.loserCity = new String(loserCity);
  }

  public String toString(){

    return new String(team.toString().trim() + ", " + 
                      city.toString().trim() + ", " + 
                      year_T.toString().trim() + ", " + 
                      loserTeam.toString().trim() + ", " + 
                      loserCity.toString().trim());
  }
}