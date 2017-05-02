package oo.stati;

class Student {//省略public
	int english;
	int math;
	int chinese;
	static int pass = 60;
	static {
		System.out.println("STATIC!!!");
//		System.out.println(english); why?
		System.out.println(pass);;
	}
	
	Student(){//省略public
		
	}
//	public Student(int english, int math, int chinese){
//		this.english = english;
//		this.math = math;
//		this.chinese = chinese;
//	}
	public Student(int english, int math, int chinese) {
		super();
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}//右鍵 > Source > Generate Constructor using Fields
//	public void print(){
//		System.out.print(english);
//		if (english < pass)
//			System.out.print("*");
//		System.out.print("\t");
//		System.out.print(math);
//		if (math < pass)
//			System.out.print("*");
//		System.out.print("\t");
//		System.out.print(chinese);
//		if (chinese < pass)
//			System.out.print("*");
//		System.out.println();
//	}
	public void print(){
		System.out.println(getScore(english)+"\t"
	        +getScore(math)+"\t"+getScore(chinese));
	}
	
	public static void test(){
		
	}
	
	private String getScore(int score){
		if (score < pass){
			return String.valueOf(score+"*");
		}else{
			return String.valueOf(score);
		}
	}
}
