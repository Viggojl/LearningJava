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
public class RadioTowers {
    public static void main(String[] args) {
        
    
    int comm = 1;
    int totalRT  = Integer.parseInt(JOptionPane.showInputDialog("Please enter the amount of radio towers"));
    int height = Integer.parseInt(JOptionPane.showInputDialog("Please enter the height of a radio tower"));
        
        for (int i = 2; i <= totalRT; i++) {
            height = Integer.parseInt(JOptionPane.showInputDialog("Please enter the height of a radio tower"));
            
        }
           
        if (height - height <= 10) {
            comm = comm + 1;
        }
  
        System.out.println(comm);
    
    
}
}