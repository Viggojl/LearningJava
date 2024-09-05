package JuneRevision;


import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author viggol
 */
public class InterestCalculation {
    public static void main(String[] args) {
        
        int invest = Integer.parseInt(JOptionPane.showInputDialog("Please Enter The Amount of Money you Wish to Invest"));
        int interest = (int)(Math.random() * 7 + 2);
        double percent = interest / 100.0;
        double amount = invest * (Math.pow(1 + percent , 8));
        
        double finalAmount = Math.round(amount);
                
                        
                        
        System.out.println(percent);
        System.out.println("R"+finalAmount);
    }
}
