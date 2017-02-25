package FlowControls;

/**
 * Created by Ulyana_Opolska on 3/28/2016.
 */
public class SquareBoard {
    public static void main(String[] args) {
        int size = 5;
        for (int row = 1; row <= size; row ++){
            for (int col = 1; col <= size; col ++){
                System.out.print("# ");
            }
            System.out.println(" ");
        }
    }
}