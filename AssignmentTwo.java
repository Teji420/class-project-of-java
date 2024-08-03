

import com.example.models.Employee;
import com.example.models.Ride;
import com.example.models.Visitor;

public class AssignmentTwo {
    public static void main(String[] args) {
        // Create Employees
        Employee operator1 = new Employee("SINGH", "DEOL", 2, "OPERATOR", 420);
        Employee operator2 = new Employee("RANDY ORTEN", "UNDERTAKER", 3, "OPERATOR", 520);

        // Create Rides
        Ride jungleSafari = new Ride("JUNGLE SAFARI", operator1, 5);
        Ride waterCraft = new Ride("WATER CRAFT", operator2, 4);

        // Create Visitors
        Visitor visitor1 = new Visitor("HARSH", "JATT", 1, 11, "21TH DECEMBER");
        Visitor visitor2 = new Visitor("SEEMA", "SAINI", 2, 22, "20 JANUARY");
        Visitor visitor3 = new Visitor("REMMA", "AJIMAL", 3, 23, "127 NOVEMBER");
        Visitor visitor4 = new Visitor("SINGH", "KAHOLN", 4, 44, "31 SEPTEMBER");
        Visitor visitor5 = new Visitor("SIMRAN", "DHILLION", 5, 1010, "9 AUGUST");

        // Add visitors to ride history
        jungleSafari.getRideHistory().add(visitor1);
        jungleSafari.getRideHistory().add(visitor2);
        jungleSafari.getRideHistory().add(visitor3);
        jungleSafari.getRideHistory().add(visitor4);
        jungleSafari.getRideHistory().add(visitor5);

        // Export ride history to CSV file
        jungleSafari.exportRideHistoryToCSV("PART6.csv");
    }
}
