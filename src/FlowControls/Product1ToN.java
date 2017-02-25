package FlowControls;

import java.util.Scanner;

/**
 * Created by Ulyana_Opolska on 3/23/2016.
 */
public class Product1ToN {
    public static void main (String [] args) {
        int product = 1;
        int numberTo = 1;

        Scanner scanner = new Scanner(System.in);

        numberTo = scanner.nextInt();

       if (numberTo < 0){
           System.out.println("You entered negative number");
       }
       else if (numberTo == 0){
           System.out.println("No zeros allowed");
       };

        for (int i = 1; i <= numberTo ; i++) {
            product = product * i;
        }
        System.out.println("Product obtained is: " + product);
    }
}
