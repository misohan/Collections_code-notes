package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(5, "Testing");

        for (int i=0; i<10; i++){
            map.computeIfAbsent(i, key -> "This number is " + key);
        }
        Iterator it = map.entrySet().iterator();

        while (it.hasNext()){
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            it.remove(); // avoids a ConcurrentModificationException
        }
    }
}
