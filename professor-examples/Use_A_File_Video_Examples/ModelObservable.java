/*
 * Model
 *
 * java.util.Observable provides method addObserver
 *
 * The M - Model layer of the MVC design pattern represents the data layer of the application.
 * The model is the data layer that retrieves, updates, and stores in a database, file or server.
 *
 */
public class ModelObservable extends java.util.Observable{

  private int [] data = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

  private int dataPosition = 0;

  public void increase(){

    if(dataPosition < data.length - 1){

      ++dataPosition;
    }

    setChanged();

    notifyObservers();
  }

  public void decrease(){

    if(dataPosition > 0){

      --dataPosition;
    }

    setChanged();

    notifyObservers();
  }

  public int getData(){

    return data[dataPosition];
  }
}