package com.masai;

public class Factorial {
	int factorial=1;
	void fact(String[] args) {
		int[] num=new int[args.length];
		
		for(int i=0; i<num.length; i++) {
			num[i]=Integer.parseInt(args[i]);
		}
		
		if(num.length==1) {
			for(int i=1; i<=num[0]; i++) {
				factorial*=i;
			}
			System.out.println("the factorial is : "+factorial);
		}
		if(num.length==2) {
			for(int i=1; i<=(num[1]-num[0]); i++) {
				factorial*=i;
			}
			System.out.println("the factorial is : "+factorial);
		}
		if(num.length>2) {
			System.out.println("Error");
		}
	}
	public static void main(String[] args) {
		Factorial f1=new Factorial();	
		f1.fact(args);
//		if(args.length==2) {
//			System.out.println(args[0]);
//			System.out.println(args[1]);
//		}
	   }
}

