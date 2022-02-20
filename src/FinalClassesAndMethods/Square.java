package FinalClassesAndMethods;

public class Square extends ClosedFigure {
    private double area;

    public Square(double size, int nSides, double area) {
        super(size, nSides);
        this.area = area;
    }

    public void draw() {
        super.draw(); // "We draw a closed figure"
        System.out.println("This is a square");
    }
}
