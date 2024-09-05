/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loops;

/**
 *
 * @author viggol
 */
public class Loops {
    public static void main(String[] args) {
        StartApp();
       

    }
    public static void StartApp() {
       
        
        
        for (int i = 1; i < 10; i++) {
            double area = Math.PI * Math.pow(i, 2);
            
            area = area * 100;
            area = Math.round(area);
            area = area / 100;
                    
            System.out.println(area);
            
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    

}


