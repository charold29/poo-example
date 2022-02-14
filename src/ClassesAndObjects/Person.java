package ClassesAndObjects;

public class Person {
    //ATTRIBUTES
    String name;
    int age;
    String dni;

    //OVERLOADING CONSTRUCTORS
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String dni) {
        this.dni = dni;
    }

    public void correr() {
        System.out.println("My name is " + name + ", I'm "+ age + " years old and I'm running.");
    }

    public void correr(int km) {
        System.out.println("I ran " + km + " kms.");
    }
}
