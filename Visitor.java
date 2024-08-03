public class Visitor extends Person {
    private int ticketNumber;

    public Visitor() {
        super();
    }

    public Visitor(String firstName, String lastName, int id, int ticketNumber) {
        super(firstName, lastName, id);
        this.ticketNumber = ticketNumber;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
}
