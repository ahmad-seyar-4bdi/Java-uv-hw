import java.util.Scanner;

public class PopulationProjection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        int currentPopulation = 312032486;
        int secondsPerYear = 365 * 24 * 60 * 60;

        int birthsPerYear = secondsPerYear / 7;
        int deathsPerYear = secondsPerYear / 13;
        int immigrantsPerYear = secondsPerYear / 45;

        int newPopulation = currentPopulation +
                (birthsPerYear - deathsPerYear + immigrantsPerYear) * years;

        System.out.println("The population in "+ years+ " years is " + newPopulation);
    }
}