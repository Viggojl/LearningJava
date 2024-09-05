/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loops;

import javax.swing.JOptionPane;
import org.w3c.dom.CharacterData;

/**
 *
 * @author viggol
 */
public class WordGame {

    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Please enter a word");
        int lastLetter = word.length();
        char letter = word.charAt((lastLetter) - 1);
        int score = 0;

        String newWord = JOptionPane.showInputDialog("Enter another word starting with the last letter of the previous word");

        char newLetter = newWord.charAt(0);

        while (newWord.charAt(0) == letter) {
            newLetter = newWord.charAt(0);
            newWord = JOptionPane.showInputDialog("Enter another word starting with the last letter of the previous word");
            score++;

        }
        if (newLetter != letter) {
            System.out.println("You lose");
            System.out.println("Your score was " + score);
            

        }

    }

}
