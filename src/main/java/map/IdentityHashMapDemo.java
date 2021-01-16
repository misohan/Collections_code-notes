package map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        // HashMap key1.equals(key2)
        // IdentityHashMap key1 == key 2 reference equality
        // HashMap uses equals, value equality

        String s1 = new String("HELLO");
        String s2 = new String("HELLO");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true

        HashMap<Integer, String> map = new HashMap<>();
        map.put(10, "First");
        map.put(10, "Second");
        System.out.println(map); // will not be added because Objects are same

        //HashMap<Integer,String> m = new HashMap<>();
        IdentityHashMap<Integer,String> m = new IdentityHashMap<>();
        Integer a = new Integer(10);
        Integer b = new Integer(10);
        m.put(a, "First");
        m.put(b, "Second");
        System.out.println(m); // will be added since a !=b, values can or cannot be same
        // references must be different

        // With HashMap values must be different



    }
}
