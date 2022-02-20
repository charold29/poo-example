package Polymorphism;

public class TourismVehicle extends Vehicle {

    private final int numDoors;

    public TourismVehicle(String licensePlate, String brand, String model, int numDoors) {
        super(licensePlate, brand, model);
        this.numDoors = numDoors;
    }

    @Override
    public String toString() {
        return "TourismVehicle{" +
                "numDoors=" + numDoors +
                ", licensePlate='" + licensePlate + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
