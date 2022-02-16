package Exercises;

public class Vehicle {
    private final String brand;
    private final String model;
    private final float price;

    public Vehicle(String brand, String model, float price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
