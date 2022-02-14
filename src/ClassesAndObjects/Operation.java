package ClassesAndObjects;

public class Operation {
    //ATTRIBUTES
        int number1;
        int number2;
        int sum;
        int subtraction;
        int multiplication;

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

    public void sum(int number1, int number2) {
        sum = number1 + number2;
    }

    public void subtraction() {
        subtraction = number1-number2;
    }

    public void subtraction(int number1, int number2) {
        subtraction = number1-number2;
    }

    public void multiplication() {
        multiplication = number1*number2;
    }

    public void multiplication(int number1, int number2) {
        multiplication = number1*number2;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "sum=" + sum +
                ", subtraction=" + subtraction +
                ", multiplication=" + multiplication +
                '}';
    }
}
