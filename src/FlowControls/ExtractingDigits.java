package FlowControls;

/**
 * Created by Ulyana_Opolska on 3/28/2016.
 */
public class ExtractingDigits {
    public static void main(String[] args) {
        int n = 9876;
        while (n > 0) {
            int digit = n % 10;
            System.out.print(digit + ",");

            n = n / 10;

        }
    }
}
