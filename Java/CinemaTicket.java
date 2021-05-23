import java.util.Scanner;
class CinemaTicket{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int ntickets;
        float tot_price= 0.0f;
        char coupon,refr,circle;
        System.out.println("Enter the no of ticket:");
        ntickets = sc.nextInt();
        sc.nextLine();
        if(ntickets<5||ntickets>40){
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
            return;
        }
        System.out.println("Do you want refreshment:");
        refr = sc.next().charAt(0);
        System.out.println("Do you have coupon code:");
        coupon = sc.next().charAt(0);
        System.out.println("Enter the circle:");
        circle = sc.next().charAt(0);
        if(circle!='k'&& circle!='q'){
            System.out.println("Invalid Input");
            return;
        }
        if(circle=='k')
            tot_price+= 75*ntickets;
        else
            tot_price+= 150*ntickets;
        if(ntickets>20)
            tot_price*=0.9f;
        if(coupon=='y')
            tot_price*=0.98f;
        if(refr=='y')
            tot_price+= 50*ntickets;
        System.out.printf("Ticket cost:%.2f", tot_price);
    }
}