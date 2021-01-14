package arrays;

import java.util.Arrays;

public class ArrayIntroduction {
    // all data structures are internally using arrays
    public static void main(String[] args) {
        int[] array; // declaration of array
        array = new int[5]; // initialization of array
        array = new int[] {5,7,8}; // creating array

        int[] arrayTwo = {5,7,8}; // another way how to declare, initialize and create array

        System.out.println(array.length);
        // size of array can not be increased (only by new keyword, what will create new array)
        System.out.println(array.getClass().getName()); // class of arrays (int[] array are not exposed for us) *
        // in Java there is special class for int[] array, float[] array, double[] array etc.
        // corresponding class name *
        // int[] = [I
        // int [][] = [[I
        // double[] = [D
        // boolean[] = [Z
        short[][][][][][][][][] shorts = new short[5][5][5][5][5][5][5][5][5];
        System.out.println(shorts.getClass().getName()); //[[[[[[[[[S

        int[] arrayThree = new int[0]; // we can create array with 0 length
        arrayThree[0] = 5;
        System.out.println(Arrays.stream(arrayThree).toArray().toString()); // runtime error index out of bonds for length
        int[] arrayFour = new int['q']; // size of array will be 97 because char 'q' is converted to number
        // only byte, short, char and int can be placed for size of array, because they can be converted to int
        // we can have negative size (-5) but there will be runtime error
    }
}
