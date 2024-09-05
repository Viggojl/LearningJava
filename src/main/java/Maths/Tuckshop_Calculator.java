/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maths;

import javax.swing.JOptionPane;

/**
 *
 * @author Labuser
 */
public class Tuckshop_Calculator {

    public static void main(String[] args) {
        StartApp();
    }

    public static void StartApp() {
        double chip_price = 8.25;
        double chocolate_price = 10;
        double coke_price = 11.50;

        String number_of_chips_str = JOptionPane.showInputDialog("How many chips do you want?");
        int number_of_chips = Integer.parseInt(number_of_chips_str);
        System.out.println(number_of_chips * 8.25);
        
        String number_of_cokes_str = JOptionPane.showInputDialog("How many cokes do you want");
        int number_of_cokes = Integer.parseInt(number_of_cokes_str);
        System.out.println(number_of_cokes * 11.50);
        
        String number_of_chocolates_str = JOptionPane.showInputDialog("How many chocolates do you want?");
        int number_of_chocolates = Integer.parseInt(number_of_chocolates_str);
        System.out.println(number_of_chocolates * 10);
        
        System.out.println("That would be R" + (number_of_chocolates * 10 + number_of_cokes * 11.50 + number_of_chips * 8.25) );
    }

}
