class Drone {

    private int droneId;
    private int batteryPercentage;

    static String companyName = "Sky Logistics";

    public Drone(int droneId, int batteryPercentage) {
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    public void startDelivery() {
        if (batteryPercentage >= 30) {
            System.out.println("Drone " + droneId + " started delivery.");
            batteryPercentage -= 20;
        } else {
            System.out.println("Battery too low for delivery.");
        }
    }

    public void displayStatus() {
        System.out.println("-------------------");
        System.out.println("Company : " + companyName);
        System.out.println("Drone ID : " + droneId);
class Drone {

    private int droneId;
    private int batteryPercentage;

    static String companyName = "Sky Logistics";

    public Drone(int droneId, int batteryPercentage) {
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    public void startDelivery() {
        if (batteryPercentage >= 30) {
            System.out.println("Drone " + droneId + " started delivery.");
            batteryPercentage -= 20;
        } else {
            System.out.println("Battery too low for delivery.");
        }
    }

    public void displayStatus() {
        System.out.println("-------------------");
        System.out.println("Company : " + companyName);
        System.out.println("Drone ID : " + droneId);
        System.out.println("Battery : " + batteryPercentage + "%");
    }

    public static void main(String[] args) {

        Drone d1 = new Drone(1, 90);
        Drone d2 = new Drone(2, 70);
        Drone d3 = new Drone(3, 40);
