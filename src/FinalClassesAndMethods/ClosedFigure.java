package FinalClassesAndMethods;

public class ClosedFigure extends Figure {

    private int nSides;

    public ClosedFigure(double size, int nSides) {
        super(size);
        this.nSides = nSides;
    }

    public void draw(){
        System.out.println("We draw a closed figure.");
    }

}
