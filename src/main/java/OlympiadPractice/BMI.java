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
public class BMI {
    public static void main(String[] args) {
        double weight = Double.parseDouble(JOptionPane.showInputDialog("Please enter your weight."));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Please enter your height."));
        
        double bmi = (int) weight / (Math.pow(height, 2));
        bmi =  (int) Math.round(bmi);
        
        System.out.println(bmi);
       
      
                
    }
    
    
}
