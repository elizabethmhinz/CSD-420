/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
import java.io.*;

public class Recursion_99{

  public static void main(String [] args){

//    File directoryLocation = new File("C:\\Temp");
    File directoryLocation = new File("C:\\Windows");
//    File directoryLocation = new File(".");

    printDirList(directoryLocation);
  }

  public static void printDirList(File dir){

    File tempFile = null;

    // Because of security settings, this line will sometimes return null.
    String [] fileNames = dir.list();

    // As a result I will test
    if(fileNames != null){

      for(int i = 0; i < fileNames.length; ++i){

        tempFile = new File(dir.getAbsolutePath(), fileNames[i]);

        System.out.println(tempFile.getAbsolutePath() + fileNames[i]);

        if(tempFile.isDirectory()){
  
          printDirList(tempFile);
        }
      }
    }
  }
}