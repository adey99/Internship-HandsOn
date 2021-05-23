import java.util.Scanner;
class Palindrome{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str,revstr;
        System.out.println("Enter the word :");
        str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(!Character.isLetter(str.charAt(i))){
                System.out.println("Invalid Input");
                return;
            }
        }
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        revstr = sb.toString();
        if(str.equalsIgnoreCase(revstr))
            System.out.println(str+" is a Palindrome");
        else
            System.out.println(str+" is not a Palindrome");
    }
}