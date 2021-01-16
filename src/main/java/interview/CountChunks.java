package interview;

import java.util.ArrayList;

public class CountChunks {
    /**
     * Please implement this method to return count of chunks in given array.
     *
     * Chunk is defined as continous sequence of one or more numbers separated by one or more zeroes.
     * Array can contain leading and trailing zeroes.
     *
     * Example: array [5, 4, 0, 0, -1, 0, 2, 0, 0] contains 3 chunks
     */
    public static int countChunks(int[] array) {
        int chunksCount = 0;

        for (int i = 0; i<array.length-1; i++){
            if (array[i] ==0 && array[i+1] !=0){
                chunksCount++;

            }
            if (array[i] !=0 && array[i+1] ==0){
                chunksCount++;
            }
        }
        for (int i =1; i<array.length-1; i++){
            if (array[i-1] ==0 && array[i] !=0 && array[i+1] ==0 ){
                chunksCount--;
            }
        }
        return chunksCount;

    }

}
