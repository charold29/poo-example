import Exercises.IsoscelesTriangle;

import javax.swing.*;

public class pooApplication {

    public static void biggestAreaTriangle(IsoscelesTriangle[] triangles){
        float minArea = Float.MIN_VALUE;
        int biggestTriangleAreaIndex = 0;

        int i;
        for(i = 0 ; i < triangles.length; i++){
            if(triangles[i].getArea() > minArea){
                minArea = triangles[i].getArea();
                biggestTriangleAreaIndex = i;
            }
        }
        JOptionPane.showMessageDialog(null,
                "The triangle with biggest surface is: \n" +
                        "Triangle " + biggestTriangleAreaIndex + ":\n" +
                        triangles[biggestTriangleAreaIndex].toString());
    }

    public static void main (String[] args) {

        int numTriangles = Integer.parseInt(JOptionPane.showInputDialog("Insert the number of triangles: "));

        IsoscelesTriangle[] triangles = new IsoscelesTriangle[numTriangles];

        for (int i = 0; i<numTriangles; i++){
            int id = i + 1;
            float base = Float.parseFloat(JOptionPane.showInputDialog("Triangle " + id + "\nType the base:"));
            float height = Float.parseFloat(JOptionPane.showInputDialog("Triangle " + id + "\nType the height:"));

            triangles[i] = new IsoscelesTriangle(base,height);

            float perimeter = triangles[i].getPerimeter();
            float area = triangles[i].getArea();

            JOptionPane.showMessageDialog(null, "Triangle " + id
                    + "\nPerimeter: " + perimeter
                    + "\nArea: " + area);
        }

        biggestAreaTriangle(triangles);
    }
}