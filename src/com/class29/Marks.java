package com.class29;

public abstract class Marks {
 public abstract int getPercentage();
}

class A extends Marks{
	int grade1,grade2,grade3;
	A(int grade1,int grade2, int grade3){
		this.grade1=grade1;
		this.grade2=grade2;
		this.grade3=grade3;
		}
	public int getPercentage() {
		return (grade1+grade2+grade3)/3;
	}
}
class B extends Marks{
	int grade1,grade2,grade3,grade4;
	B(int grade1,int grade2, int grade3, int grade4){
		this.grade1=grade1;
		this.grade2=grade2;
		this.grade3=grade3;
		this.grade4=grade4;
		}
	public int getPercentage() {
		return (grade1+grade2+grade3+grade4)/4;
	}
}