import java.io.*;

public class RandomFile_03{

  public static void main(String[] args){

    String data = null;
    int totalLines = 0;
    int bufferLength = 20;

    try{

      /* 
       * Instances of this class support both reading and 
       *    writing to a random access file. 
       *    A random access file behaves like a large array 
       *    of bytes stored in the file system. 
       *    There is a kind of cursor, or index into the implied array, 
       *    called the file pointer; 
       *    input operations read bytes starting at the file pointer 
       *    and advance the file pointer past the bytes read. 
       *    If the random access file is created in read/write mode, 
       *    then output operations are also available; 
       *    output operations write bytes starting at the file pointer 
       *    and advance the file pointer 
       *    past the bytes written. Output operations that write 
       *    past the current end of the implied 
       *    array cause the array to be extended. The file pointer 
       *    can be read by the getFilePointer 
       *     method and set by the seek method. 
       *
       * r - read
       * rw - read/write
       *
       */
      RandomAccessFile randomAccessFile = new RandomAccessFile("mydata_03.dat", "rw");

      /* 
       * A string buffer implements a mutable sequence of characters. 
       *    A string buffer is like a String, 
       *    but can be modified. At any point in time it contains some 
       *    particular sequence of characters, 
       *    but the length and content of the sequence can be changed 
       *    through certain method calls. 
       */
      StringBuffer buffer = new StringBuffer("My Data " + (int)(Math.random() * 100 + 1));

      /*
       * Sets the length of this String buffer. This string buffer is 
       *    altered to represent a new character 
       *    sequence whose length is specified by the argument. 
       *    For every nonnegative index k less 
       *    than newLength, the character at index k in the new character 
       *    sequence is the same as the 
       *    character at index k in the old sequence if k is less 
       *    than the length of the old character sequence; 
       *    otherwise, it is the null character '\u0000'. In other words, 
       *    if the newLength argument is less 
       *    than the current length of the string buffer, the string 
       *    buffer is truncated to contain exactly 
       *    the number of characters given by the newLength argument. 
       */
      buffer.setLength(bufferLength);


      /* 
       * The character at the specified index of this string buffer is set to ch. 
       * The string buffer is altered to represent a new character 
       *    sequence that is identical to 
       *    the old character sequence, except that it contains the 
       *    character ch at position index. 
       * The index argument must be greater than or equal to 0, 
       *    and less than the length of this string buffer. 
       */
      buffer.setCharAt(bufferLength - 1, '\n');

      /* 
       * public void seek(long pos)
       *  throws IOExceptionSets 
       *    the file-pointer offset, measured from the beginning of 
       *    this file, at which the next read or write occurs. 
       *  The offset may be set beyond the end of the file. Setting the 
       *    offset beyond the end of the 
       *    file does not change the file length. The file length will 
       *    change only by writing after the offset 
       *    has been set beyond the end of the file. 
       *
       *  public long length()
       *   throws IOExceptionReturns the length of this file. 
       *  Returns:
       *    the length of this file, measured in bytes. 
       */
      randomAccessFile.seek(randomAccessFile.length());

      // Write file
      randomAccessFile.writeChars(buffer.toString());      

      // Reset file pointer
      randomAccessFile.seek(0);

      // Read file
      while ((data = randomAccessFile.readLine()) != null){

        System.out.println(data);
        totalLines++;
      }

      System.out.println(totalLines);

      // Close file
      randomAccessFile.close();

    }
    catch(IOException ioe){
      ioe.printStackTrace();
    }
  }
}