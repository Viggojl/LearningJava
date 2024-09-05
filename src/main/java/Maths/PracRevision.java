/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maths;

import static Maths.Tuckshop_Calculator.StartApp;
import javax.swing.JOptionPane;

/**
 *
 * @author viggol
 */
public class PracRevision {
    public static void main(String[] args) {
         StartApp();
         
    }
    public static void StartApp() {
        
         String input = JOptionPane.showInputDialog("What is the radius");
         double radius = Double.parseDouble(input);
         double area = 4/3.0 * (Math.PI * Math.pow(radius, 3));
         System.out.println(+ area);
         
        String name = "viggo";
        int num = (int) (Math.random() * name.length());
        System.out.println(name.charAt(num));
        
    }
         
         
         
    
         
         
         
         
         
 
    
    
}