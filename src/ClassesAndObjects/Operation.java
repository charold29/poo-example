package ClassesAndObjects;

public class Operation {
    //ATTRIBUTES
        int number1;
        int number2;
        int sum;
        int subtraction;
        int multiplication;
        int division;

    //METHODS
    public Operation() {
    }

    public Operation(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void sum() {
        sum = number1+number2;
    }

    public int sum(int number1, int number2) {
       return number1 + number2;
    }

    public void subtraction() {
        subtraction = number1-number2;
    }

    public int subtraction(int number1, int number2) {
        return number1-number2;
    }

    public void multiplication() {
        multiplication = number1*number2;
    }

    public int multiplication(int number1, int number2) {
        return number1*number2;
    }

    public void division() {
        division = number1/number2;
    }

    public int division(int number1, int number2) {
        return number1/number2;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "sum=" + sum +
                ", subtraction=" + subtraction +
                ", multiplication=" + multiplication +
                ", division=" + division +
                '}';
    }

    public String toString(int sum, int subtraction, int multiplication, int division) {
        return "Operation{" +
                "sum=" + sum +
                ", subtraction=" + subtraction +
                ", multiplication=" + multiplication +
                ", division=" + division +
                '}';
    }
}
