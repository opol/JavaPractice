package FlowControls;

/**
 * Created by Ulyana_Opolska on 6/7/2016.
 */
public class PrintPatternB {
    public static void main(String[] args) {


        for (int row = 1; row <= 8; row++) {
            for (int col = 8; col > row; col--) {
                System.out.print("# ");
            }
            System.out.println();


        }


    }
}
