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
public class NumericalAnalysis {

    public static void main(String[] args) {
        StartApp();

    }
    
    public static void StartApp() {
       
        String inputStr = JOptionPane.showInputDialog("How many numbers");
        int numInputs = Integer.parseInt(inputStr);
        
        String numStr = JOptionPane.showInputDialog("Enter numbers");
        int num = Integer.parseInt(numStr);
        
        int highest = num;
        int lowest = num;
        int total = num;
        
        for (int i = 2; i <= numInputs; i++) {
            numStr = JOptionPane.showInputDialog("Enter numbers");
            num = Integer.parseInt(numStr);
            
            if(num < lowest){
                lowest = num;
            }
            if(num > highest){
                highest = num;
            }
            
            total = total + num;
            //total += num;
        }
        
        double average = (total*1.0) / numInputs;
        
        System.out.println("Avg = "+average);
        System.out.println("Lowest = "+lowest);
        System.out.println("Highest = "+highest);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        }

        

    

