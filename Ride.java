package com.example.models; // Adjust the package name

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Ride {
    private Employee operator;
    private String rideName;
    private int maxRiders;
    private LinkedList<Visitor> rideHistory; // Using LinkedList to store ride history

    // Default constructor
    public Ride() {
        this.rideName = "";
        this.operator = null;
        this.maxRiders = 0;
        this.rideHistory = new LinkedList<>();
    }

    // Constructor with parameters
    public Ride(String rideName, Employee operator, int maxRiders) {
        this.rideName = rideName;
        this.operator = operator;
        this.maxRiders = maxRiders;
        this.rideHistory = new LinkedList<>();
    }

    // Getters and setters
    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    public int getMaxRiders() {
        return maxRiders;
    }

    public void setMaxRiders(int maxRiders) {
        this.maxRiders = maxRiders;
    }

    public LinkedList<Visitor> getRideHistory() {
        return rideHistory;
    }

    // Method to write visitor details to a CSV file
    public void exportRideHistoryToCSV(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Visitor visitor : rideHistory) {
                String line = String.format("%s,%s,%d,%d,%s",
                        visitor.getFirstName(),
                        visitor.getLastName(),
                        visitor.getId(),
                        visitor.getTicketNumber(),
                        visitor.getVisitDate());
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Ride history successfully exported to " + filename);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
