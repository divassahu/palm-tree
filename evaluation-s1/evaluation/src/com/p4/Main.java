package com.p4;

public class Main {
	public static void runScored(int one, int two, int three, int four ,int six) {
		// write your logic here
			int score=0;
			score=one+two+three+four+six;
			System.out.println("Run scored by batter is : "+score);
			
		}
		public static void main(String[] args){
		//call runScored with valid parameters
			runScored(1, 2, 3, 4, 6, 0);
		}
}
