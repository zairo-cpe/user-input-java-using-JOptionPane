package test;

import javax.swing.JOptionPane;

public class codes{

    public String name;
    public int age;
    
    public void displayData(String name, int age){
        String message = "Name: " + name + "\n Age:" + age;
        JOptionPane.showMessageDialog(null, message);
        System.out.println("option 2 picked.");
    }

    public void saveData(String name, int age){
        this.name = name;
        this.age = age;
        JOptionPane.showMessageDialog(null, "Data Saved!");
        System.out.println("option 1 picked.");
    }

}