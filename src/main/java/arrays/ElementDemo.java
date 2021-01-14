package arrays;

public class ElementDemo {
    public static void main(String[] args) {
        int[] x = new int[3];
        x[0] = 'a';

        System.out.println(x[0]); // char 'a' is transferred to 97

        Object[] y = new ArraysDemo[3];

        Car[] cars = new Car[]{new Car(5), new Car(5)};

        for (Car car:cars){
            System.out.println(car.hp);
        }
        Number[] numArray = new Number[5];
        numArray[0] = 7;

        Runnable[] runnables = new Runnable[5];
        runnables[0] = new Thread();

        // objects will initialize with null and primitive types with 0 or false or 0.00
    }
}
