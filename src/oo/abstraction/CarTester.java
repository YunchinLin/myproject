package oo.abstraction;

public class CarTester {

	public static void main(String[] args) {
		Car c1 = new Car("Toyota", "Altis", 1800);
		Car c2 = new Car("Honda", "Accord", 2000);
		Car c3 = new Car("Toyota", "Wish", 2000);
		
//		Arrays in Java
		int[] n = new int[5];
//		n[0] = 0;
//		n[1] = 0;
//		n[2] = 0;
//		n[3] = 0;
		System.out.println(n[2]);
		
		Car[] cars = new Car[3];
		
		System.out.println(cars[0]);
		
		cars[0] = new Car("Toyota", "Altis", 1800);
		cars[1] = new Car("Honda", "Accord", 2000);
		cars[2] = new Car("Toyota", "Wish", 2000);
		cars[0].id = 301;
		cars[1].id = 400;
		cars[2].id = 403;
		System.out.println(cars[0].name);
		int i= 0;
		for (i=0; i<3; i++){
			System.out.println(cars[i].name);
		}
		System.out.println(i);
		for (i=1; i<=9; i=i+2){
			System.out.println(i);
		}
		System.out.println(i);
		
		class AA{
			
		}
		AA a = new AA();
	}

}
