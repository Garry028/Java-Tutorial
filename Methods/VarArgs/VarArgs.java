package Methods.VarArgs;

public class VarArgs {
    // static int sum(int a,int b)
    // {
    // return a+b;
    // }
    // static int sum(int a,int b,int c)
    // {
    // return a+b+c;
    // }
    // static int sum(int a,int b,int c,int d)
    // {
    // return a+b+c+d;
    // }// instead of doing like this we can use the concept og varargs

    static int sum(int x,int... arr) {
        // available as int [] arr;
        // int x means 1 argument should be there in the call
        int result = x;
        for (int a : arr) {
            result = result + a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to VarArgs tuts !!");
        System.out.println("The sum of two numbers is: " + sum(6));
        System.out.println("The sum of two numbers is: " + sum(2, 4));
        System.out.println("The sum of three numbers is: " + sum(2, 4, 2));
        System.out.println("The sum of four numbers is: " + sum(2, 4, 5, 67));
    }
}
