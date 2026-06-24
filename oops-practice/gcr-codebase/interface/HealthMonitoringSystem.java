interface HeartRateMonitor {

    void checkHeartRate(String patientName);

    default void displayHealthTips() {
        System.out.println("Exercise regularly.");
    }
}

interface TemperatureMonitor {

    void checkTemperature(String patientName);

    default void displayHealthTips() {
        System.out.println("Drink plenty of water.");
    }

    static boolean isPatientIdValid(String patientId) {
        return patientId.length() == 6;
    }
}

class HealthMonitoringSystem
        implements HeartRateMonitor,
                   TemperatureMonitor {

    @Override
    public void checkHeartRate(String patientName) {
        System.out.println("Heart Rate: 72 BPM");
    }

    @Override
    public void checkTemperature(String patientName) {
        System.out.println("Temperature: 98.6°F");
    }

    @Override
    public void displayHealthTips() {
        HeartRateMonitor.super.displayHealthTips();
        TemperatureMonitor.super.displayHealthTips();
    }

    public void generateReport(String patientName,
                               String patientId) {

        System.out.println("Patient: " + patientName);

        if (TemperatureMonitor
                .isPatientIdValid(patientId)) {

            System.out.println("Patient ID Valid");
            checkHeartRate(patientName);
            checkTemperature(patientName);
            System.out.println("Health Status: Normal");
        } else {
            System.out.println("Invalid Patient ID");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        String[] patients = {
                "Mukund",
                "Rahul",
                "Aman"
        };

        String[] patientIds = {
                "P12345",
                "AB12",
                "X67890"
        };

        HealthMonitoringSystem system =
                new HealthMonitoringSystem();

        system.displayHealthTips();

        System.out.println();

        for (int i = 0; i < patients.length; i++) {
            system.generateReport(
                    patients[i],
                    patientIds[i]
            );
        }
    }
}
