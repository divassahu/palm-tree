package com.masai.assign_s1d4;

public class DemoEv {
	static void printMonth(String month) {
		switch(month) {
		case "january":
			System.out.println("This is the first month of the year : "+month);
			break;
			
		case "february":
			System.out.println("This is the second month of the year : "+month);
			break;
			
		case "march":
			System.out.println("This is the third month of the year : "+month);
			break;
			
		case "april":
			System.out.println("This is the fourth month of the year : "+month);
			break;
			
		case "may":
			System.out.println("This is the fifth month of the year : "+month);
			break;
			
		case "june":
			System.out.println("This is the sixth month of the year : "+month);
			break;
			
		case "july":
			System.out.println("This is the seventh month of the year : "+month);
			break;
			
		case "august":
			System.out.println("This is the eighth month of the year : "+month);
			break;
		
		case "september":
			System.out.println("This is the ninth month of the year : "+month);
			break;
			
		case "october":
			System.out.println("This is the tenth month of the year : "+month);
			break;
			
		case "november":
			System.out.println("This is the eleventh month of the year : "+month);
			break;
			
		case "december":
			System.out.println("This is the last month of the year : "+month);
			break;
			
		default:
			System.out.println("Not a Month");
		}
	}
	public static void main(String[]args) {
		printMonth("februar");
	}
}
