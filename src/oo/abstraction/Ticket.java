package oo.abstraction;

import java.util.Scanner;

public class Ticket {
	int serialnumber;
	String name;
	String time;
	char area;
	int seat;
	int price;
	int status;
	
	public Ticket(String name, String time, char area, int seat){
		this.name = name;
		this.time = time;
		this.area = area;
		this.seat = seat;
	}
	
	public void bookTicket(int s){
		status = s;
	}
	
	public int changeSeat(int status){
		if (status!=0){
			Scanner scanner = new Scanner(System.in);
			System.out.println("請輸入您欲更換的座位號碼:");
			String string = scanner.nextLine();
			seat = Integer.parseInt(string);
			return seat;
		}else{
			System.out.println("您尚未訂購票卷");
			return status;
		}
	}
	
	public void cancelTicket(){
		status = 0;//未訂票
	}
	
}
