package oo.shopping;

import java.util.Scanner;

public class SilverCustomer extends Customer {
	int amount;
	String level = "銀級";
	public SilverCustomer(){
		
	}
	
	public SilverCustomer(int amount){
		this.amount = amount;
	}
	
	@Override
	public void print(){
		System.out.print("客戶級別:"+level+"\t");
		Scanner scanner = new Scanner(System.in);
		System.out.print("消費金額:");
		String price = scanner.nextLine();
		int p = Integer.parseInt(price);
		System.out.println("折扣後金額:"+(int)(p*0.9));
	}
}
