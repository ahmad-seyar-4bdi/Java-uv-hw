
import java.util.Scanner;
/**
 *
 * @author Seyar Abdi
 */
public class TheAreaofCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System. in) ;
                System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;
         System.out.println("The area of a circle is equal to: " + area);
    }
    
}
