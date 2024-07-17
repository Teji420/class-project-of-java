public class Main {
    public static void main(String[] args) {
        Radiologist radiologist = new Radiologist("Dr. Johnson", "Radiologist");
        Appointment appointment = new Appointment("Jane Doe", "0987654321", "14:30", radiologist);
        appointment.printDetails();
    }
}
