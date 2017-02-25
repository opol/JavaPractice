package FlowControls;

/**
 * Created by Ulyana_Opolska on 3/18/2016.
 */
public class JaPrac9 {
    public static void main(String[] args) {

        String[] diagArray = {
                "D",
                "I",
                "A",
                "G",
                "O",
                "N",
                "A",
                "L",
                "L",
                "Y"
        };
int spaceCounter = 0;
        for (int i = 0; i < diagArray.length; i++){
            for (int counter= 0; counter < spaceCounter; counter++){
                System.out.print(" ");
            }
            System.out.println(diagArray[i]);
            spaceCounter++;

        }
    }
}
