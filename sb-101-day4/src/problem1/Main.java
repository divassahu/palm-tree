package problem1;

import java.util.Scanner;

public class Main {
	
	void string2Integer(String num) {
		int res=0;
		boolean numeric=true;
		
		try {
			 res=Integer.parseInt(num);
		}catch(NumberFormatException nfe) {
			numeric =false;
		}
		
		if(numeric) {
			System.out.println("the square of the number is: "+res*res);
		}
		else {
			throw new NumberFormatException("Entered input is not a valid format for an integer");
		}
	}
	public static void main(String[] args) {
		Main m=new Main();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Character");
		String str=sc.next();
		m.string2Integer(str);
	}
}
