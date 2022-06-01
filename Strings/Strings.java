package Strings;

public class Strings {
    public static void main(String[] args) {
        // String name=new String("Garry");
        String name = "Garry";
        System.out.println(name);
        int a = 8;
        float b = 2.2f;
        System.out.printf("The value of a is %d and value of b is %f ", a, b);
        // format and the printf have the same behaviour
        System.out.format("The value of a is %d and value of b is %f ", a, b);
        // %d & %f are the format specifiers
    }
}
