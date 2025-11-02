import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
Scanner input = new Scanner (System.in);
        System.out.println("enter your first value : ");
        double num1 = input.nextDouble();
    
        System.out.println("enter your optional operation : ");
        char op = input.next().charAt(0);
        System.out.println("enter your second value");
        double num2 = input.nextDouble();
        if ( op == '+'){
        System.out.println("Sum of your value is " + ( num1 + num2));
        }else if ( op == '-' ){
        System.out.println("minus of your value is " +( num1 - num2));
        }else if ( op == '*'){
            System.out.println("Multiplication of your value is " + ( num1 * num2));
            
        }else if ( op == '/'){
            if ( num2 != 0 )
            System.out.println("division of your value is " + ( num1 / num2));
            else 
                System.out.println("impossible");
        }
        else {
            System.out.println("operation is not right");
        }
    } 
    
}
