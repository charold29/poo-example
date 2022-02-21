package LastExercises.PolygonAreas;

public abstract class Polygon {

    protected int numSides;

    public Polygon(int numSides) {
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return "Polygon{" +
                "numSides=" + numSides +
                "}\n";
    }
}
