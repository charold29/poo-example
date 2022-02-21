package LastExercises.SoccerTeam;

public class SoccerPlayer extends Person {
    private final int dorsal;
    private final String position;

    public SoccerPlayer(String name, String lastname, int age, int dorsal, String position) {
        super(name, lastname, age);
        this.dorsal = dorsal;
        this.position = position;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public void train(){
        System.out.println(name + " is training in the practice field.");
    }

    @Override
    public void soccerGame(){
        System.out.println(name + " is playing at stadium.");
    }

    public void interview(){
        System.out.println(name + " is having an interview.");
    }

    @Override
    public String toString() {
        return "SoccerPlayer {" +
                "Name= '" + name + '\'' +
                ", Lastname= '" + lastname + '\'' +
                ", Age= " + age +
                ", Dorsal= " + dorsal +
                ", Position= '" + position + '\'' +
                "}\n";
    }
}
