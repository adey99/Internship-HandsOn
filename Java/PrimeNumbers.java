import java.util.Scanner;
public class PrimeNumbers{
    public static void main (String[] args) {
        int num1=0,num2=0,i;
        boolean is_prime;
        Scanner sc = new Scanner(System.in);
        try{
            num1 = sc.nextInt();
            num2 = sc.nextInt();
        }
        catch(Exception e){
            System.out.println("Provide valid input");
        }
        if(num2<num1||num1==num2||num2*num1<=0){
            System.out.println("Provide valid input");
            return;
        }
        i=num1;
        while(i<=num2){
            is_prime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    is_prime = false;
                    break;
                }
            }
            if(is_prime&&i!=1)
                System.out.print(i+" ");
            i++;
        }
    }
}