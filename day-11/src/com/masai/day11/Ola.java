package com.masai.day11;

public class Ola {
	public Car bookCar(int noOfPassenger, int noOfKms) {
		if(noOfPassenger<=3) {
			HatchBack h1= new HatchBack();
			h1.setNoOfKms(noOfKms);
			h1.setNoOfpassenger(noOfPassenger);
			return h1;
		}
		else {
			Sedan s1= new Sedan();
			s1.setNoOfKms(noOfKms);
			s1.setNoOfpassenger(noOfPassenger);
			return s1;
		}
	}
	
	public int calculateBill(Car car) {
		if(car instanceof HatchBack) {
			HatchBack h=(HatchBack) car;
			return h.farePerKm*h.getNoOfKms();
		}
		else {
			Sedan s =(Sedan) car;
			return s.getNoOfKms()*s.farePerKm;
		}
	}
}
