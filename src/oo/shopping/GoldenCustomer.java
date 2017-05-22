package oo.shopping;

import java.util.Scanner;

public class GoldenCustomer extends SilverCustomer {
	String level = "金級";
	float returnRate = 0.05f;
	public GoldenCustomer(){
		
	}

	public GoldenCustomer(int amount) {
		this.amount = amount;
	}
	
	@Override
	public void print1() {
		System.out.print("客戶級別:"+level+"\t");
		Scanner scanner = new Scanner(System.in);
		System.out.print("消費金額:");
		String price = scanner.nextLine();
		int p = Integer.parseInt(price);
		System.out.println("折扣後金額:"+(int)(p*0.9)+"\t"+"還元金:"+(int)(p*0.05));
	}
	
	@Override
	public void print2(){
		System.out.println(level+"\t"+amount+"\t"+(int)(amount*discount)+
				           "\t"+(int)(amount*returnRate));
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
