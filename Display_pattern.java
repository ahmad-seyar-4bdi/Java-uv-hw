
package display_pattern;

import java.util.Scanner;

public class Display_pattern {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = input.nextInt();
        display(n);
        
    }
    public static void display(int n){
        for(int i =1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print("  ");
            }
            for(int j=i; j>=1;j--){
                System.out.print(j+" ");
            }
              System.out.println();
        }
      
    }
}
