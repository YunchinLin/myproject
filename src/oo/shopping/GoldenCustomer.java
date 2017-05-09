package oo.shopping;

public class GoldenCustomer extends SilverCustomer {
	String level = "金級";
	public GoldenCustomer(){
		
	}
	
	public GoldenCustomer(int amount){
		this.amount = amount;
	}
	
	@Override
	public void print(){
		System.out.println("客戶級別:"+level+"\t"+"消費金額:"+amount+"\t"+
	                       "折扣後金額:"+(int)(amount*0.9)+"\t"+"還元金:"+(int)(amount*0.05));
	}
}
