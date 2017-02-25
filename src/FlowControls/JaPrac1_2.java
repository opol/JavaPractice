package FlowControls;

/**
 * Created by Ulyana_Opolska on 3/22/2016.
 */
public class JaPrac1_2 {
    public static void main (String [] args) {
        int sum = 0;
        double average;
        int lowerbound = 1;
        int upperbound = 2;
        int count = 0;

        for (int i = lowerbound; i <= upperbound; i ++){
            count = i;
        }

        System.out.println("Amount of numbers is " + count);
        System.out.println("Check amount is " + (upperbound - lowerbound +1));

        // Using for loop
        for (int i = lowerbound; i <= upperbound; i++ ){
            sum += i*i;

        }

        //Using while loop
        /*int number = lowerbound;
        while (number <= upperbound){
            sum += number;
            number ++;
        }*/

        //Using do-while loop
        /*int number = lowerbound;
        do {
            sum += number;
            number ++;
        } while (number <= upperbound);*/


        average = (double) sum/(upperbound - lowerbound +1);

        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);

    }
}
