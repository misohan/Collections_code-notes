package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReversalsToSort {

    /**
     * You need to sort an array of integers by repeatedly reversing
     * the order of the first several elements of it.
     *
     * For example, to sort [11,14,12,13], you need to  reverse the order of the first two (2)
     * elements and get [14,11,12,13], then reverse the order of the first four (4) elements
     * and get [13,12,11,14] and then reverse the order of the first three (3) elements.
     *

     * The method should return array of integers corresponding to the required reversals.
     * For the previous example, given an array [11,14,12,13]
     * the method should return a array with integers [2,4,3].
     */
    public static List<Integer> getReversalsToSort(int[] array) {
        List<Integer> testArrayList = new ArrayList<>();
        if (array == null || array.length < 2) {
            return testArrayList;
        }

        List<Integer> arrayList = new ArrayList<>();
        for (int element : array) {
            arrayList.add(element);
        }

        int count = 2;
        while (!isSorted(arrayList)) {
            Collections.reverse(arrayList.subList(0, count));
            testArrayList.add(count++);
        }

        return testArrayList;
    }
    private static boolean isSorted(List<Integer> l) {
        for (int i = 0; i < (l.size() - 1); i++) {
            if (l.get(i) > l.get(i + 1)) return false;
        }
        return true;
    }

}