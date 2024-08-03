package com.example.models; // Adjust the package name

public class Employee extends Person {
    private String role;
    private double salary;

    // Default constructor
    public Employee() {
        super();
    }

    // Constructor with parameters
    public Employee(String firstName, String lastName, int id, String role, double salary) {
        super(firstName, lastName, id);
        this.role = role;
        this.salary = salary;
    }

    // Getters and setters
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
