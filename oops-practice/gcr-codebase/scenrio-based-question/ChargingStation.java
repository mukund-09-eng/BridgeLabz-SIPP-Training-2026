class ChargingStation {

    static int totalStations = 0;
    static double electricityRate = 8.5;

    private int stationId;
    private double unitsConsumed;

    public ChargingStation(int stationId, double unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    public double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    public void displayStationDetails() {
        System.out.println("-------------------------");
        System.out.println("Station ID : " + stationId);
        System.out.println("Units      : " + unitsConsumed);
        System.out.println("Bill       : " + calculateBill());
    }

    public static void main(String[] args) {

        ChargingStation s1 = new ChargingStation(101, 120);
        ChargingStation s2 = new ChargingStation(102, 80);
        ChargingStation s3 = new ChargingStation(103, 200);
        ChargingStation s4 = new ChargingStation(104, 150);
        ChargingStation s5 = new ChargingStation(105, 60);

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        System.out.println("Total Stations = " + totalStations);

        // Change electricity rate
        electricityRate = 10;

        System.out.println("\nAfter Electricity Rate Changed\n");

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();
    }
}
