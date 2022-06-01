// package Methods.Method_Overloading;

// public class Method_Overloading {
//     // here in this function we've passed the array as reference that's why value will change
//     static void change(int [] arr) {
//         arr[0] = 99;
//     }

//     public static void main(String[] args) {
//         int[] marks = { 12, 34, 335, 435, 69 };
//         change(marks);
//         System.out.println("value of is: " + marks[0]);
//     }
// }

package Methods.Method_Overloading;

public class Method_Overloading {

    static void foo() {
        System.out.println("Good morning fooo1");
    }

    static void foo(int x) {
        System.out.println("Good morning fooo2");

    }

    static void foo(int x, int y) {
        System.out.println("Good morning fooo3");

    }

    public static void main(String[] args) {
        foo(1);
        foo();
        foo(1,3);
    }
}
// arguments are actual parameters are not
// method overloading cannot be performed by changing the return type