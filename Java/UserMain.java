import java.util.*;
class UserMain 
{
 public static void main(String[] args) 
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter your PAN number");
  String PANno = sc.nextLine();
  if(PANno.matches("[A-Z]{5}\\d{4}[A-Z]{1}")){
      System.out.println("Valid PAN number");
  }
  else
    System.out.println("Invalid PAN number");
  }
}