package OOP.Inheritance;

class Base {
    int x;

    public void printme() {
        System.out.println("I am a Garry");

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

class child extends Base
{
    int y;
    public int gety()
    {
        return y;
    }
    public void sety(int y)
    {
        this.y=y;
    }
}

public class Inheritance {
    public static void main(String[] args) {

        // creating object of base class
        Base b=new Base();
        b.setx(4);
        System.out.println(b.getx());


        // creating object of derived class
        child c=new child();
        c.setx(4);
        System.out.println(c.getx());
        c.sety(2);
        System.out.println(c.gety());

        
    }
}