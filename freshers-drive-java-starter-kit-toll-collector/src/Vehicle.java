package tollCalculator;

public class Vehicle {
	
	 private String vehicleNumber;
	    private double fastagBalance;
	    private String vehicleType;
	    private int journeyCount;
	    private double tollPaid;

	    public Vehicle(String vehicleNumber, double fastagBalance, String vehicleType) {
	        this.vehicleNumber = vehicleNumber;
	        this.fastagBalance = fastagBalance;
	        this.vehicleType = vehicleType;
	        this.journeyCount = 0;
	        this.tollPaid = 0;
	    }

	    public void payToll(double tollCost) {
	        if (fastagBalance >= tollCost) {
	            // Deduct the toll cost from the FASTAG balance
	            fastagBalance -= tollCost;
	        } else {
	            // If there is no sufficient balance in the FASTAG, calculate the remaining cost to be paid by cash
	            double remainingCost = tollCost - fastagBalance;
	            fastagBalance = 0;
	        }
	        // Increase journey count
	        journeyCount++;
	        // Increase toll paid
	        tollPaid += tollCost;
	    }

	    public double getRemainingCost(double tollCost) {
	        return tollCost - fastagBalance;
	    }

	    public double getFastagBalance() {
	        return fastagBalance;
	    }

	    public String getVehicleNumber() {
	        return vehicleNumber;
	    }

	    public String getVehicleType() {
	        return vehicleType;
	    }

	    public int getJourneyCount() {
	        return journeyCount;
	    }

	    public double getTollPaid() {
	        return tollPaid;
	    }

	    public double getDiscount(double tollCost) {
	        if (journeyCount % 2 == 1) {
	            // Return journey, apply 50% discount
	            return tollCost / 2;
	        }
	        return 0;
	    }

}
