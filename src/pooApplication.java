import Ejercicios.Quadrilateral;

import javax.swing.*;

public class pooApplication {
    public static void main (String[] args){
        float side1 = Float.parseFloat(JOptionPane.showInputDialog("Digit the side 1: "));
        float side2 = Float.parseFloat(JOptionPane.showInputDialog("Digit the side 2:"));

        Quadrilateral quadrilateral;
        if (side1 == side2){
            quadrilateral = new Quadrilateral(side1);
        }else{
            quadrilateral = new Quadrilateral(side1, side2);
        }
        System.out.println(quadrilateral);

        float perimeter = quadrilateral.getPerimeter();
        float area = quadrilateral.getArea();

        System.out.println("The perimeter is: " + perimeter);
        System.out.println("The area is: " + area);

    }
}