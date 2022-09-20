package com.masai.assign_s1d4;

public class Main {
	static int naturalSum(int n) {
		int sum;
		sum=(n*(n+1))/2;
		return sum;
	}
	
	public static void main(String[]args) {
		System.out.println(naturalSum(6));
	}
}
