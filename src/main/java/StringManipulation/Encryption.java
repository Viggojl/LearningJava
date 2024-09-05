/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringManipulation;

import javax.swing.JOptionPane;

/**
 *
 * @author viggol
 */
public class Encryption {

    public static void main(String[] args) {
        String cypherText = "Huuh ohz h obnl nhtsipun wyvislt!";
        int key = 0;
        for (int i = 0; i < 26; i++) {
        System.out.println("Decrypt: " + decrypt(cypherText, i));
            
        }
        

        
//        String cypherText = encrypt(plainText, key);
//        String decryptText = decrypt(cypherText, key);
//        System.out.println("Plain: " + plainText);
//        System.out.println("Encrypt: " + cypherText);
                 
    }

    public static String encrypt(String plainText, int key) {

        String output = "";

        for (int i = 0; i < plainText.length(); i++) {
            char currentLetter = plainText.charAt(i);
            if (Character.isLetter(currentLetter)) {
                int letterInt = (int) currentLetter + key;

                if (letterInt > (int) 'z' && Character.isLowerCase(currentLetter) || letterInt > (int) 'Z' && Character.isUpperCase(currentLetter)) {
                    letterInt = letterInt - (26);
                }
                currentLetter = (char) letterInt;
            }
            output = output + currentLetter;

        }

        return output;

    }
    public static String decrypt(String cypherText, int key){
        
         String output = "";

        for (int i = 0; i < cypherText.length(); i++) {
            char currentLetter = cypherText.charAt(i);
            if (Character.isLetter(currentLetter)) {
                int letterInt = (int) currentLetter - key;

                if (letterInt < (int) 'a' && Character.isLowerCase(currentLetter) || letterInt < (int) 'A' && Character.isUpperCase(currentLetter)) {
                    letterInt = letterInt + (26);
                }
                currentLetter = (char) letterInt;
            }
            output = output + currentLetter;

        }

        return output;
        
        
        
    } 
    
}
