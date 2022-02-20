package Overriding;

public class Dog extends Animal{

    @Override
    public void comer() {
        System.out.println("I'm eating in my bowl");
    }
}
