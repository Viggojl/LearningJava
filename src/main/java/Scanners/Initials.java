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
public class Initials {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Pleasse enter your full name");
        String name = "";
        String initials ="";
        
        Scanner sc = new Scanner(input);
        
        while (sc.hasNext()) {
            name = sc.next();
            if (sc.hasNext()) {
                initials = initials + name.charAt(0);
            }
            
            
        }
        System.out.println("Your initials are: " + initials + " " + name);
    }
}
