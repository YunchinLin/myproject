package oo.abstraction;

public class Main2 {

	public static void main(String[] args) {
		Ticket t1 = new Ticket("Mayday Concert", "2017/03/29", 'A', 33);
		t1.bookTicket(1);
		Ticket t2 = new Ticket("Amei Concert", "2017/08/20", 'C', 26);
		t2.bookTicket(1);
		Ticket t3 = new Ticket("Spexial Concert", "2016/05/21", 'E', 15);
		t3.bookTicket(0);
		
		int seat1 = t1.changeSeat(1);
		System.out.println("您的座位號碼為:"+seat1);
		System.out.println();
		int seat2 = t2.changeSeat(1);
		System.out.println("您的座位號碼為:"+seat2);
		System.out.println();
		int seat3 = t3.changeSeat(0);
	}

}
