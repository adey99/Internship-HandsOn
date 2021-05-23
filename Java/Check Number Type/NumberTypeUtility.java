import java.util.*;
public class NumberTypeUtility
{
   public static NumberType isOdd(){
        NumberType nt = (int number)->number%2==1;
        return nt;
   }
   public static void main (String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       NumberType nt = isOdd();
       if(nt.checkNumberType(num)){
           System.out.println(num+" is odd");
       }
       else
           System.out.println(num+" is not odd");
   }
}