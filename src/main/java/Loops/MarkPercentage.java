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
public class MarkPercentage {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Please enter your mark");
        double mark = Double.parseDouble(input);
        while (mark < 0 || mark > 100) {
            input = JOptionPane.showInputDialog("Please enter your mark");
            mark = Double.parseDouble(input);
        }

        double markRound = Math.round(mark);

        if (markRound >= 80) {
            System.out.println("A");

        }
        if (markRound <= 80 && markRound >= 70) {
            System.out.println("B");
        }
        if (markRound <= 70 && markRound >= 60) {
            System.out.println("C");
        }
        if (markRound <= 60 && markRound >= 50) {
            System.out.println("D");
        }
        
        if (markRound <= 50 && markRound >= 40) {
            System.out.println("E");
        }
        
        if (markRound <= 40) {
            System.out.println("F");

        }

    }
}
