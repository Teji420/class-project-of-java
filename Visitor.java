package com.example.models; // Adjust the package name

public class Visitor extends Person {
    private int ticketNumber;
    private String visitDate;

    // Default constructor
    public Visitor() {
        super();
    }

    // Constructor with parameters
    public Visitor(String firstName, String lastName, int id, int ticketNumber, String visitDate) {
        super(firstName, lastName, id);
        this.ticketNumber = ticketNumber;
        this.visitDate = visitDate;
    }

    // Getters and setters
    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }
}
