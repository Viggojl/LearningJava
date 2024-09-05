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
public class Parity {

    public static void main(String[] args) {

        int N = Integer.parseInt(JOptionPane.showInputDialog("Please enter the value of N"));

        String even = "";
        String odd = "";
        boolean isEven = false;
        boolean isOdd = false;

        for (int i = 1; i <= N; i++) {

            if (i % 2 == 0) {
                isEven = true;
                if (isEven) {
                    even = even + i + " ";
                }

                
                
            }

            if (i % 2 != 0) {
                isOdd = true;

                

                if (isOdd) {
                    odd = odd + i + " ";
                }
            }

        }

        System.out.println(odd);
        System.out.println(even);
    }
}
