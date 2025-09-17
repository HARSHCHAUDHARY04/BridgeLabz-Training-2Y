import java.util.ArrayList;

class Patient {
    String name;
    ArrayList<Doctor> doctors; 

    Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    void addDoctor(Doctor d) {
        doctors.add(d);
    }

    void showDoctors() {
        System.out.println("Patient: " + name + " has consulted with:");
        for (Doctor d : doctors) {
            System.out.println("  Dr. " + d.name);
        }
    }
}


class Doctor {
    String name;
    ArrayList<Patient> patients; 

    Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    void consult(Patient p) {
        patients.add(p);
        p.addDoctor(this);  
        System.out.println("Dr. " + name + " consulted Patient " + p.name);
    }

    void showPatients() {
        System.out.println("Dr. " + name + " has patients:");
        for (Patient p : patients) {
            System.out.println("  " + p.name);
        }
    }
}

class Hospital {
    String name;
    ArrayList<Doctor> doctors;
    ArrayList<Patient> patients;

    Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    void addDoctor(Doctor d) {
        doctors.add(d);
    }

    void addPatient(Patient p) {
        patients.add(p);
    }
}

public class HospitalExample {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Smith");
        Doctor d2 = new Doctor("Johnson");

        Patient p1 = new Patient("Alice");
        Patient p2 = new Patient("Bob");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        System.out.println();
  
        d1.showPatients();
        d2.showPatients();
        System.out.println();
        p1.showDoctors();
        p2.showDoctors();
    }
}
