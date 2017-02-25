package FlowControls;

/**
 * Created by Ulyana_Opolska on 7/11/2016.
 */
public class PrintPatternD {
    public static void main(String[] args) {


        for (int row = 1; row <= 8; row++) {
            for (int col = 1; col <= 8; col++) {
                if (col - row <= 7){
                    System.out.print("  ");
                }
                else {
                    System.out.print("# ");
                }
            }

            System.out.println();

        }


    }
}
