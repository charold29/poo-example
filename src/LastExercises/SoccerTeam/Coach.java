package LastExercises.SoccerTeam;

public class Coach extends Person{

    private final String strategy;

    public Coach(String name, String lastname, int age, String strategy) {
        super(name, lastname, age);
        this.strategy = strategy;
    }

    public String getStrategy() {
        return strategy;
    }

    @Override
    public void train(){
        System.out.println(name + " is training in the bench.");
    }

    @Override
    public void soccerGame(){
        System.out.println(name + " is seeing at stadium in the bench.");
    }

    public void planTraining(){
        System.out.println(name + " is planning the training.");
    }

    @Override
    public String toString() {
        return "Coach {" +
                "Name=' " + name + '\'' +
                ", Lastname= '" + lastname + '\'' +
                ", Age= " + age +
                ", Strategy= '" + strategy + '\'' +
                "}\n";
    }
}
