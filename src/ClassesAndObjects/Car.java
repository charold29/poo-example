package ClassesAndObjects;

public class Car {
    //ATTRIBUTES
    String color;
    String brand;
    int km;

    //METHODS
    //Constructors
    public Car(){}

    public Car(String color, String brand, int km) {
        this.color = color;
        this.brand = brand;
        this.km = km;
    }
    
    //Getters and Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    //toString
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", kms=" + km +
                '}';
    }
}
