package oo.abstraction;

public class Main1 {

	public static void main(String[] args) {
		Car c1 = new Car("Toyota", "Altis", 1800);
		c1.setMilage(25000);
		Car c2 = new Car("Honda", "Accord", 2000);
		c2.setMilage(24000);
		Car c3 = new Car("Toyota", "Wish", 2000);
		c3.setMilage(23000);
		//
		float current1 = c1.addMilage(80);
		System.out.println("目前里程為"+current1);
		float current2 = c2.addMilage(-80);
		System.out.println("目前里程為"+current2);
		float current3 = c3.addMilage(-50);
		System.out.println("目前里程為"+current3);
	}

}
