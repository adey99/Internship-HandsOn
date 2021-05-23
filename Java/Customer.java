import java.util.Scanner;
class Customer{
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    String name,age,gender,city;
    System.out.println("Enter your name:");
    name = sc.nextLine();
    System.out.println("Enter age:");
    age = sc.nextLine();
    System.out.println("Enter gender:");
    gender = sc.nextLine();
    System.out.println("Hailing from:");
    city = sc.nextLine();
    System.out.println("Welcome, "+ name+"!");
    System.out.println("Age:"+ age);
    System.out.println("Gender:"+gender);
    System.out.println("City:"+city);
    }
}