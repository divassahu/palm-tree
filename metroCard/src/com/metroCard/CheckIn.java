package com.metroCard;

public class CheckIn {
	
	private MetroCard metroCard;
    private String passengerType;
    private String location;
    private int fare;

    public CheckIn(MetroCard metroCard, String passengerType, String location) {
        this.metroCard = metroCard;
        this.passengerType = passengerType;
        this.location = location;
        calculateFare();
    }

    private void calculateFare() {
        switch (passengerType) {
            case "ADULT":
                fare = 100;
                break;
            case "KID":
                fare = 50;
                break;
            case "SENIOR_CITIZEN":
                fare = 50;
                break;
        }
    }

    public MetroCard getMetroCard() {
        return metroCard;
    }

    public String getPassengerType() {
        return passengerType;
    }

    public String getLocation() {
        return location;
    }

    public int getFare() {
        return fare;
    }

}
