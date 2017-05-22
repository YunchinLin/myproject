package oo.shopping;

import java.util.Scanner;

public class Tester1 {

	public static void main(String[] args) {
		System.out.println("今天,消費紀錄如下:");
		Customer cus = new Customer();
		SilverCustomer sil = new SilverCustomer();
		GoldenCustomer gol = new GoldenCustomer();
//		cus.amount = 6000;
		cus.printWay();
//		sil.amount = 8000;
		sil.print1();
//		sil.amount = 10000;
		sil.print1();
//		gol.amount = 30000;
		gol.print1();
//		cus.amount = 2000;
		cus.print1();
//		gol.amount = 10000;
		gol.print1();
	}

}
