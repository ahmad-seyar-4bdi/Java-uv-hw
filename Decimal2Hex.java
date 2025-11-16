/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimal2hex;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Decimal2Hex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Number between 0 - 15");
        int dec = input.nextInt();
        
        if (dec <= 9 && dec >=0 ){
            
            System.out.println(dec);
            
        }
        
        else if (dec >= 10 && dec <=15){
            switch (dec){
                case 10 : System.out.println("A");;break;
                case 11 : System.out.println("B");;break;
                case 12 : System.out.println("C");;break;
                case 13 : System.out.println("D");;break;
                case 14 : System.out.println("E");;break;
                case 15 : System.out.println("F");;break;
            }
        }
        
        else {
            System.out.println("Valid value");
        }
        
    }
    
}
