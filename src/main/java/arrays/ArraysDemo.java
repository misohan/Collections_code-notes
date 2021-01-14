package arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] a; // declaration
        int[] b = new int[3]; // declaration, initialization and creation (default values are 0)
        int[] c = {1,2,3}; // declaration, initialization and creation (specific values)

        b[0] = 5; // declaration of value

        System.out.println(b); // output is hashcode in hexadecimal [I@5ba23b66

        int[][] d = new int[2][];
        d[0] = new int[]{5,7,8};

        int[][][] e = {{{1,2,3},{1},{5}},{{5},{75,22}}};

        for (int[][] array:e){
            for (int[] dimension: array){
                for (int number: dimension){
                    System.out.println(number);
                }
            }
        }
    }
}
