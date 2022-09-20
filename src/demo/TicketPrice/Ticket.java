package demo.TicketPrice;

public class Ticket {
    private int ticketId,price,nooftickets;
    private static int availableTickets;

    public int getTicketId() {
        return ticketId;
    }

    public int setTicketId(int ticketId) {
        this.ticketId = ticketId;
        return ticketId;
    }

    public int getPrice() {
        return price;
    }

    public int setPrice(int price) {
        this.price = price;
        return price;
    }

    public static int getAvailableTickets() {
        return availableTickets;
    }

    public static int setAvailableTickets(int availableTickets) {
        if(availableTickets>0)
        Ticket.availableTickets = availableTickets;
        return availableTickets;
    }

    public int getNooftickets() {
        return nooftickets;
    }

    public int setNooftickets(int nooftickets) {
        this.nooftickets = nooftickets;
        return nooftickets;
    }

    public int calculateTicketCost(int nooftickets){
       int total=0;
       if(availableTickets<0){
           return  -1;
       }
        if(nooftickets<availableTickets){
            availableTickets=availableTickets-nooftickets;
            total=nooftickets*price;
        }
        return  total;
    }
}
