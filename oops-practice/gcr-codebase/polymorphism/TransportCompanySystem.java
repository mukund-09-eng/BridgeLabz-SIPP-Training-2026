class Vehicle {

    String vehicleNo;

    Vehicle(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    double fuelCost(int km) {
        return 0;
    }
}

class Car extends Vehicle {

    Car(String vehicleNo) {
        super(vehicleNo);
    }

    @Override
    double fuelCost(int km) {
        return km * 8;
    }
}

class Bus extends Vehicle {

    Bus(String vehicleNo) {
        super(vehicleNo);
    }

    @Override
    double fuelCost(int km) {
        return km * 15;
    }
}

class Bike extends Vehicle {

    Bike(String vehicleNo) {
        super(vehicleNo);
    }

    @Override
    double fuelCost(int km) {
        return km * 3;
    }
}

class ElectricCar extends Vehicle {

    ElectricCar(String vehicleNo) {
        super(vehicleNo);
    }

    @Override
    double fuelCost(int km) {
        return km * 1.5;
    }
}

public class TransportCompanySystem {

    public static void main(String[] args) {

        Vehicle[] fleet = {
                new Car("C101"),
                new Bus("B201"),
                new Bike("BK301"),
                new ElectricCar("E401")
        };

        int km = 20;

        for (Vehicle v : fleet) {

            if (v instanceof Car) {
                Car c = (Car) v;
                System.out.println("Car Fuel Cost = " + c.fuelCost(km));
            }

            else if (v instanceof Bus) {
                Bus b = (Bus) v;
                System.out.println("Bus Fuel Cost = " + b.fuelCost(km));
            }

            else if (v instanceof Bike) {
                Bike b = (Bike) v;
                System.out.println("Bike Fuel Cost = " + b.fuelCost(km));
            }

            else if (v instanceof ElectricCar) {
                ElectricCar e = (ElectricCar) v;
                System.out.println("Electric Car Cost = " + e.fuelCost(km));
            }
        }
    }
}
