package Reverse_String;

public class Reverse {
    public static void main(String[] args) {
        char str[] = { 'S', 'T', 'R', 'I', 'N', 'G' };
        String s = new String(str);
        System.out.println("The string is " + s);
        System.out.println("The reverse of the string is: ");
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(str[i]);
        }

    }
}
