abstract class Patient {
    protected String patientId;
    protected String name;
    protected int age;

    public abstract double calculateBill();

    public void displayDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age + ", Bill: " + calculateBill());
    }

    public String getPatientId() { return patientId; }
    public void setPatientId(String patientId) { this.patientId = patientId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}

class InPatient extends Patient {
    private double roomCharge;
    private int stayDays;

    public InPatient(String patientId, String name, int age, double roomCharge, int stayDays) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.roomCharge = roomCharge;
        this.stayDays = stayDays;
    }

    public double calculateBill() {
        return roomCharge * stayDays;
    }

    public double getRoomCharge() { return roomCharge; }
    public void setRoomCharge(double roomCharge) { this.roomCharge = roomCharge; }
    public int getStayDays() { return stayDays; }
    public void setStayDays(int stayDays) { this.stayDays = stayDays; }
}

class OutPatient extends Patient {
    private double consultationFee;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.consultationFee = consultationFee;
    }

    public double calculateBill() {
        return consultationFee;
    }

    public double getConsultationFee() { return consultationFee; }
    public void setConsultationFee(double consultationFee) { this.consultationFee = consultationFee; }
}

interface MedicalRecord {
    void addRecord(String record);
    String viewRecords();
}

class PatientMedicalRecord implements MedicalRecord {
    private StringBuilder records;

    public PatientMedicalRecord() {
        this.records = new StringBuilder();
    }

    public void addRecord(String record) {
        records.append(record).append("\n");
    }

    public String viewRecords() {
        return records.toString();
    }
}

class HospitalManager {
    public static void processPatients(Patient[] patients) {
        for (Patient p : patients) {
            p.displayDetails();
        }
    }
}
