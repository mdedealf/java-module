package exercises.day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DaysWarmer {

    public int [] getWarmerDays(List<Integer> temperatures) {
        int [] result = new int[temperatures.size()];
        Stack<Integer> stack = new Stack<>();

        // need to access the array index
        for(int i = 0; i < temperatures.size(); i++){
            // if stack not empty = there are some day warmer before
            // stack peek (top of the stack) -> just peeking the data not getting
            while(!stack.isEmpty() && temperatures.get(i) > temperatures.get(stack.peek())) {
                int tempIndex = stack.pop();
                result[tempIndex] = i - tempIndex; // the days different
            }
            stack.push(i);
        }
        return result;
    }

//    public static void runGetWarmerDays() {
//        runGetWarmerDays();
//    }
}
