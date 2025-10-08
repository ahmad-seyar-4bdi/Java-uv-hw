/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Seyar Abdi
 */
public class Loanpayments {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);


int loanAmount;
int monthlyinterestRate;
int numbersoftheyear;
        System.out.print("Please enter the loan amount :");
        loanAmount = scanner.nextInt();
        System.out.print("Please enter the monthly interest rate :");
        monthlyinterestRate = scanner.nextInt();
        System.out.print("Please enter the number of years :");
        numbersoftheyear = scanner.nextInt();

        int X = loanAmount * monthlyinterestRate;
        int Y = (int) (1 - (1 / Math.pow(1 + monthlyinterestRate, numbersoftheyear * 12 )));

int Z = X / Y;
        System.out.println("Your monthly payment is :" + Z);


    }
    
}
