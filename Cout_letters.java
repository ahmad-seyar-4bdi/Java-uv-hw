
package cout_letters;


    import java.util.Scanner;

public class Cout_letters {

    public static int countLetters(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        int letterCount = countLetters(str);
        System.out.println("The number of letters in the string is: " + letterCount);
    }
}
