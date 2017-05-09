package oo.shopping;

public class Customer {
	int amount;
	String level = "一般";
	public Customer(){

	}
	
	public Customer(int amount){
		this.amount = amount;
	}
	
	public void print(){
		System.out.println("客戶級別:"+level+"\t"+"消費金額:"+amount);
	}
}
