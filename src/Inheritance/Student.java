package Inheritance;

public class Student extends Person {

    private final int codStudent;
    private final float finalScore;

    public Student(String name, String lastname, int codStudent, float finalScore) {
        super(name, lastname);
        this.codStudent = codStudent;
        this.finalScore = finalScore;
    }

    public Student(String name, String lastname, int age, int codStudent, float finalScore) {
        super(name, lastname,age);
        this.codStudent = codStudent;
        this.finalScore = finalScore;
    }

    public int getCodStudent() {
        return codStudent;
    }

    public float getFinalScore() {
        return finalScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "codStudent=" + codStudent +
                ", finalScore=" + finalScore +
                ", name=" + name +
                ", lastname=" + lastname + "} ";
    }

}
