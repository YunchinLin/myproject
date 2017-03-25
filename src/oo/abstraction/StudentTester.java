package oo.abstraction;

public class StudentTester {

	public static void main(String[] args) {
		Student s1 = new Student("輔仁大學", "醫資學程", 405570173, "林芸妗", "女", 1);
		Student s2 = new Student("輔仁大學", "醫資學程", 405570202, "蔡德蓉", "女", 1);
		Student s3 = new Student("輔仁大學", "醫資學程", 405570214, "張芳菽", "女", 1);
		
		Student[] ss = new Student[3];
		ss[0] = new Student("輔仁大學", "醫資學程", 405570173, "林芸妗", "女", 1);
		ss[1] = new Student("輔仁大學", "醫資學程", 405570202, "蔡德蓉", "女", 1);
		ss[2] = new Student("輔仁大學", "醫資學程", 405570214, "張芳菽", "女", 1);
		ss[0].seatnumber = 17;
		ss[1].seatnumber = 20;
		ss[2].seatnumber = 21;
		
	}

}
