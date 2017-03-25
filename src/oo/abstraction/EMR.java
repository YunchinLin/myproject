package oo.abstraction;

public class EMR {
	int ChartNumber;
	String IdentityCard;
	String Name;
	char Gender;
	int Birthday;
	String ADT;
	public EMR(String IdentityCard, String Name, char Gender, int Birthday){
		this.IdentityCard = IdentityCard;
		this.Name = Name;
		this.Gender = Gender;
		this.Birthday = Birthday;
	}
}
