
import java.util.Scanner;
/**
 *
 * @author Seyar Abdi
 */
public class ChineseZodiac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner ss = new Scanner(System.in);
        System.out.println("please enter the year you were born");
        int year = ss.nextInt();
        
        int sc = year %12;
        switch (sc){
            case 0 : System.out.println("The zodiac year your were born is Monkey "); break;
            case 1 : System.out.println("The zodiac year your were born is Rooster "); break;
            case 2 : System.out.println("The zodiac year your were born is Dog "); break;
            case 3 : System.out.println("The zodiac year your were born is Pig "); break;
            case 4 : System.out.println("The zodiac year your were born is Rat "); break;
            case 5 : System.out.println("The zodiac year your were born is Ox "); break;
            case 6 : System.out.println("The zodiac year your were born is Tiger "); break;
            case 7 : System.out.println("The zodiac year your were born is Rabbit "); break;
            case 8 : System.out.println("The zodiac year your were born is Dragon "); break;
            case 9 : System.out.println("The zodiac year your were born is Snake "); break;
            case 10: System.out.println("The zodiac year your were born is horse "); break;
            case 11: System.out.println("The zodiac year your were born is Sheep "); break;
        }
    }
    
}
