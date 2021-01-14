package lists;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        // can hold heterogeneous objects
        // can be resizable
        // insertion of elements is ordered
        // List is interface, ArrayList is class
        // List extends Collection framework, ArrayList extends AbstractList class and implements List interface
        // ArrayList can be instantiated, List can not
        // List interface is used to create a list of elements(objects) which are associated with their index numbers.
        // ArrayList class is used to create a dynamic array that contains objects.

        List arrayList = new ArrayList();
        ArrayList arrayListTwo = new ArrayList();


        // default size is 0, by adding object it is 10 by, adding elements previous arrayList will be copied
        // resizing arrayList: x (size of array) * 3/2 (1.5)

        System.out.println(arrayList.size()); //default size 0
        //adding elements to ArrayList
        arrayList.add("John");
        arrayList.add(true);
        arrayList.add(10);
        System.out.println(arrayList);

        //removing element from ArrayList
        arrayList.remove(new Integer(10));
        System.out.println(arrayList);

        //To get value from ArrayList and print
        System.out.println(arrayList.get(1));

        //To get value from ArrayList (we need to perform typecasting here)
        //boolean b = al.get(1);

        //creating ArrayList using generics
        ArrayList<String> strList = new ArrayList<String>(); // provides type safety, not required type casting

        // every collection class or interface containing arrayList implements Serializable and Cloneable
        // Cloneable is interface, if we clone obj1 from obj2 they are same but do not point to same reference,
        // if we change one object it will not affect another

        // ArrayList is not recommended insertion or deletion in the middle, take a lot of time to shifting elements
        arrayList.add(2, "String"); // will change indexes of whole ArrayList

        ArrayList ar = new ArrayList(1); //initialize capacity, it can be resized dynamically


    }

}
