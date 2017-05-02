package oo.mid;

import java.util.Scanner;

public class Meal {
	//Fields
	int project;
	String burgur;
	String frieds;
	String drinks;
	int price;
	
	//Constructors
	public Meal(int project, String burgur, String frieds, String drinks){
		this.project = project;
		this.burgur = burgur;
		this.frieds = frieds;
		this.drinks = drinks;
	}
	
	//Method
	public void totalPrice(int p){
		project = p;
		System.out.println(p+". "+burgur+" "+frieds+" "+price);
	}
	
//	public void orderMeal(int project){
//		if(project!=0) {
//			System.out.println("消費金額"+totalPrice);
//		}else{
//			return;
//		}
//	}
//	public int totalPrice(String burger){
//		return burger.valueOf(price);
//	}
	}
