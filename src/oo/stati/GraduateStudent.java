package oo.stati;

public class GraduateStudent extends Student {
	int thesis;
	public GraduateStudent(int english, int math, int chinese){
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}
	
	@Override
	public void print(){
		System.out.println(getScore(english)+"\t"
	        +getScore(math)+"\t"+getScore(chinese)+"\t"+
			thesis);//因為論文計算方式不同,故不用getScore計算
	}
}
