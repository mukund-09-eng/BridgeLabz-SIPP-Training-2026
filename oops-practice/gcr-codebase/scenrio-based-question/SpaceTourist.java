class SpaceTourist {

    static int totalReservations = 0;
    static String missionName = "Mars Explorer";

    private String touristName;
    private int seatNumber;

    // Constructor
    public SpaceTourist(String touristName, int seatNumber) {
        this.touristName = touristName;
        this.seatNumber = seatNumber;
        totalReservations++;
    }

    // Method Chaining
    public SpaceTourist updateSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
        return this;
    }

    public void displayDetails() {
        System.out.println("--------------------------");
        System.out.println("Mission Name : " + missionName);
        System.out.println("Tourist Name : " + touristName);
        System.out.println("Seat Number  : " + seatNumber);
    }

    public static void main(String[] args) {

        SpaceTourist tourist = new SpaceTourist("Mukund", 5);

        tourist.updateSeatNumber(10)
               .updateSeatNumber(15);

        tourist.displayDetails();

        System.out.println("Total Reservations = " + totalReservations);
    }
}
