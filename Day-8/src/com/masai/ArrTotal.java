package com.masai;

public class ArrTotal {
	void arrSum(int[] num) {
		
		if(num!=null) {
			int total=0;
			for(int n:num) {
				total+=n;
			}
			System.out.println("the total is : "+ total);
		}
		else {
			System.out.println("null not allowed");
		}
	}
	public static void main(String[] args) {
		ArrTotal arrT= new ArrTotal();
		int[] marks= {50,100,200,150};
		arrT.arrSum((marks));
	}
}
