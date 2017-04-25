package oo.mid;

import java.util.Scanner;

public class Meal {
	int project;
	String burgur;
	String frieds;
	String drinks;
	int price;
	
	public Meal(int project, String burgur, String frieds, String drinks){
		this.project = project;
		this.burgur = burgur;
		this.frieds = frieds;
		this.drinks = drinks;
	}
	
	public void totalPrice(int p){
		project = p;
		System.out.println(p+". "+burgur+" "+frieds+" "+price);
	}
}
