package Exercises;

public class ComplexNumber {
    private final int part1;
    private final int part2;

    public ComplexNumber(int part1, int part2) {
        this.part1 = part1;
        this.part2 = part2;
    }

    public int getPart1() {
        return part1;
    }

    public int getPart2() {
        return part2;
    }

    @Override
    public String toString() {
        if(part2 < 0){
            return "ComplexNumber{ " +
                    part1 + " - " + Math.abs(part2) + "i }";
        }
        else{
            return "ComplexNumber{ " +
                    part1 + " + " + part2 + "i }";
        }

    }
}
