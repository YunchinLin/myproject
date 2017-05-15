package oo.shopping;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		System.out.println("今天,消費紀錄如下:");
		Customer cus = new Customer();
		SilverCustomer sil = new SilverCustomer();
		GoldenCustomer gol = new GoldenCustomer();
		cus.print();//6000
		sil.print();//8000
		sil.print();//10000
		gol.print();//30000
		cus.print();//2000
		gol.print();//10000
	}

}
