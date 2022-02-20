package Polymorphism;

public class PickupVehicle extends Vehicle{

    private final int charge;

    public PickupVehicle(String licensePlate, String brand, String model, int charge) {
        super(licensePlate, brand, model);
        this.charge = charge;
    }

    @Override
    public String toString() {
        return "PickupVehicle{" +
                "charge=" + charge +
                ", licensePlate='" + licensePlate + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

}
