public class Employee extends Person {
    private String department;
    private int employeeId;

    // Default constructor
    public Employee() {
        super();
    }

    // Constructor with parameters
    public Employee(String firstName, String lastName, int id, String department, int employeeId) {
        super(firstName, lastName, id);
        this.department = department;
        this.employeeId = employeeId;
    }

    // Getters and setters
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}
