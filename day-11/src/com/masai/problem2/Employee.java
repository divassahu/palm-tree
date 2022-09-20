package com.masai.problem2;

public class Employee {
	
	double calculateAge(int[] age) {
		int n=age.length;
		double sum=0.0;
		
		for(int i=0;i<n;i++) {
			sum+=age[i];
		}
		double avg=sum/n;
		return avg;
	}
}
