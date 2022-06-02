package Access_Modifiers;

class c1 {
    public int x = 12;
    protected int y = 11;
    private int z = 213;
    int k = 12412;

    public void meth1() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(k);

    }
}
class c2 extends c1
{
 // default and the private not accesible here   
}

public class Access_Modifiers {
    public static void main(String[] args) {
        // c1 c = new c1();
        //  System.out.println(c.z);it is private cant be access in same package
    }
}
