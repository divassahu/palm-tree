package com.masai.s2d1_p1;

public class Number {
	void detectNum(int num) {
		if(num%2==1 && num>0) {
			System.out.println("Number is odd : "+num);
		}
		if(num%2==0 && num>0) {
			double ans;
			ans=(Math.ceil(num/10))*10;
			System.out.println("Numberis even and next multiple of number is : "+ans);
		}
		if(num<0) {
			System.out.println("Error");
		}
	}
	public static void main(String []args) {
		Number n1= new Number();
		n1.detectNum(23);
		n1.detectNum(46);
		n1.detectNum(-30);
	}
}
