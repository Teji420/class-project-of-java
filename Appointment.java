public class Appointment {

    private String patientName;
    private String mobilePhone;
    private String preferredTime;
    private Radiologist selectedRadiologist;

    public Appointment() {
    }

    public Appointment(String patientName, String mobilePhone, String preferredTime, Radiologist selectedRadiologist) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.preferredTime = preferredTime;
        this.selectedRadiologist = selectedRadiologist;
    }

    public void printDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Mobile Phone: " + mobilePhone);
        System.out.println("Preferred Time: " + preferredTime);
        System.out.print("Selected Radiologist: ");
        selectedRadiologist.displayRadiologistDetails();
    }
}
