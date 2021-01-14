package generics;

import java.util.ArrayList;

public class DataStructureDemo {
    public static void main(String[] args) {
        // Arrays are type safe
        // Collection can receive different data types

        String[] strArray = new String[5]; // homogenous, type safety, taking only declared type
        Employee[] employees = new Employee[5];

        ArrayList arrayList = new ArrayList(); // heterogeneous, we can add any object type, can not take primitive type
        // wrappers (Integer), objects

        arrayList.add(new Employee());
        arrayList.add("Michal");
        arrayList.add(5);

        System.out.println(arrayList.get(1)); // we can do this
        String name = (String) arrayList.get(1); // we need to do type casting
    }
}
