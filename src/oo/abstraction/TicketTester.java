package oo.abstraction;

public class TicketTester {

	public static void main(String[] args) {
		Ticket t1 = new Ticket("Mayday Concert", "2017/03/29", 'A', 33);
		Ticket t2 = new Ticket("Amei Concert", "2017/08/20", 'C', 26);
		Ticket t3 = new Ticket("Spexial Concert", "2016/05/21", 'E', 15);
		
		Ticket[] tickets = new Ticket[3];
		tickets[0] = new Ticket("Mayday Concert", "2017/03/29", 'A', 33);
		tickets[1] = new Ticket("Amei Concert", "2017/08/20", 'C', 26);
		tickets[2] = new Ticket("Spexial Concert", "2016/05/21", 'E', 15);
		tickets[0].price = 1200; 
		tickets[1].price = 800;
		tickets[2].price = 500;
		for (int i=0; i<3; i++){
			System.out.println(tickets[i].area+"區\t"+tickets[i].seat);
		}
		tickets[0].serialnumber = 96398754; 
		tickets[1].serialnumber = 65722450;
		tickets[2].serialnumber = 15841548;
	}

}
