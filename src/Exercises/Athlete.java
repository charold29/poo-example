package Exercises;

public class Athlete {
    private final int id;
    private final String name;
    private final float raceTime;

    public Athlete(int id, String name, float raceTime) {
        this.id = id;
        this.name = name;
        this.raceTime = raceTime;
    }

    public float getRaceTime() {
        return raceTime;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", raceTime=" + raceTime +
                '}';
    }
}
