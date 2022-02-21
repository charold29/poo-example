package LastExercises.SoccerTeam;

public class Doctor extends Person {
    private final String title;
    private final int experienceYears;

    public Doctor(String name, String lastname, int age, String title, int experienceYears) {
        super(name, lastname, age);
        this.title = title;
        this.experienceYears = experienceYears;
    }

    public String getTitulation() {
        return title;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    @Override
    public void train(){
        System.out.println(name + " is training in the bench.");
    }

    @Override
    public void soccerGame(){
        System.out.println(name + " is seeing from the post.");
    }

    public void cureInjury(){
        System.out.println(name + " is curing an injury.");
    }

    @Override
    public String toString() {
        return "Doctor {" +
                "Name= '" + name + '\'' +
                ", Lastname= '" + lastname + '\'' +
                ", Age= " + age +
                ", Title= '" + title + '\'' +
                ", Experience Years= " + experienceYears +
                '}';
    }
}
