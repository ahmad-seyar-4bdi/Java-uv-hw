/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hex2binaary;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Hex2Binaary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a charecter");
       char charec = input.next().charAt(0);
       
       if (charec >='a' && charec <='z'){
           System.out.println("Lowecase");
       }
       else if (charec >= 'A' && charec <= 'Z'){
           System.out.println("UpperCase");
       }
       else if (charec>='0' && charec <='9'){
           System.out.println("Number");
       }
       else {
           System.out.println("Sambool");
       }
    }
    
}
