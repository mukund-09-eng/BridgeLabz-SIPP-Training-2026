class Vehicle {

    private String vehicleNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void display() {
        System.out.println(vehicleNumber + "  " + ownerName + "  " + vehicleType);
    }

    public static void displayCars(Vehicle[] vehicles) {

        System.out.println("\nCars:");

        for (Vehicle v : vehicles) {
            if (v.getVehicleType().equalsIgnoreCase("Car")) {
                v.display();
            }
        }
    }

    public static void displayBikes(Vehicle[] vehicles) {

        System.out.println("\nBikes:");

        for (Vehicle v : vehicles) {
            if (v.getVehicleType().equalsIgnoreCase("Bike")) {
                v.display();
            }
        }
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[10];

        vehicles[0] = new Vehicle("UP80AA1010", "Mukund", "Car");
        vehicles[1] = new Vehicle("UP80BB2020", "Rahul", "Bike");
        vehicles[2] = new Vehicle("UP80CC3030", "Aman", "Car");
        vehicles[3] = new Vehicle("UP80DD4040", "Rohit", "Bike");
        vehicles[4] = new Vehicle("UP80EE5050", "Ankit", "Car");
        vehicles[5] = new Vehicle("UP80FF6060", "Priya", "Bike");
        vehicles[6] = new Vehicle("UP80GG7070", "Neha", "Car");
        vehicles[7] = new Vehicle("UP80HH8080", "Riya", "Bike");
        vehicles[8] = new Vehicle("UP80II9090", "Karan", "Car");
        vehicles[9] = new Vehicle("UP80JJ1111", "Mohit", "Bike");

        displayCars(vehicles);
        displayBikes(vehicles);
    }
}
