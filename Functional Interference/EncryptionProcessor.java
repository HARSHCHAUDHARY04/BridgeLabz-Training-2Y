// 1. Create the custom marker interface
interface Encryptable {
    // This interface is empty
}

// 2. Implement the interface
class PatientRecord implements Encryptable {
    String patientName;
    String diagnosis;
    
    public PatientRecord(String name, String diag) {
        this.patientName = name;
        this.diagnosis = diag;
    }
}

class Appointment {
    String date;
}

// 3. Process objects based on the marker
public class EncryptionProcessor {
    public static void save(Object obj) {
        if (obj instanceof Encryptable) {
            System.out.println("This object is marked as Encryptable. Applying encryption before saving...");
        } else {
            System.out.println("This object is not sensitive. Saving normally.");
        }
    }
    
    public static void main(String[] args) {
        PatientRecord p = new PatientRecord("John Doe", "Flu");
        Appointment a = new Appointment("2025-10-28");
        
        save(p);
        save(a);
    }
}