package FlowControls;

/**
 * Created by Ulyana_Opolska on 3/29/2016.
 */
public class TimeTable {
    public static void main(String[] args) {
        int lastNumber = 9;
        int result = 0;

        System.out.print("*| ");

        for (int row = 1; row <= lastNumber; row++) {
            if (row != 1) {
                System.out.print("  " + row);
            } else {
                System.out.print(row);
            }
        }
        System.out.println();
        System.out.println("----------------------------");
        //System.out.println("1| ");
        /*for (int row = 1; row <= lastNumber; row++) {
            if (row != 1) {
                System.out.print("  " + row);
            } else {
                System.out.print(row);
            }
        }*/
        for (int col = 1; col <= lastNumber; col++) {
            System.out.print(col + "| " + col);
            for (int i = 2; i <= lastNumber; i++) {
                result = col * i;
                if (result <= 9) {
                    System.out.print("  " + result);
                } else {
                    System.out.print(" " + result);
                }

            }
            System.out.println();

        }
    }
}