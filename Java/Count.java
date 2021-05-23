import java.util.Scanner;
class Count{
    public static void main (String[] args) {
        Scanner sc =new Scanner(System.in);
        int std,prev=0;
        System.out.println("Enter the standard:");
        std = sc.nextInt();
        if(std<1 || std>12){
            System.out.println("Invalid Standard");
            return;
        }
        for(int i=1;i<=std;i++){
            prev+=i*i;
        }
        System.out.println("Nila gets "+prev+" pencils");
    }
}