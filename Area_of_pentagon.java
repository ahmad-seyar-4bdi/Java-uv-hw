
package area_of_pentagon;


    import java.util.Scanner;

public class Area_of_pentagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side of the pentagon: ");
        double side = input.nextDouble();

        double pentagonArea = area(side);
        System.out.printf("The area of the pentagon is: %.2f\n", pentagonArea);
    }

    public static double area(double side) {
        return (5 * side * side) / (4 * Math.tan(Math.PI / 5));
    }
}
