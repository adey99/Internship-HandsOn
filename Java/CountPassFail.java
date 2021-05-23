import java.util.Scanner;
class Count{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,pass_count=0;
        int[] subjects = new int[20];
        System.out.println("Enter the no of subjects:");
        n= sc.nextInt();
        if(n<=0||n>20){
            System.out.println("Invalid input range");
            return;
        }
        for(int i =0;i<n;i++){
           subjects[i]= sc.nextInt();
           if(subjects[i]>=50)
                pass_count++;
        }
        if(pass_count==n)
            System.out.println("Ram passed in all subjects");
        else if(pass_count==0)
            System.out.println("Ram failed in all subjects");
        else
            System.out.println("Ram passed in "+pass_count+" subjects and failed in "+(n-pass_count)+" subjects");
        
    }
}