package FlowControls;

/**
 * Created by Ulyana_Opolska on 3/18/2016.
 */
public class JaPrac3 {
    public static void main(String[] args){
        String [] musicalArray = {
                "cello",
                "guitar",
                "violin",
                "double bass"
        };

        String [] vowelsArray = {
                "a",
                "e",
                "i",
                "o",
                "u"
        };

        for (int i = 0; i < musicalArray.length; i++){
            for (int counter = 0; counter < vowelsArray.length; counter++){
                musicalArray[i]=  musicalArray[i].replace(vowelsArray[counter], "");

            }
            System.out.println(musicalArray[i]);

        }
    }
}
