public class Ticket{
    private int ticketid;
    private int price;
    private static int availableTickets;
    static{
        availableTickets=0;
    }
    public int getTicketid(){
        return this.ticketid;
    }
    public void setTicketid(int tid){
        this.ticketid = tid;
    }
    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public static int getAvailableTickets(){
        return availableTickets;
    }
    public static void setAvailableTickets(int av_tickets){
        if(av_tickets<=0){
            System.out.println("Zero and negative values are not allowed");
            return;
        }
        availableTickets=av_tickets;
        return;
    }
    public int calculateTicketCost(int nooftickets){
        if(nooftickets>availableTickets)
            return -1;
        int amount=nooftickets*this.price;
        availableTickets-=nooftickets;
        return amount;
    }
}