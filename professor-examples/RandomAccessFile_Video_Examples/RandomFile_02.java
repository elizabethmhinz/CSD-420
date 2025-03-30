import java.io.*;

public class RandomFile_02{

  public static void main(String[] args){

    try{

      /* 
       * Create random access file
       * Open for read/write
       *
       * r - read
       * rw - read/write
       */
      RandomAccessFile randomAccessFile = new RandomAccessFile("mydata_02.dat", "rw");

      // Clear file to destroy old contents if exists
      // test - use or not
      randomAccessFile.setLength(0);

      randomAccessFile.seek(randomAccessFile.length());

      // Display current file length
      System.out.println(randomAccessFile.length());

      for(int i = 0; i < 10; ++i){

        // Note a larger size
        randomAccessFile.writeDouble(Math.random() * i * 7);

        if(i % 2 == 0){

          // Display current file length  
          System.out.println(randomAccessFile.length());
        }
      }

      System.out.println("Display file without moving to position 0\n");
      
      while (randomAccessFile.getFilePointer() < randomAccessFile.length()){

        System.out.println(randomAccessFile.readDouble());
      }

      System.out.println("End of read one\n");

      randomAccessFile.seek(0);

      System.out.println("Display file after moving to position 0\n");

      while (randomAccessFile.getFilePointer() < randomAccessFile.length()){

        System.out.println(randomAccessFile.readDouble());
      }

      System.out.println("End of read two\n");
    }
    catch(IOException ioe){

      ioe.printStackTrace();
    }
  }
}