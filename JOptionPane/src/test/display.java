package test;

import javax.swing.JOptionPane;

public class display{

    public static void main( String[] args) {

        //variables
        String name;
        int age, option;

        //calling for objects
        codes cc = new codes();

        //main code execution
        //name
        name = JOptionPane.showInputDialog(null, "hello, enter your name here:");
        System.out.println("name executed.");

        //age
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(null, "Enter your age:");
                age = Integer.parseInt(input);
                System.out.println("age executed.");
                break; // exit loop if conversion succeeds
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number!");
            }
        }

        //choice
        while (true){
        String optionInput = JOptionPane.showInputDialog(null, "\n1 to save data\n2 to load data\n3 to exit\n");
        option = Integer.parseInt(optionInput);

        //switch
        switch (option){
            case 1 -> cc.saveData(name, age);
            case 2 -> cc.displayData(name, age);
            case 3 -> {
                JOptionPane.showMessageDialog(null, "bye!");
                System.out.println("ending activity...");
                return;
                 }
             }

        }
    }
}