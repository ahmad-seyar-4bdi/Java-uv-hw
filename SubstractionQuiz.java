
package substractionquiz;
import java.util.Scanner;

public class SubstractionQuiz {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int num1 =(int) (Math.random()*10);
int num2 =(int)(Math.random()*10);
if (num1 < num2){
    int temp = num1;
            num1 = num2;
            num2 = temp;
                    }
        System.out.println("what is : "+ num1 +"-"+num2+"?");
        System.out.println("");
        int answer = sc.nextInt();
        if (answer == num1 - num2){
            System.out.println("Your answer is correct!");
        } else{
                    System.out.println("Your answer is incorrect");
                    }
            
        }
        
    }
    

