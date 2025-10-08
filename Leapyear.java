import java.util.Scanner;
/**
 * 
 *
 * @author Seyar Abdi
 */
public class Leapyear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner ss = new Scanner(System.in);

int year;
    System.out.print("Enter your year ");
    year = ss.nextInt();
    if ( (year % 4 == 0 || year % 400 == 0) && year % 100 != 0 ){

        System.out.println("This year is a leap year");

    }
  else {
        System.out.println("This year is not a leap year");

    }
    
    
    }
}
