import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Geektrust {
    public static void main(String[] args)  {
        try {
            // the file to be opened for reading
            FileInputStream fis = new FileInputStream(args[0]);
            Scanner sc = new Scanner(fis); // file to be scanned
            // returns true if there is another line to read
            while (sc.hasNextLine()) {
               String inputCommand = sc.nextLine();
               //Add your code here to process input commands.
				
				inputs = input.split(" ");
				if (inputs[0].equals("FASTAG")) {
					String vehicleType = inputs[0].substring(6);
					String vehicleNumber = inputs[1];
					double fastagBalance = Double.parseDouble(inputs[2]);

					// Create a new vehicle

					Vehicle vehicle = new Vehicle(vehicleNumber, fastagBalance, vehicleType);
					vehicles.put(vehicleNumber, vehicle);
				} else if (inputs[0].equals("COLLECT_TOLL")) {
					String vehicleType = inputs[0].substring(11);
					String vehicleNumber = inputs[1];
					double tollCost = 100;
					Vehicle vehicle = vehicles.get(vehicleNumber);

					// Check if the vehicle type matches

					if (!vehicle.getVehicleType().equals(vehicleType)) {
						System.out.println("Invalid vehicle type for vehicle number " + vehicleNumber);
						continue;
					}
					double fastagBal = vehicle.getFastagBalance();
					if (fastagBal >= tollCost) {

						// Deduct the toll cost from the FASTAG balance

						vehicle.payToll(tollCost);
						totalToll += tollCost;
					} else {

						// If there is no sufficient balance in the FASTAG, calculate the remaining cost
						// to be paid by cash

						double remainingCost = vehicle.getRemainingCost(tollCost);
						double cashPaid = remainingCost + 40; // flat fee of 40
						totalCash += cashPaid;
						totalFlatFee += 40;
						totalToll += tollCost;
						vehicle.payToll(tollCost);
					}

					// Apply discount

					double discount = vehicle.getDiscount(tollCost);
					totalDiscount += discount;

					// Increase the total vehicle count

					totalVehicles++;

					// Increase the vehicle type count

					if (vehicleTypeCount.containsKey(vehicleType)) {
						int count = vehicleTypeCount.get(vehicleType);
						vehicleTypeCount.put(vehicleType, count + 1);
					} else {
						vehicleTypeCount.put(vehicleType, 1);
					}

					// Increase toll paid by vehicle type

					if (vehicleTypeToll.containsKey(vehicleType)) {
						double toll = vehicleTypeToll.get(vehicleType);
						vehicleTypeToll.put(vehicleType, toll + tollCost - discount);
					} else {
						vehicleTypeToll.put(vehicleType, tollCost - discount);
					}
				} else if (inputs[0].equals("PRINT_COLLECTION")) {
					System.out.println("Total Collection: " + totalToll);
					System.out.println("Total Discount: " + totalDiscount);
				} else if (inputs[0].equals("TOTAL_COLLECTION")) {
					System.out.println("Total Cash: " + totalCash);
					System.out.println("Total Flat Fee: " + totalFlatFee);
				} else if (inputs[0].equals("PAYMENT_SUMMARY")) {
					System.out.println("Vehicle Type Summary:");

					// sort vehicleTypeToll by value in descending order

					vehicleTypeToll = vehicleTypeToll.entrySet().stream()
							.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
							.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
									(oldValue, newValue) -> oldValue, LinkedHashMap::new));

					for (Entry<String, Double> entry : vehicleTypeToll.entrySet()) {
						System.out.println(entry.getKey() + ": " + entry.getValue());
					}
				} else if (inputs[0].equals("VEHICLE_TYPE_SUMMARY")) {
					System.out.println("Total number of vehicles: " + totalVehicles);

					// sort vehicleTypeCount by value in descending order

					vehicleTypeCount = vehicleTypeCount.entrySet().stream()
							.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
							.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
									(oldValue, newValue) -> oldValue, LinkedHashMap::new));

					for (Entry<String, Integer> entry : vehicleTypeCount.entrySet()) {
						System.out.println(entry.getKey() + ": " + entry.getValue());
					}
				} else if (inputs[0].equals("EXIT")) {
					break;
				}
			}




               String output = ""; //process the input command and get the output
               //Once it is processed print the output using the command System.out.println()
               System.out.println(output);
            }
            sc.close(); // closes the scanner
        } catch (IOException e) {
        }
	}
}
