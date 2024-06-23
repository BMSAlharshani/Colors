/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colors;

import java.util.Scanner;

/**
 *
 * @author mczo4
 */
public class Colors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in); 
        System.out.println(" Please Enter yoour fav colors ?" ); 
      
        
        String Colors []  = new String [3]; 
        Colors  [0] = scan.next(); 
        Colors  [1] = scan.next(); 
        Colors  [2] = scan.next(); 
        System.out.println("your fav is colors : "  );
        System.out.println("1 : " + Colors  [0]);
        System.out.println("2 : " + Colors  [1]);
        System.out.println("3 : " + Colors  [2]);
        
        
    }
    
}
