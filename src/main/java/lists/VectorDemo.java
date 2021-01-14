package lists;

import java.util.Vector;

class VectorDemo {
    public static void main(String[] args) {
        // it is thread safe, ArrayList is not
        // only accessible by one thread
        // Vector methods in vector are synchronized
        // ArrayList methods are not synchronized

        // Vector has low performance
        // ArrayList has better performance

        Vector vector = new Vector(50); // capacity is size of vector * 2
        //creating vector with specified capacity and incremental capacity
        Vector vec1 = new Vector(100,5);

        //creating vector with specified collection
        //Vector vec2 = new Vector(Collection c);

        //to add elements in Vector
        vector.add(10);
        vector.addElement("Hello");
        System.out.println(vector);

        //to remove element from vector
        vector.remove(0);
        System.out.println(vector);
        System.out.println(vector.elementAt(0));

        //to get elements
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        System.out.println(vector.get(0));

        //size();
        //capacity();
    }



}
