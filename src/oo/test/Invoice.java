package oo.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {

	public static void main(String[] args) {
//		String s = "331";
//		//----------0123456789
//		String n = "1234567331";
//		System.out.println(n.length());
//		String sub = n.substring(n.length()-3);
//		System.out.println(sub);
		
		ArrayList<String> a = new ArrayList();
		a.add("331");
		a.add("821");
		a.add("886");
		a.add("554");
		while(true){
			Scanner scanner = new Scanner(System.in);
			System.out.print("請輸入發票號碼:");
			String num = scanner.nextLine();
			String sub = num.substring(num.length()-3);
			if (a.get(0).equals(sub) || a.get(1).equals(sub) || a.get(2).equals(sub) || a.get(3).equals(sub)){
				System.out.println("您中獎惹!");
			}else{
				System.out.println("摃龜摟~");
			}
		}
	}

}
