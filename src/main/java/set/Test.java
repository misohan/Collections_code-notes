package set;

public interface Test {
    public static void main(String[] args) {
        System.out.println("entry point)");

    }

    public static void main(String arg1) {
        System.out.println("overload2");
    }

    public static void main(String arg1, String arg2) {
        System.out.println("overload3");
    }

    static String hello() {
        return "Ahoj";
    }
}
