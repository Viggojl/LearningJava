/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loops;

import static Loops.ForWhileTest.StartApp;
import javax.swing.JOptionPane;

/**
 *
 * @author viggol
 */
public class WhileLoops {
     public static void main(String[] args) {
        StartApp();
}
  public static void StartApp() {
      String name = JOptionPane.showInputDialog("Please enter your name.") ;
      
      double totalWeight =0;
      int highest = 0;
      String highname = "";
      int count = 0;
      
      while(!name.equals("XXX")){
          double weight = Double.parseDouble(JOptionPane.showInputDialog("Please enter your weight."));
          int age = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age."));
          
          count++;
          totalWeight+=weight;
          
          if (age>highest) {
              highname = name;
              highest = age;
          }
          
          name = JOptionPane.showInputDialog("Please enter your name.");
      }
      
      double avg = totalWeight/count;
      System.out.println("Highest age is " + highname + " at " + highest +" years old");
      System.out.println("Average weight: " + avg);
      
      
      
      
      
  }
  }