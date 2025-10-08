
import java.util.Scanner;
/**
 *
 * @author Seyar Abdi
 */
public class Even_or_Add {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Even and Odd: ");
        System.out.println("");            
        int n = sc.nextInt();
   if (n % 2 == 0) {
   System.out.println(n + " is Even");
   }
   else {
   System.out.println(" is Odd");
   }
   
    }
}