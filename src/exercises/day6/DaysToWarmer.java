package exercises.day6;

import java.util.ArrayList;

public class DaysToWarmer {
    private final int [] temperatures;

    public DaysToWarmer(int [] temperatures) {
        this.temperatures = temperatures;
    }

    public int [] dayToWaitToWarmer() {
        int arrLength = temperatures.length;

        // declare an array to store indices of the temperatures
        int [] daysResult = new int[arrLength];

        // check trough the array
        for(int i = 0; i < arrLength; i++){
            // checking the days after current day
            for(int j = i + 1; j < arrLength; j++){
                if(temperatures[j] > temperatures[i]){
                    // calculate number of days to get to warmer day
                    daysResult[i] = j - i;
                    // stop if warmer day is found
                    break;
                }
            }
        }
        return daysResult;
    }

    public void runDayToWaitToWarmer() {
        int [] result = dayToWaitToWarmer();

        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if(i < result.length - 1) System.out.print(", ");
        }
        System.out.print("]");
    }
}
