package oo.shopping;

import java.util.ArrayList;

public class Tester2 {

	public static void main(String[] args) {
		System.out.println("客戶級別"+"\t"+"消費金額"+"\t"+"折扣後金額"+"\t"+"還元金");
		ArrayList<Customer> list = new ArrayList<>();
		list.add(new Customer(6000));
		list.add(new SilverCustomer(8000));
		list.add(new SilverCustomer(10000));
		list.add(new GoldenCustomer(30000));
		list.add(new Customer(2000));
		list.add(new GoldenCustomer(10000));
//		for(int i=0; i<list.size(); i++){
//			Customer cus = list.get(i); 
		for (Customer cus : list){
			if ((cus instanceof SilverCustomer) && 
				!(cus instanceof GoldenCustomer)){
				System.out.print("*");
				SilverCustomer silver = (SilverCustomer)cus;
			}
			cus.print2();
		}
		
		/*String[] array = {"aa","bb","cc"};
		for (String s : array){
			System.out.println(s);
		}
		for (int i=0; i<array.length; i++){
			String s = array[i];
			System.out.println(s);
		}*/
	}

}
