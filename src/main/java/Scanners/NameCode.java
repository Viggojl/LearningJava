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
public class NameCode {
    public static void main(String[] args) {
        String input  = JOptionPane.showInputDialog("Please enter your name");
        
        String first = input.substring(0 ,3);
        String first2 = first.toLowerCase();
        int num = input.indexOf(" ");
        String second =input.substring(num + 1, num + 4);
        
        double random = Math.random() * 100;
        random = Math.round(random);
        
        System.out.println(second + first2 +  (int) random);
        
    }
}
