import java.util.*;
public class Division{
    public String divideTwoNumbers(int number1,int number2){
        String str_result="";
        try {
            if(number2==0)
                throw new ArithmeticException();
            int result=number1/number2;
            str_result+=("The answer is "+result+". ");
        } 
        catch(ArithmeticException ae) {
            str_result+="Division by zero is not possible. ";
        }
        finally{
            str_result+="Thanks for using the application.";
            return str_result;
        }
    }
    public static void main (String[] args) {
        Division d = new Division();
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter the numbers");
        num1=sc.nextInt();
        num2=sc.nextInt();
        System.out.println(d.divideTwoNumbers(num1,num2));
    }
}