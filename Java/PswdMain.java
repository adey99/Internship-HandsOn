import java.util.*;
class Main{
     public static void main (String[] args) {
         Scanner in=new Scanner(System.in);
         System.out.println("Generate your Security Code");
         String s1=in.nextLine();
         if(s1.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[#*@])[A-Za-z0-9@#*]{8,}$"))
             System.out.println("Security Code Generated Successfully");
         else
             System.out.println("Invalid Security Code, Try Again!");
     }
 }