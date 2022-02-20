package Polymorphism;

public class SportVehicle extends Vehicle{

    private final int displacement;

    public SportVehicle(String licensePlate, String brand, String model, int displacement) {
        super(licensePlate, brand, model);
        this.displacement = displacement;
    }

    @Override
    public String toString() {
        return "SportVehicle{" +
                "displacement=" + displacement +
                ", licensePlate='" + licensePlate + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

}
