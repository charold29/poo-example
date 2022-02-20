package Exercises.Delivery;

public class Package {
    private final int idPackage;
    private final String dni;
    private final double weight;
    private final int priority;

    public Package(int idPackage, String dni, double weight, int priority) {
        this.idPackage = idPackage;
        this.dni = dni;
        this.weight = weight;
        this.priority = priority; // 0 - normal , 1 - high, 2 - express
    }

    public int getIdPackage() {
        return idPackage;
    }

    public String getDni() {
        return dni;
    }

    public double getWeight() {
        return weight;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Package{" +
                "idPackage=" + idPackage +
                ", dni='" + dni + '\'' +
                ", weight=" + weight +
                ", priority=" + priority +
                "}\n";
    }
}
