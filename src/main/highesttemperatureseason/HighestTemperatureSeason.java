package main.highesttemperatureseason;

/**
 * For a given array of temperature integers with a length of 4xN (winter, spring, summer, autumn)
 * this class computes the highest temperature difference and returns the respective season.
 */
public class HighestTemperatureSeason {

    public static final String WINTER = "WINTER";
    public static final String SPRING = "SPRING";
    public static final String SUMMER = "SUMMER";
    public static final String AUTUMN = "AUTUMN";
    private static int MAXTEMP = 1000;
    private static int MINTEMP = -1000;

    public static String getSeasonWithHighestTemperatureDifference(int[] T) {
        if(T.length < 8) return "";

        int iArrQuarter = T.length / 4;
        int counterQuarter = iArrQuarter;
        int indexSeason = 0;
        String highestSeason = "";
        int currentHighestSeason = 0;
        int min = MAXTEMP;
        int max = MINTEMP;

        for(int i = 0; i < T.length; i++){

            if(T[i] < min) min = T[i];
            if(T[i] > max) max = T[i];

            if(i + 1 == counterQuarter){

                int newHighestSeason = getDifference(min, max);

                //System.out.println((i+1) + " = " + newHighestSeason);

                if(newHighestSeason > currentHighestSeason){
                    highestSeason = getSeason(indexSeason);
                    currentHighestSeason = newHighestSeason;
                }

                //update
                indexSeason++;
                counterQuarter += iArrQuarter;

                //reset
                min = MAXTEMP;
                max = MINTEMP;
            }
        }

        return highestSeason;
    }

    private static String getSeason(int seasonIndex){
        switch (seasonIndex) {
            case 0:  return WINTER;
            case 1:  return SPRING;
            case 2:  return SUMMER;
            case 3:  return AUTUMN;
            default: return "";
        }
    }

    private static int getDifference(int a, int b){
        return Math.abs(a - b);
    }
}
