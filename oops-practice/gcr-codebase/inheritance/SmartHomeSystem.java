class Device {
    int deviceId;
    String status;

    Device(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}

class Thermostat extends Device {
    double temperatureSetting;

    Thermostat(int deviceId, String status,
               double temperatureSetting) {

        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
        System.out.println("Temperature Setting: "
                           + temperatureSetting + "°C");
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {

        Thermostat thermostat =
                new Thermostat(101, "ON", 24.5);

        thermostat.displayStatus();
    }
}
