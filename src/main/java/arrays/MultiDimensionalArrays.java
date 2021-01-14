package arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[][] twoDArray = new int[3][2]; // we can create 2d array with [3] and [0], runtime error
         // default value in array is 0
//        twoDArray[0] = new int[] {5,7,8};
//        twoDArray[1] = new int[5];
//        twoDArray[2] = new int[7];

        for (int[] array:twoDArray){
            for (int number: array){
                System.out.println(number);
            }
        }
        int[][][] twoDArraySecond= new int[3][][];
        twoDArraySecond[0] = new int[3][0];

        twoDArraySecond[0][0] = new int[1];
        // no limit for dimensions
    }
}
