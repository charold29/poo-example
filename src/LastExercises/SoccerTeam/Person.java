package LastExercises.SoccerTeam;

public abstract class Person {
    protected final String name;
    protected final String lastname;
    protected final int age;

    public Person(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public void travel(){
        System.out.println(name + " " + lastname + " is traveling normally");
    }

    public abstract void soccerGame();

    public abstract void train();

    @Override
    public String toString() {
        return "Person {" +
                "Name= '" + name + '\'' +
                ", Lastname= '" + lastname + '\'' +
                ", Age= " + age +
                "}\n";
    }
}
