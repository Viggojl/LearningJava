/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author viggol
 */
public class CountFiles {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("TEST.txt");
        Scanner sc = new Scanner(f, "UTF-8");
        int current = 0;
        int total = 0;
        int vTotal = 0;
        while (sc.hasNext()) {
            String word = sc.next().toLowerCase();
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (Character.isLetter(ch)) {

                    switch (ch) {
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
                            vTotal++;
                        default:
                            total++;
                    }
                }

            }
        }
        System.out.println(total + " " + vTotal);

    }

}
