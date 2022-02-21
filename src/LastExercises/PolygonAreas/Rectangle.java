package LastExercises.PolygonAreas;

public class Rectangle extends Polygon{

    private final double side1;
    private final double side2;

    public Rectangle(double side1, double side2) {
        super(2);
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "numSides=" + numSides +
                ", side1=" + side1 +
                ", side2=" + side2 +
                "}\n";
    }
}
