/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OlympiadPractice;

import javax.swing.JOptionPane;

/**
 *
 * @author viggol
 */
public class Circle {
    public static void main(String[] args) {
        double x = Double.parseDouble(JOptionPane.showInputDialog("Enter the x co-ordinate"));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Enter the y co-ordinate"));
        
        double output = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        
        if (output > 1) {
            System.out.println("BLUE");
        }
        else{
            System.out.println("RED");
            }   
    }
}
