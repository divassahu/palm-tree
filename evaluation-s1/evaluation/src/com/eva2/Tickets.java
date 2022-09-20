package com.eva2;

import java.util.Scanner;

public class Tickets {
	int ticketid;
	int price;
	static int availableTickets;
	
	public int calculateTicketCost(int noOfTickets) {
		if(availableTickets >=1) {
			int totalAmount = noOfTickets* price;
			return totalAmount;
		}
		else
		{
			return -1;
		}
	}
}

class Main3{
	public static void main(String[] args) {
		Tickets tc = new Tickets();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of booking");
		int numBook = sc.nextInt();
		System.out.println("\n");
		
		for(int i=0;i<numBook;i++) {
			System.out.println("enter the available tickets");
			tc.availableTickets=sc.nextInt();
			
			System.out.println("enter the ticket id");
			tc.ticketid=sc.nextInt();
			
			System.out.println("enter the ticket price");
			tc.price=sc.nextInt();
			
			System.out.println("enter the no of tickets");
			int n=sc.nextInt();
			
			System.out.println("enter no of booking : "+ numBook);
			System.out.println("enter the available tickets : "+ Tickets.availableTickets);
			System.out.println("enter the ticket id : "+ tc.ticketid);
			System.out.println("enter the ticket price : "+ tc.price );
			System.out.println("enter the no. of ticket : "+n);
			
			System.out.println("Available tickets after bookings are : "+ Tickets.availableTickets);
			
			
		}
	}
}