package oo.shopping;

import java.util.Scanner;

public class Customer {
	int amount;
	String level = "一般";
	public Customer(){

	}
	
	public Customer(int amount){
		this.amount = amount;
	}
	
	public void print1(){
		System.out.print("客戶級別:"+level+"\t");
		Scanner scanner = new Scanner(System.in);
		System.out.print("消費金額:");
		String price = scanner.nextLine();
		int p = Integer.parseInt(price);
	}
	
	public void print2(){
		System.out.println(level+"\t"+amount+"\t0\t0");
	}
	
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
