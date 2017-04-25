package oo.mid;

public class MealTester {

	public static void main(String[] args) {
		Meal m1 = new Meal(1, "A堡", "薯條", "可樂");
		Meal m2 = new Meal(2, "B堡", "炸雞", "雪碧");
		Meal m3 = new Meal(3, "C堡", "薯條", "紅茶");
		m1.price = 99;
		m2.price = 109;
		m3.price = 89;
		
		m1.totalPrice(1);
		m2.totalPrice(2);
		m3.totalPrice(3);
	}

}
