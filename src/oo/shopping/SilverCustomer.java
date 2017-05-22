package oo.shopping;

import java.util.Scanner;

public class SilverCustomer extends Customer {
	String level = "銀級";
	float discount = 0.9f;
	public SilverCustomer() {
		
	}

	public SilverCustomer(int amount) {
		this.amount = amount;
	}

	/*public SilverCustomer(int amount){
		super(amount);
	}*/
	//如果不寫空的建構子
	
	@Override
	public void print1() {
		System.out.print("客戶級別:"+level+"\t");
		Scanner scanner = new Scanner(System.in);
		System.out.print("消費金額:");
		String price = scanner.nextLine();
		int p = Integer.parseInt(price);
		System.out.println("折扣後金額:" + (int)(p * 0.9));
	}
	
	@Override
	public void print2(){
		System.out.println(level+"\t"+amount+"\t"+
	                      (int)(amount*discount)+"\t0");
	}
	
	@Override
	public void printWay(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入您欲列印的格式(1.每一項目為一行 2.多項目為一行):");
		String way = scanner.nextLine();
		int w = Integer.parseInt(way);
		if(w == 1){
			System.out.print("客戶級別:"+level+"\t");
			System.out.print("消費金額:");
			String price = scanner.nextLine();
			int p = Integer.parseInt(price);
		}else{
			System.out.println(level+"\t"+amount+"\t0\t0");
		}
	}
}
