package oo.abstraction;

public class ForTester {

	public static void main(String[] args) {
		int k=1;
		for (k=1; k<=9; k=k+2) {
			System.out.print(k+"\t");
		}
		System.out.println(k);
		
		for (int i=1; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				System.out.print(i+"*"+j+"=");
				if ((i*j)<10) {
					System.out.print(" ");
				}
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}
	}

}
