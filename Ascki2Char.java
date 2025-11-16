/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Ascki2Char {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Rnter an ASCII code between 0 to 127");
        
        int code = input.nextInt();
        if (code>=0 && code <= 127){
             
            char charecter =  (char)(code);
            
            System.out.println("The charecter is " + charecter);
            
        }
        else {
            System.out.println("Invailid Input");
        }
    }
    
}
