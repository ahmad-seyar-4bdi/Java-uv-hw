
import java.util.Scanner;
/**
 *
 * @author Seyar Abdi
 */
public class simpleinterest {

    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        System.out.println("the formula for simple interest ");
        System.out.println("");
        System.out.println("give a value for T");
        int T = sc.nextInt();
        System.out.println("give a value for P");
        int P = sc.nextInt();
        System.out.println("give a value for R");
        double R = sc.nextDouble();
        System.out.println("simple interest is equal to = " + (P * T * R) / 100);

    }
    
}
