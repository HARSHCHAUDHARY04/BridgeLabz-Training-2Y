public class Patient {
    private static String hospitalName = "City General Hospital";
    private static int totalPatients = 0;
    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    public void displayDetails(Object obj) {
        if (obj instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("Invalid object type");
        }
    }

    public static void main(String[] args) {
        Patient patient = new Patient(1001, "Alice", 30, "Fever");
        patient.displayDetails(patient);
        System.out.println("Total Patients Admitted: " + getTotalPatients());
    }
}
