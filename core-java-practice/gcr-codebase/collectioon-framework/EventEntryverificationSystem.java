import java.util.HashSet;

public class EventEntryVerificationSystem {

    static HashSet<String> participants = new HashSet<>();

    // Register Participant
    static void registerParticipant(String email) {

        if (participants.add(email)) {
            System.out.println(email + " registered successfully.");
        } else {
            System.out.println(email + " is already registered.");
        }
    }

    // Display Participants
    static void displayParticipants() {

        System.out.println("\n----- Registered Participants -----");

        for (String email : participants) {
            System.out.println(email);
        }

        System.out.println("\nTotal Attendees: " + participants.size());
    }

    public static void main(String[] args) {

        registerParticipant("mukund@gmail.com");
        registerParticipant("rahul@gmail.com");
        registerParticipant("aman@gmail.com");

        // Duplicate Registration
        registerParticipant("rahul@gmail.com");

        displayParticipants();
    }
}
