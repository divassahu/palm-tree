package com.masai;

import java.util.Scanner;

public class Main {
	public static String reverseString(String str) {
		char[] ch = new char[str.length()];
		String ans= new String();
		
		for(int i=str.length()-1; i>=0; i--) {
			ch[i] = str.charAt(i);
			ans+=ch[i];
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string to reverse");
		String originalString= sc.next();
		
		String result = reverseString(originalString);
		
		System.err.println("Original string is =>"+originalString);
		
		System.out.println("reverse String is =>"+ result);
	}
}
