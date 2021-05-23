//import the necessary packages if needed
import java.util.*;
@SuppressWarnings("unchecked")//Do not delete this line
public class UniqueWords
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int i=1;
        System.out.println("Enter Student's Article");
        str = sc.nextLine();
        str = str.toLowerCase();
        String[] words = str.split("[\\s,:;!.?]+");
        System.out.println("Number of words "+words.length); 
        TreeSet<String> uniqueWords = new TreeSet<String>(Arrays.asList(words));
        System.out.println("Number of unique words "+uniqueWords.size());
        System.out.println("The words are");
        for(String s:uniqueWords){
            System.out.println(i+". "+s);
            i++;
        }
    }        
}