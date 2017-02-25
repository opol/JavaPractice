package FlowControls;

/**
 * Created by Ulyana_Opolska on 3/17/2016.
 */
public class JaPrac4 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i < 1001; i++){
            if (i % 3 == 0){
               counter ++;
            }
        }
        System.out.println(counter);
        }
    }