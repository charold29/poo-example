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

        System.out.println(operation);

        Operation operation2 = new Operation();
        operation2.sum(1,2);
        operation2.multiplication(2,4);
        System.out.println(operation2);
    }
}