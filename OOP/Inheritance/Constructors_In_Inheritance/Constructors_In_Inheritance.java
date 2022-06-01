package OOP.Inheritance.Constructors_In_Inheritance;

class base
{
    public int x;
   
    base()
    {
        System.out.println("I am base constructor");
    }
    base(int a)
    {
        System.out.println("I am an overloadded constructor with value of a as: " + a );
    }

    public int getx()
    {
        return x;
    }
    public void setx(int x)
    {
        this.x=x;
    }
}

class derived extends base
{
    public int y;
    derived()
    {
        // super(0); // using this the parametarized constructor of the base class will be called
        System.out.println("I am derived constructor");
    }
    derived(int a,int b)
    {
        super(a);
        System.out.println("I am an overloaded constructor of derived with value of b as: " + b);
    }
    public int gety()
    {
        return y;

    }
    public void sety(int y)
    {
        this.y=y;
    }
}

class childOfDerived extends derived
{
    childOfDerived()
    {
        System.out.println("I am child of derived constructor");
    }
    childOfDerived(int a,int b,int c)
    {
        super(a,b);
        System.out.println("I am an overloaded constructor of derived with value of c as: " + c);    }
}
public class Constructors_In_Inheritance {
    public static void main(String[] args) {
        // base b=new base();
        // derived d=new derived(12,3);
        childOfDerived cd= new childOfDerived(21,3,4);
    }
}
// first base class constructor will be called then derived if derived class constructor is not there then it'll call base constructor