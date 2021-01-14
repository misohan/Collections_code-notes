package comparable;

import java.util.Comparator;

public class ComparatorDemo implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Integer number1 = (Integer) o1;
        Integer number2 = (Integer) o1;
        if(number1<number2)
            return +1;
        if(number1>number2)
            return -1;
        else
            return 0;
    }
}

