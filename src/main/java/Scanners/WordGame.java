/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author viggol
 */
public class WordGame {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Please enter a word");
        Scanner inputSc = new Scanner(input);
        char first = input.charAt(0);
        int count = 0;
        
        while (first == first) {            
            input = JOptionPane.showInputDialog("Please enter a word");  
             first = input.charAt(0);
          count++;
        }
        
        System.out.println(count);
        
        
            
        
                
    }
}
