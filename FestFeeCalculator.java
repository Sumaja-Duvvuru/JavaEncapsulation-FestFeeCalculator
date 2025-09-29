import java.util.*;  // Import Scanner class for user input

// Participant class demonstrating encapsulation
class Participant{
    private int participantId;           // Unique ID for participant
    private String name;                 // Participant's name
    private double baseRegistrationFee; // Base registration fee
    private int numberOfEvents;          // Number of events registered
    private double eventChargePerEvent;  // Charge per event

    // ===== Setter Methods =====
    public void setParticipantId(int participantId){ this.participantId = participantId; }
    public void setName(String name){ this.name = name; }
    public void setBaseRegistrationFee(double baseRegistrationFee){ this.baseRegistrationFee = baseRegistrationFee; }
    public void setNumberOfEvents(int numberOfEvents){ this.numberOfEvents = numberOfEvents; }
    public void setEventChargePerEvent(double eventChargePerEvent){ this.eventChargePerEvent = eventChargePerEvent; }

    // ===== Getter Methods =====
    public int getParticipantId(){ return participantId; }
    public String getName(){ return name; }
    public double getBaseRegistrationFee(){ return baseRegistrationFee; }
    public int getNumberOfEvents(){ return numberOfEvents; }
    public double getEventChargePerEvent(){ return eventChargePerEvent; }

    // Calculate total fee based on base fee and event charges
    public double calculateTotalFee(){ 
        return baseRegistrationFee + (numberOfEvents * eventChargePerEvent); 
    }

    // Display participant details and total fee
    public void displayDetails(){
        System.out.println("Participant Record");
        System.out.println("ID: " + getParticipantId());
        System.out.println("Name: " + getName());
        System.out.println("Base Registration Fee: " + getBaseRegistrationFee());
        System.out.println("Event Charges: " + getNumberOfEvents() + " events @ " + getEventChargePerEvent());
        System.out.println("Total Fee: " + calculateTotalFee());
    }
}

// Main class to run the program
public class FestFeeCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input

        Participant p = new Participant();   // Create Participant object

        // Input participant ID
        System.out.println("Enter Participant ID: ");
        int Id = sc.nextInt();
        p.setParticipantId(Id);

        // Input participant name
        System.out.println("Enter Participant Name: ");
        String n = sc.next();
        p.setName(n);

        // Set fixed base registration fee
        p.setBaseRegistrationFee(100.0);

        // Input number of events participant will attend
        System.out.println("Enter Number of Events " + p.getName() + " is going to participate:");
        int event = sc.nextInt();
        p.setNumberOfEvents(event);

        // Set fixed charge per event
        p.setEventChargePerEvent(50.0);

        // Show total fee
        System.out.println("Total Fee: " + p.calculateTotalFee());

        // Display all participant details
        p.displayDetails();
    }
}

