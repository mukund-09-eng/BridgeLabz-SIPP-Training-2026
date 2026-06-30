import java.util.ArrayList;

public class SmartParkingSlotManager {

    static ArrayList<String> parkingSlots = new ArrayList<>();

    // Add Vehicle
    static void addVehicle(String vehicleNo) {

        parkingSlots.add(vehicleNo);
        System.out.println(vehicleNo + " entered the parking area.");
    }

    // Remove Vehicle
    static void removeVehicle(String vehicleNo) {

        if (parkingSlots.remove(vehicleNo)) {
            System.out.println(vehicleNo + " exited the parking area.");
        } else {
            System.out.println(vehicleNo + " not found in parking.");
        }
    }

    // Search Vehicle
    static void searchVehicle(String vehicleNo) {

        if (parkingSlots.contains(vehicleNo)) {
            System.out.println(vehicleNo + " is currently parked.");
        } else {
            System.out.println(vehicleNo + " is not parked.");
        }
    }

    // Display All Vehicles
    static void displayVehicles() {

        System.out.println("\n----- Parked Vehicles -----");

        if (parkingSlots.isEmpty()) {
            System.out.println("No vehicles are currently parked.");
        } else {
            for (String vehicle : parkingSlots) {
                System.out.println(vehicle);
            }
        }

        System.out.println("\nTotal Occupied Parking Slots: " + parkingSlots.size());
    }

    public static void main(String[] args) {

        addVehicle("UP80AB1234");
        addVehicle("DL01XY5678");
        addVehicle("HR26CD9012");

        System.out.println();

        searchVehicle("DL01XY5678");
        searchVehicle("UP32ZZ1111");

        System.out.println();

        removeVehicle("DL01XY5678");

        System.out.println();

        displayVehicles();
    }
}
