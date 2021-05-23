import java.util.Scanner;
class LuckyNum{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,sum=0,digit;
        System.out.println("Enter the car no:");
        num = sc.nextInt();
        if(num/1000>9||num/1000<1){
            System.out.println(num+" is not a valid car number");
            return;
        }
        while(num>0){
            digit = num%10;
            sum+=digit;
            num/=10;
        }
        if(sum%3==0||sum%5==0||sum%7==0)
            System.out.println("Lucky Number");
        else
            System.out.println("Sorry its not my lucky number");
    }
}