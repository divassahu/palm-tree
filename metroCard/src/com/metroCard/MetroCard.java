package com.metroCard;

	class MetroCard {
	    private int id;
	    private int balance;

	    public MetroCard(int id, int balance) {
	        this.id = id;
	        this.balance = balance;
	    }

	    public int getId() {
	        return id;
	    }

	    public int getBalance() {
	        return balance;
	    }

	    public void setBalance(int balance) {
	        this.balance = balance;
	    }
	}
