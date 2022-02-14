import ClassesAndObjects.Operation;

import javax.swing.*;

public class pooApplication {
    public static void main (String[] args){

        int number1 = Integer.parseInt(JOptionPane.showInputDialog("Type a number: "));
        int number2 = Integer.parseInt(JOptionPane.showInputDialog("Type a number: "));

        Operation operation = new Operation(number1,number2);

        operation.sum();
        operation.subtraction();
        operation.multiplication();
        operation.division();

        System.out.println(operation);

        Operation operation2 = new Operation();
        int sumOp = operation2.sum(5,4);
        int subOp = operation2.subtraction(7,3);
        int multiOp = operation2.multiplication(5,6);
        int divOp = operation2.division(8,2);

        System.out.println(operation2.toString(sumOp,subOp,multiOp,divOp));
    }
}