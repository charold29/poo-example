package Exercises;

public class IsoscelesTriangle {
    private final double base;
    private final double side;

    public IsoscelesTriangle(double base, double side) {
        this.base = base;
        this.side = side;
    }

    public double getPerimeter(){
        return base + (side * 2);
    }

    public double getArea(){
        return ( base * (Math.sqrt(Math.pow(side,2) - (Math.pow(base,2) / 4))) ) / 2;
    }

    @Override
    public String toString() {
        return "IsoscelesTriangle{" +
                "base=" + base +
                ", side=" + side +
                '}';
    }
}
