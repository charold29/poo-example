package Exercises;

public class IsoscelesTriangle {
    private final float base;
    private final float height;

    public IsoscelesTriangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    public float getPerimeter(){
        return base + (height * 2);
    }

    public float getArea(){
        return (base * height) / 2;
    }

    @Override
    public String toString() {
        return "IsoscelesTriangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}
