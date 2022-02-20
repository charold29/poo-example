package Overriding;

public class Cow extends Animal{
    @Override
    public void comer() {
        System.out.println("I'm eating plants");
    }
}
