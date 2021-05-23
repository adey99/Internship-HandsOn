import java.util.Scanner;
class BikeRace{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int dist,oddprod=1,evenprod=1,digit,pos=1;
        System.out.println("Enter the distance travelled");
        dist = sc.nextInt();
        if(dist<0){
            System.out.println("Invalid Input");
            return;
        }
        if(dist==0){
            System.out.println("Your bonus points is 0");
            return;
        }
        while(dist>0){
            digit=dist%10;
            if(pos%2==0)
                oddprod*=digit;
            else
                evenprod*=digit;
            dist/=10;
            pos++;
        }
        if(evenprod>oddprod)
            System.out.println("Your bonus points is "+evenprod);
        else if(evenprod==oddprod)
            System.out.println("Your bonus points is "+(2*evenprod));
        else
            System.out.println("Your bonus points is "+oddprod);
    }
}