package main.createstring.inputtwonumber.otherletteraftertwo;

import java.util.Optional;

/**
 * This class creates a String with the following constraints:
 * - it takes two numbers as an input, representing the number of occurrences for each letter
 * - there can only be two occurrences of one letter in a row
 *
 */
public class BabaString {

    public static Optional<String> createString(int numberOfA, int numberOfB) {
        StringBuilder result = new StringBuilder();
        int aCounter = 0;
        int bCounter = 0;
        boolean forceA = false;
        boolean forceB = false;

        while(numberOfA > 0 || numberOfB > 0){
            boolean isABigger = (numberOfA > numberOfB);

            if(forceA) isABigger = true;
            if(forceB) isABigger = false;

            if(forceA && numberOfA == 0) return Optional.empty();
            if(forceB && numberOfB == 0) return Optional.empty();

            if(isABigger) {
                bCounter = 0;
                forceA = false;
                forceB = false;
                if (aCounter + 1 < 3){
                    aCounter++;
                    result.append('a');
                    numberOfA--;
                }else{
                    forceB = true;
                }
            }else{
                aCounter = 0;
                forceA = false;
                forceB = false;
                if (bCounter + 1 < 3) {
                    bCounter++;
                    result.append('b');
                    numberOfB--;
                }else{
                    forceA = true;
                }
            }
        }

        return Optional.of(result.toString());
    }
}
