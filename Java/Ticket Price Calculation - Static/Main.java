import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Ticket t = new Ticket();
        int id,price,ntickets,av_tickets,nbook;
        System.out.println("Enter no of bookings:");
        nbook = sc.nextInt();
        sc.nextLine();
        do{
            System.out.println("Enter the available tickets:");
            av_tickets = sc.nextInt();
            sc.nextLine();
        }while(Ticket.getAvailableTickets()==0);
        int i = 1;
        while(i<=nbook){
            System.out.println("Enter the ticketid:");
            id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the price:");
            price =sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the no of tickets:");
            ntickets = sc.nextInt();
            sc.nextLine();
            System.out.println("Available tickets: "+Ticket.getAvailableTickets());
            System.out.println("Total amount:"+t.calculateTicketCost(ntickets));
            System.out.println("Available ticket after booking:"+Ticket.getAvailableTickets());
        }
        
    }
}