/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loops;

import javax.swing.JOptionPane;

/**
 *
 * @author viggol
 */
public class ForWhileTest {
    public static void main(String[] args) {
        StartApp();

    }
    
    public static void StartApp() {
        int total = 0;
        int i = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        while(i > 0) {
            
            i = Integer.parseInt(JOptionPane.showInputDialog("Please Enter a number"));
            total = total + i;
            System.out.println(total);
            
            
        }
        
        
        
        
        
        
        
        
        
}
    
    
}