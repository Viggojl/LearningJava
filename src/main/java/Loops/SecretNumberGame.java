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
public class SecretNumberGame {

    public static void main(String[] args) {

        int guesses = 1;
        int secretNumber = 53;
        int input = 0;

        while (input != secretNumber) {
            guesses += 1;
            input = Integer.parseInt(JOptionPane.showInputDialog("Guess The Number."));
            if (input == secretNumber) {
                System.out.println("You guessed correctly, the secret number was " + secretNumber);
                System.out.println("Number of guesses is " + guesses);

            } else if (input < secretNumber) {
                JOptionPane.showMessageDialog(null, "Too low");

            } else if (input > secretNumber) {
                JOptionPane.showMessageDialog(null, "Too High");
            }

        }
    }
}
