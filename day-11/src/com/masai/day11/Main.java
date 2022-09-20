package com.masai.day11;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Ola o1=new Ola();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter no of km");
		
		int nOkms=sc.nextInt();
		
		System.out.println("enter no of passengers");
		int nofpas=sc.nextInt();
		
		Car c1=o1.bookCar(nofpas, nOkms);
		int bill=o1.calculateBill(c1);
		
		System.out.println("total bill is : "+bill);
	}
}
