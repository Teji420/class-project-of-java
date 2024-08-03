package com.example.interfaces; // Adjust the package name

import com.example.models.Visitor;

public interface RideInterface {

    // Method to add a visitor to the ride's queue
    void addVisitorToQueue(Visitor visitor);

    // Method to remove a visitor from the ride's queue
    void removeVisitorFromQueue(Visitor visitor);

    // Method to print the current queue of visitors
    void printQueue();

    // Method to print the history of visitors who have ridden the ride
    void printRideHistory();
}
