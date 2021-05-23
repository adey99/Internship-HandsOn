import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileDemo {
     public static void main(String [ ] args){
       String current;
       int count=0;
       try{
           Scanner sc = new Scanner(new File("log.txt"));
           while (sc.hasNext()) {
              current = sc.next();
               if (current.equalsIgnoreCase("knowledge"))
                 count++;
           }
           System.out.println(count);
       }
       catch(FileNotFoundException fne){
           System.out.println(fne.getMessage());
       }

              
     }

}
