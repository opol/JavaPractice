package FlowControls;

/**
 * Created by Ulyana_Opolska on 3/23/2016.
 */
public class HarmonicSum {
    public static void main (String [] args) {
        int maxDenominator = 50000;
        double sumL2R = 0.0;
        double sumR2L = 0.0;

        for (int i = 1; i <= maxDenominator; i++) {
            sumL2R += (double) 1/i;
        }
        System.out.println("Sum L2R: " + sumL2R);

        for (int i = maxDenominator; i > 0; i--) {
            sumR2L += (double) 1/i;
        }
        System.out.println("Sum R2L: " + sumR2L);

        double difference = 0.0;
        difference = sumR2L - sumL2R;
        System.out.println("The difference is: " + difference);
    }



}
