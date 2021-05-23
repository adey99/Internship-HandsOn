import java.util.*;
class PanCard 
{
 public static void main(String[] args) 
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the PAN no:");
  String PANno = sc.nextLine();
  if(PANno.matches("[A-Z]{5}\\d{4}[A-Z]{1}")){
      System.out.println("Valid PAN no");
  }
  else
    System.out.println("Invalid PAN no");
  }
}