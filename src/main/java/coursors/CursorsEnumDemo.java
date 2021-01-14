package coursors;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class CursorsEnumDemo {
    public static void main(String[] args) {
        // Cursors are used to show current position of element
        // Enumeration, get objects one by one
        // Iterator, we can use it with any collection object
        // ListIterator, any list object
        // Spliterator

        Vector vector = new Vector();

        System.out.println("Insert numbers: ");

        for (int i =0; i<5; i++){
            Scanner s = new Scanner(System.in);
            int userInput = s.nextInt();
            vector.addElement(userInput);
        }
        System.out.println(vector);

        Enumeration enumeration = vector.elements();

        while (enumeration.hasMoreElements()){
            Integer element = (Integer) enumeration.nextElement();
            if (element %3 ==0){
                System.out.println("Divisible by 3: ");
            }
        }

    }
}
