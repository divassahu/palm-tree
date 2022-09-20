package com.masai;

import java.util.Scanner;

public class EvenSum {
	
	public static void main(String[] args) {
		int sum;
		System.out.println("enter 2d arr size");
		
		try (Scanner sc = new Scanner(System.in)) {
			int row = sc.nextInt();
			int collumn = sc .nextInt();
			
			System.out.println("Enter array element :");
			
			int[][] twoD = new int[row][collumn];
			
			for(int i=0; i<row; i++) {
				for(int j=0; j<collumn; j++) {
					twoD[i][j]= sc.nextInt();
				}
			}
			
			for(int i=0; i<row; i++) {
				sum=0;
				for(int j=0; j<collumn; j++) {
					if((twoD[j][i])%2==0) {
						sum+=twoD[j][i];
					}
				}
				System.out.println("the sum of "+(i+1)+" 3collumn is : "+sum);
			}
		}
	}
}
