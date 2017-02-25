package FlowControls;

/**
 * Created by Ulyana_Opolska on 3/25/2016.
 */
public class Fibonacci {
    public static void main(String[] args) {
        int n = 4;
        int fn;
        int fnMinus3 = 1;
        int fnMinus2 = 1;
        int fnMinus1 = 2;
        int nMax = 20;
        int sum = fnMinus1 + fnMinus2;
        double average;

        System.out.println("The first " + nMax + " FlowControls.Fibonacci numbers are:");
        System.out.print(fnMinus3 + " " + fnMinus2+ " " + fnMinus1 + " ");

        while (n <= nMax){
            fn = fnMinus1 + fnMinus2+ fnMinus3;
            System.out.print(fn + " ");
            fnMinus3 = fnMinus2;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
            sum += fn;
            n++;
        }

        System.out.println("Average is: " + (double) sum/nMax);

    }
}
