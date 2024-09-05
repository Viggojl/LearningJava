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
public class HCF {

    public static void main(String[] args) {
        StartApp();

    }

    public static void StartApp() {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter another number"));
        int hcf = 0;
        int lowestNum = 0;
        if (num1 < num2) {
            lowestNum = num1;
        } else {
            lowestNum = num2;

        }
        for (int i = 1; i <= lowestNum; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println(i);
                hcf = i;

            }

        }
        System.out.println(hcf);
    }

}
