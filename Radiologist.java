public class Radiologist {
    private String radiologistName;
    private String radiologistSpecialty;

    public Radiologist(String radiologistName, String radiologistSpecialty) {
        this.radiologistName = radiologistName;
        this.radiologistSpecialty = radiologistSpecialty;
    }

    public String getRadiologistSpecialty() {
        return radiologistSpecialty;
    }

    public void displayRadiologistDetails() {
        System.out.println("Radiologist Name: " + radiologistName);
        System.out.println("Radiologist Specialty: " + radiologistSpecialty);
    }
}
