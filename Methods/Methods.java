package Methods;

public class Methods {
    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = x - y;
        }
        return z;
    }// static function dont need object for calling

    int logic_1(int x1, int y1) {
        int z;
        if (x1 > y1) {
            z = x1 * y1;
        } else {
            z = x1 / y1;
        }
        return z;
    } // other than static needs object for calling

    void jokes() {
        System.out.println("I invented new word!\n" + "Plagiarism!");
    }

    public static void main(String[] args) {
        Methods obj = new Methods();// like this we can create an object of the class
        int b = obj.logic_1(12, 6);// like this using object we can call function or method
        System.out.println(b);

        int c = logic(12, 4);// like this we can call a mmethod or function
        System.out.println(c);
        // in main function we can call only static function without object
        obj.jokes();
    }
}