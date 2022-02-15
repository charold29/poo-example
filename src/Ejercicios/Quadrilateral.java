package Ejercicios;

public class Quadrilateral {
    private final float side1;
    private final float side2;

    public Quadrilateral(float side1, float side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public Quadrilateral(float side1) {
        this.side1 = this.side2 = side1;
    }

    public float getPerimeter(){
        return (side1+side2)*2;
    }

    public float getArea(){
        return side1*side2;
    }

    @Override
    public String toString() {
        return "Quadrilateral{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                '}';
    }
}
