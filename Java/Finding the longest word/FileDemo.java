import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileDemo {
     public static void main(String [ ] args){
       String longest_word = "";
       String current;
       try{
       Scanner sc = new Scanner(new File("log.txt"));
       while (sc.hasNext()) {
          current = sc.next();
           if (current.length() > longest_word.length()) {
             longest_word = current;
           }

       }
       System.out.println(longest_word);
       }
       catch(FileNotFoundException fne){
           System.out.println(fne.getMessage());
       }

              
     }

}
