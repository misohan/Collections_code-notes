package coursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CursorItrDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Insert numbers: ");

        for (int i=0; i<5; i++){
            int number = s.nextInt();
            list.add(number);
        }
        System.out.println(list);

//        for (int j=0; j<list.size(); j++){
//            int number = list.get(j);
//            if (number<50){
//                list.remove(j);
//            }
//        }
        // this does not work very well

        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            Integer number = (Integer) iterator.next();
            if (number<50){
                iterator.remove();
            }
        }
        System.out.println(list);

    }
    // List iterator can go forward and backward



}
