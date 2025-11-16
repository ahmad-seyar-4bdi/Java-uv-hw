/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication44;

/**
 *
 * @author dell
 */
public class RepetAdtion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("KG to Pound");
        
        for (int kg=1 ; kg < 199 ; kg+=2){
            double pound = kg * 2.2;
            System.out.println(kg + "\t" + pound);
        }
    }
    
}
