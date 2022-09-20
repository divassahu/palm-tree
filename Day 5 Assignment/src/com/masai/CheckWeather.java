package com.masai;

public class CheckWeather {
	public static void main(String[] args) {

		//Assume these can have any value:
		boolean isSnowing=true;
		boolean isRaining=false;
		double temprature=20;
		//print "Let’s stay home." if its raining, snowing or
		//below 50 degrees and print "Let’s go out!" otherwise.
		if(isSnowing == true || isRaining == true || temprature<10) {
			System.out.println("let's stay home!");
		}else
			System.out.println("let's go outside");

	}

}
