import java.io.*;
import java.util.*;

public class File 
{
  public static void main(String[] args) throws Exception 
  {
     int i=0;

     FileInputStream file = new FileInputStream("f1.txt");
     FileOutputStream evenFile = new FileOutputStream("EvenFile.txt");
     FileOutputStream oddFile = new FileOutputStream("OddFile.txt");
    
     while((i=file.read())!=-1) 
     {
      if(i%2==0)
      {
      evenFile.write(i);
     }
      else
      oddFile.write(i);
     }
    
     file.close();
     evenFile.close();
     oddFile.close();

      }

    }