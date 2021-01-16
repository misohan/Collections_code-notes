package interview;

import java.util.Arrays;

public class ClosestToZero {
    public static int getClosestToZero(int[] array) {
        int currentValue;
        int firstElementIndex = 0;
        int closestValue = array[firstElementIndex];
        Arrays.sort(array);

        for (int i = 0; i<array.length; i++){
            currentValue = array[i] * array[i];
            if (currentValue <=(closestValue * closestValue)){
                closestValue = array[i];
            }
        }
        return closestValue;
    }

}
