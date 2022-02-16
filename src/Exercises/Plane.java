package Exercises;

public class Plane {
    private int x;
    private int y;

    public Plane(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moveUp(int n){
        y +=n;
    }

    public void moveDown(int n){
        y -=n;
    }

    public void moveLeft(int n){
        x -=n;
    }

    public void moveRight(int n){
        x +=n;
    }

    @Override
    public String toString() {
        return "Plane [" +
                "x=" + x +
                " | y=" + y +
                ']';
    }
}
