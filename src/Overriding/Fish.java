package Overriding;

public class Fish extends Animal{
    @Override
    public void comer() {
        System.out.println("I'm eating in the ocean");
    }
}
