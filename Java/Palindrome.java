import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, reversedInteger = 0, remainder, originalInteger;
        num = sc.nextInt();
        originalInteger = num;
        if(num<0){
            System.out.println("Invalid Input");
            return;
        }
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }
        if (originalInteger == reversedInteger)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}