package demo.movieticket;

public class MovieTicketCalculation {
public static void main(String[] args) {
	 int noOfTickets;
	 char refreshment;
	char couponCode, circle;
	 float total;
	System.out.println("Enter no of tickets");
	noOfTickets=35;
	System.out.println("Do you want refreshment ");
	refreshment='y';
	System.out.println("Do you have coupon code");
	couponCode='y';
	System.out.println("Enter the circle");
	circle='k';
	if(noOfTickets<5 && noOfTickets>40) {
		System.out.println("Minimum of 5 and Maximum of 40 Tickets");
	}
	if(circle!='k' && circle !='q')
		System.out.println("invalid input");
	if(noOfTickets>20 && refreshment=='y' && couponCode=='y' && circle=='k') {
		int totalCost=75*noOfTickets+noOfTickets*50;

		total=((12*totalCost)/100);
		System.out.println("Ticket cost "+(totalCost-total));

		
	}
}

}
