package com.metroCard;

import java.util.HashMap;
import java.util.Map;

public class MetroSystem {
    private Map<Integer, MetroCard> metroCards;
    private Map<String, Map<String, Integer>> totalCollection;
    private Map<String, Map<String, Integer>> passengerTypeSummary;

    public MetroSystem() {
        metroCards = new HashMap<>();
        totalCollection= new HashMap<>();
        totalCollection.put("CENTRAL", new HashMap<>());
        totalCollection.put("AIRPORT", new HashMap<>());
        totalCollection.get("CENTRAL").put("TOTAL_COLLECTION", 0);
        totalCollection.get("CENTRAL").put("PASSENGER_TYPE_SUMMARY", 0);
        totalCollection.get("AIRPORT").put("TOTAL_COLLECTION", 0);
        totalCollection.get("AIRPORT").put("PASSENGER_TYPE_SUMMARY", 0);
        passengerTypeSummary = new HashMap<>();
        passengerTypeSummary.put("ADULT", new HashMap<>());
        passengerTypeSummary.put("KID", new HashMap<>());
        passengerTypeSummary.put("SENIOR_CITIZEN", new HashMap<>());
        passengerTypeSummary.get("ADULT").put("COUNT", 0);
        passengerTypeSummary.get("KID").put("COUNT", 0);
        passengerTypeSummary.get("SENIOR_CITIZEN").put("COUNT", 0);
        }

public void balanceMetroCard(int id, int balance) {
    metroCards.put(id, new MetroCard(id, balance));
}

public void checkIn(int id, String passengerType, String location) {
    MetroCard metroCard = metroCards.get(id);
    if (metroCard.getBalance() >= 100) {
        CheckIn checkIn = new CheckIn(metroCard, passengerType, location);
        int fare = checkIn.getFare();
        metroCard.setBalance(metroCard.getBalance() - fare);
        totalCollection.get(location).put("TOTAL_COLLECTION", totalCollection.get(location).get("TOTAL_COLLECTION") + fare);
        passengerTypeSummary.get(passengerType).put("COUNT", passengerTypeSummary.get(passengerType).get("COUNT") + 1);
    }
}

public void printSummary() {
    System.out.println("TOTAL_COLLECTION CENTRAL " + totalCollection.get("CENTRAL").get("TOTAL_COLLECTION") + " " + passengerTypeSummary.get("SENIOR_CITIZEN").get("COUNT"));
    System.out.println("PASSENGER_TYPE_SUMMARY");
    System.out.println("ADULT " + passengerTypeSummary.get("ADULT").get("COUNT"));
    System.out.println("SENIOR_CITIZEN " + passengerTypeSummary.get("SENIOR_CITIZEN").get("COUNT"));
    System.out.println("TOTAL_COLLECTION AIRPORT " + totalCollection.get("AIRPORT").get("TOTAL_COLLECTION") + " " + passengerTypeSummary.get("KID").get("COUNT"));
    System.out.println("PASSENGER_TYPE_SUMMARY");
    System.out.println("ADULT " + passengerTypeSummary.get("ADULT").get("COUNT"));
    System.out.println("KID " + passengerTypeSummary.get("KID").get("COUNT"));
}
}