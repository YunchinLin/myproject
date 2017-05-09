package oo.shopping;

public class SilverCustomer extends Customer {
	String level = "銀級";
	public SilverCustomer(){
		
	}
	
	public SilverCustomer(int amount){
		this.amount = amount;
	}
	
	@Override
	public void print(){
		System.out.println("客戶級別:"+level+"\t"+"消費金額:"+amount+"\t"+
	                       "折扣後金額:"+(int)(amount*0.9));
	}
}
