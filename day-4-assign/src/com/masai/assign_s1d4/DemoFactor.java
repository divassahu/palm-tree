package com.masai.assign_s1d4;

public class DemoFactor {
	static void factor(int n) {
		if(n>=2 && n<=100) {
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					System.out.println("factor of "+ n +"is :"+ i);
				}
			}
		}
		else {
			System.out.println("Not a valid Number");
		}
	}
	public static void main(String[]args){
		factor(12);
	}
}
