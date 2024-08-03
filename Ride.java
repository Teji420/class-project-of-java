import java.util.LinkedList;
import java.util.Queue;

public class Ride implements RideInterface {
    private String rideName;
    private Employee operator;
    private Queue<Visitor> queue;
    private LinkedList<Visitor> rideHistory;
    private int maxRiders;

    public Ride() {
        this.rideName = "";
        this.operator = null;
        this.queue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.maxRiders = 1;
    }

    public Ride(String rideName, Employee operator, int maxRiders) {
        this.rideName = rideName;
        this.operator = operator;
        this.queue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.maxRiders = maxRiders;
    }

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

    public Queue<Visitor> getQueue() {
        return queue;
    }

    public LinkedList<Visitor> getRideHistory() {
        return rideHistory;
    }

    public int getMaxRiders() {
        return maxRiders;
    }

    public void setMaxRiders(int maxRiders) {
        this.maxRiders = maxRiders;
    }

    @Override
    public void addVisitorToQueue(Visitor visitor) {
        queue.add(visitor);
        System.out.println("Visitor " + visitor.getFirstName() + " added to the queue.");
    }

    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        if (queue.remove(visitor)) {
            System.out.println("Visitor " + visitor.getFirstName() + " removed from the queue.");
        } else {
            System.out.println("Visitor " + visitor.getFirstName() + " not found in the queue.");
        }
    }

    @Override
    public void printQueue() {
        System.out.println("Queue:");
        for (Visitor v : queue) {
            System.out.println("Name: " + v.getFirstName() + " " + v.getLastName() + ", ID: " + v.getId());
        }
    }

    @Override
    public void printRideHistory() {
        System.out.println("Ride History:");
        for (Visitor v : rideHistory) {
            System.out.println("Name: " + v.getFirstName() + " " + v.getLastName() + ", ID: " + v.getId());
        }
    }

    public void runOneCycle() {
        if (operator == null) {
            System.out.println("No operator assigned to the ride. Cannot run.");
            return;
        }

        if (queue.isEmpty()) {
            System.out.println("No visitors in the queue. Cannot run.");
            return;
        }

        int visitorsToMove = Math.min(maxRiders, queue.size());

        for (int i = 0; i < visitorsToMove; i++) {
            Visitor visitor = queue.poll();
            if (visitor != null) {
                rideHistory.add(visitor);
            }
        }

        System.out.println("Ride cycle completed.");
    }
}
