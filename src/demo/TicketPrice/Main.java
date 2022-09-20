package demo.TicketPrice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Ticket  ticket=new Ticket();
        System.out.println("Enter no og booking");
        int noofBooking=sc.nextInt();
        System.out.println("Enter available tickets");
        int tickets=ticket.setAvailableTickets(sc.nextInt());
        for(int i=0;i<noofBooking;i++){
            System.out.println("Enter ticket id");
            int ticId=ticket.setTicketId(sc.nextInt());
            System.out.println("Enter price");
            int price=ticket.setPrice(sc.nextInt());
            System.out.println("Enter no of tickets");
            int nooftic=ticket.setNooftickets(sc.nextInt());
            System.out.println("Available ticket : "+ticket.getAvailableTickets());
            System.out.println("Total cost : "+ticket.calculateTicketCost(nooftic));
            System.out.println("Available ticket : "+ticket.getAvailableTickets());
        }
    }
}
