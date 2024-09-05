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
public class OlderBracelet {

    public static void main(String[] args) {

        // double num = 1;
        //System.out.println(Math.sqrt(num) % 1 == 0);
        int T = Integer.parseInt(JOptionPane.showInputDialog("Please enter the turn you are on"));
        int level = 1;
        int boss = 0;

        for (int i = 1; i <= T; i++) {
            
            if (Math.sqrt(level) == 0 && boss > 2) {
                 level = 1;
                boss ++;
            }
            if(Math.sqrt(level) != 0){
                level ++;
                        
            }
            
         
        }
        
        System.out.println(level);
                
        

    }
}
