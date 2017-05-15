package oo.shopping;

import java.util.Scanner;

public class GoldenCustomer extends SilverCustomer {
	String level = "金級";
	public GoldenCustomer(){
		
	}
	
	public GoldenCustomer(int amount){
		this.amount = amount;
	}
	
	@Override
	public void print(){
		System.out.print("客戶級別:"+level+"\t");
		Scanner scanner = new Scanner(System.in);
		System.out.print("消費金額:");
		String price = scanner.nextLine();
		int p = Integer.parseInt(price);
	    System.out.println("折扣後金額:"+(int)(p*0.9)+
	    		         "\t"+"還元金:"+(int)(p*0.05));
	}
}
