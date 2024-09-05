/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import javax.swing.JOptionPane;

/**
 *
 * @author viggol
 */
public class PasswordChecker {
    public static void main(String[] args) {
        String pass = JOptionPane.showInputDialog("Please enter your password.");
        int count = 0;
        String passStrength = "";
        boolean number = false;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean isLong = false;
        
        int pLength = pass.length();
        
        if (pLength >= 8) {
            count ++;
        }
        
        for (int i = 0; i < pass.length(); i++) {
            char letter = pass.charAt(i);
            
            if (Character.isDigit(letter)) {
                
            }
            
            if (Character.isUpperCase(letter)) {
               count++; 
            }
            
            if (Character.isLowerCase(letter)) {
                count++;
            }
        }
        
        if (count >= 4) {
            passStrength = "True";
        }
        else{
        passStrength = "False";
        }
                
        System.out.println("Your password is strong: " + passStrength);
        
    }
        
}
