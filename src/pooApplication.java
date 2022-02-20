import Exercises.Delivery.BranchOffice;
import Exercises.Delivery.Package;

import javax.swing.*;
import java.util.Arrays;

public class pooApplication {

    public static String showBranches(BranchOffice[] branches) {
        StringBuilder branchesString = new StringBuilder();

        for (BranchOffice branch : branches) {
            if (branch != null) {
                branchesString.append(branch);
            }
        }
        return "List of branches:\n" + branchesString;
    }

    public static void main (String[] args) {

        int idPackage, idBranchOffice = 1, priority;
        String address, city, dni;
        double weight;

        BranchOffice[] branches = new BranchOffice[30];
        Package[] packages = new Package[100];
        int counterBranches = 0, counterPackages = 0;

        //MENU
        int option;
        do{
            option = Integer.parseInt(JOptionPane.showInputDialog("\tMENU\n" +
                    "(1) Create new branch office\n" +
                    "(2) Send package\n" +
                    "(3) Check out branch office\n" +
                    "(4) Check out package\n" +
                    "(5) Show all branches\n" +
                    "(6) Show all packages\n" +
                    "(7) Exit"));

            switch(option){
                case 1: //Create branch
                    address = JOptionPane.showInputDialog("Type the address:");
                    city = JOptionPane.showInputDialog("Type the city:");

                    BranchOffice b = new BranchOffice(idBranchOffice,address,city);
                    branches[counterBranches] = b;

                    JOptionPane.showMessageDialog(null, "Branch created correctly.");
                    idBranchOffice++;
                    counterBranches++;
                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5: // List branches
                    JOptionPane.showMessageDialog(null, showBranches(branches));
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Type a correct option.");
            }
        }while (option != 7);
    }
}