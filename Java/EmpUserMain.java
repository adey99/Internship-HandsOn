import java.util.*;
class UserMain 
{
 public static void main(String[] args) 
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter your ID");
  String PANno = sc.nextLine();
  if(PANno.matches("GBL/\\d{3}/\\d{4}")){
      System.out.println("Login Success");
  }
  else
    System.out.println("Incorrect ID");
  }
}