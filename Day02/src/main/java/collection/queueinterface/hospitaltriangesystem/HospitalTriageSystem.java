package collection.queueinterface.hospitaltriangesystem;

import java.util.PriorityQueue;
import java.util.Queue;

// HospitalTriageSystem class definition
public class HospitalTriageSystem {
    public static void main(String[] args) {
        // Declaring the priority queue for operating on priority basis
        Queue<Patient> treatingPatients = new PriorityQueue<>();

        // Patient declaration
        Patient alice = new Patient("Alice", 5);
        Patient bob = new Patient("Bob", 3);
        Patient sam = new Patient("Sam", 1);

        // Adding patients to the priority queue
        treatingPatients.add(alice);
        treatingPatients.add(bob);
        treatingPatients.add(sam);

        // Printing the order of treating the patient on the basis of severity.
        System.out.println("Order of getting the treatment is: ");
        for(Patient patient : treatingPatients) {
            System.out.print(patient.name + ", ");
        }
    }
}

// Class Patient definition implementing the comparable interface, to compare on the basis of severity
class Patient implements Comparable<Patient> {
    // Attributes
    public String name;
    private final int severity;

    // Parameterized constructor
    Patient(String name, int severity) {
        this.severity = severity;
        this.name = name;
    }

    // CompareTo method to give our own definition by overriding
    @Override
    public int compareTo(Patient patient) {
        return patient.severity - this.severity;
    }
}
