package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        // table of nodes
        // node is linkedList itself
        // node: hashing, key, value, link to next node

        //int indexFor(int h, int length){ return h & (length-1)}; hashing of object & (length-1)

        //HashMap with initial capacity 16, 0.75 load factor
        HashMap map = new HashMap();

        Map m = new HashMap();

        //HashMap with specified initial capacity and default load factor
        HashMap map2 = new HashMap(20);

        //HashMap with specified initial capacity and specified load factor
        HashMap map3 = new HashMap(20,0.9f);

        //Equivalent hashMap from Map
        HashMap map4 = new HashMap(m);

        HashMap<String,Integer> marks = new HashMap<>();
        marks.put("Science", 90);
        marks.put("Maths",80);
        marks.put("English", 80);
        //insertion order is not preserved

        marks.put("FB", 10);
        marks.put("Ea", 10);
        //Hash value of both keys is same, these will be stored to same index bucket

        marks.keySet();
        System.out.println(marks.keySet()); // get all values [Maths, English, Science, FB, Ea]
        System.out.println(marks.entrySet()); // set of all entries [Maths=80, English=80, Science=90, FB=10, Ea=10]
        marks.clone(); // shallow copy

    }
}
