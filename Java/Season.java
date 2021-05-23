import java.util.Scanner;
class Season{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int month;
        System.out.println("Enter the month:");
        month = sc.nextInt();
        if(month<1||month>12){
            System.out.println("Invalid month");
            return;
        }
        if(month%12>8)
            System.out.println("Season:Autumn");
        else if(month%12>5)
            System.out.println("Season:Summer");
        else if(month%12>2)
            System.out.println("Season:Spring");
        else
            System.out.println("Season:Winter");
    }
}