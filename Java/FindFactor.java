import java.util.Scanner;
class FindFactor{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number;
    number = sc.nextInt();
    if(number==0){
        System.out.println("No Factors");
        return;
    }
    for(int i = 1; i <= Math.abs(number); ++i) {
        if (number % i == 0)
          System.out.print(i + ", ");
    }
  }
}