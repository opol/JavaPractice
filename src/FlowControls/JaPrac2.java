package FlowControls;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Ulyana_Opolska on 3/2/2016.
 */
public class JaPrac2 {


    public static void main(String[] args) {
        int counterFemale=0;
        int counterMale=0;

        String [] vocalistsArray = {
        "Beyonce (f)",
        "David Bowie (m)",
        "Elvis Costello (m)",
        "Madonna (f)",
        "Elton John (m)",
        "Charles Aznavour (m)"};

        for (String string: vocalistsArray) {
            if (string.contains("(f)")) {
                counterFemale++;

            }
            else if (string.contains("(m)")){
                counterMale++;
            }
        }
        System.out.print("Female:"+ counterFemale + " Male:" + counterMale );
    }
}
