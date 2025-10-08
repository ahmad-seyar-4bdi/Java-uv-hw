/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java. util.Scanner;
import java.util.Random;
/**
 *
 * @author Seyar Abdi
 */
public class lotterychek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner ss = new Scanner(System.in);

        Random random = new Random();

        int number;
        System.out.print("If the number you choose matches the program’s random number, you will win the lottery! ");
 
        System.out.print("Enter a number (1 0r 2 - digit number) :");
        number = ss.nextInt();
        int x = random.nextInt(0,100);
        if (number == x ){
            System.out.println("You win 200000$");
        }
        else if (number == x+1 || number == x+2 || number == x-1 || number == x-2){
            System.out.println("You win 100000000$");
        }
        else{
            System.out.println("You lose");
        }

    }
    
}
