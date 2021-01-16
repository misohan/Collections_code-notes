package map;

import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        // Object without reference is eligible for garbage collection
        // Keys in hashMap which has not reference are not eligible for garbage collection

        // HashMap dominates over garbage collection mechanism
        // WeakHashMap is dominated by garbage collection mechanism

        //HashMap m = new HashMap();
        WeakHashMap m = new WeakHashMap();
        Temp t = new Temp();
        m.put(t, "element");
        System.out.println(m);

        t = null;		//t will be available for garbage collection

        //calling garbage collector
        System.gc();

        Thread.sleep(3000);
        System.out.println(m);

        // HashMap has strong references
        // WeakHashMap has weak references

//        weak reference provides a means for using an object as a key without creating a strong reference to it.
//        This is useful in situations where you don't want to impair the JVM's ability to garbage collect the
//        object, but yet still want the ability to track some aspect of the object,
//        which makes a weak reference ideal for caching or storing metadata about the object.

        // Strong reference
        StringBuilder builder = new StringBuilder();

        // Weak reference
        WeakReference<StringBuilder> weakBuilder = new WeakReference<StringBuilder>(builder);

//        Weak Reference Objects are not the default type/class of Reference Object and to be used
//        they should be explicitly specified like in the above example. This kind of reference
//        makes the reference object eligible for GC. That is, in case the only reference reachable
//        for the StringBuilder object in memory is, actually, the weak reference, then the GC is allowed
//        to garbage collect the StringBuilder object. When an object in memory is reachable only by
//        Weak Reference Objects, it becomes automatically eligible for GC.

    }

}
