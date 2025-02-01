class Vehicle {
    String model;
    int year;

    Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    Vehicle getSpecifications() {
        System.out.println("Vehicle Model: " + model + ", Year: " + year);

        return this;
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    Car(String model, int year, int numberOfDoors) {
        super(model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    Car getSpecifications() {   // CVRT
        System.out.println("Car Model: " + model + ", Year: " + year + ", Doors: " + numberOfDoors);

        return this;
    }
}

class Truck extends Vehicle {
    double payloadCapacity;

    Truck(String model, int year, double payloadCapacity) {
        super(model, year);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    Truck getSpecifications() {
        System.out.println("Truck Model: " + model + ", Year: " + year + ", Payload Capacity: " + payloadCapacity + " tons");

        return this;
    }
}

@SuppressWarnings("unused")
public class CVRT {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Toyota Camry", 2020, 4);
        // myCar.getSpecifications();

        Vehicle myTruck = new Truck("Ford F-150", 2021, 1.5);
        // myTruck.getSpecifications();

        Car c = (Car) myCar.getSpecifications();
        Truck t = (Truck) myTruck.getSpecifications();
    }
}
