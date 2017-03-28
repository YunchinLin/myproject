package oo.abstraction;

public class Car {
	int id;
	String brand;
	String name;
	int cc;
	String type;
	int status;//狀態
	float milage;//里程數
	
	public Car(String brand, String name, int cc){
		this.brand = brand;
		this.name = name;
		this.cc = cc;
	}
	
	public void setMilage(int m){
		milage = m;
	}
	
	public float addMilage(int m){
		milage = milage + m;
		return milage;
	}
	
	public void maintain(){
		status = 5;//保養中
	}
}
