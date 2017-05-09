package oo.shopping;

public class Tester {

	public static void main(String[] args) {
		System.out.println("今天,消費紀錄如下:");
		Customer cus = new Customer();
		SilverCustomer sil = new SilverCustomer();
		GoldenCustomer gol = new GoldenCustomer();
		cus.amount = 6000;
		cus.print();
		sil.amount = 8000;
		sil.print();
		sil.amount = 10000;
		sil.print();
		gol.amount = 30000;
		gol.print();
		cus.amount = 2000;
		cus.print();
		gol.amount = 10000;
		gol.print();
	}

}
