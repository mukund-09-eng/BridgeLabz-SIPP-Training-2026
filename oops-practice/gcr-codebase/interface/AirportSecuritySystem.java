interface LuggageScanner {

    void scanLuggage(String passengerName);

    default void displaySecurityGuidelines() {
        System.out.println("Do not carry prohibited items.");
    }
}

interface PassportVerifier {

    void verifyPassport(String passportNo);

    default void displaySecurityGuidelines() {
        System.out.println("Carry valid travel documents.");
    }

    static boolean isPassportNumberValid(String passportNo) {
        return passportNo.length() == 8;
    }
}

class AirportSecuritySystem
        implements LuggageScanner, PassportVerifier {

    @Override
    public void scanLuggage(String passengerName) {
        System.out.println(passengerName + "'s luggage scanned.");
    }

    @Override
    public void verifyPassport(String passportNo) {
        if (PassportVerifier.isPassportNumberValid(passportNo)) {
            System.out.println("Passport Verified");
        } else {
            System.out.println("Invalid Passport");
        }
    }

    @Override
    public void displaySecurityGuidelines() {
        LuggageScanner.super.displaySecurityGuidelines();
        PassportVerifier.super.displaySecurityGuidelines();
    }

    public void canBoard(String passengerName,
                         String passportNo) {

        scanLuggage(passengerName);

        if (PassportVerifier.isPassportNumberValid(passportNo)) {
            System.out.println(passengerName
                    + " can board the flight.");
        } else {
            System.out.println(passengerName
                    + " cannot board the flight.");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        String[] passengers = {
                "Mukund",
                "Rahul",
                "Aman"
        };

        String[] passports = {
                "AB123456",
                "P123",
                "XY987654"
        };

        AirportSecuritySystem system =
                new AirportSecuritySystem();

        system.displaySecurityGuidelines();

        System.out.println();

        for (int i = 0; i < passengers.length; i++) {
            system.canBoard(passengers[i], passports[i]);
        }
    }
}
