package OOP.Polymorphism.Abstract_Class;

 abstract class Base
{
    public Base ()
    {
        System.out.println("Constructor of the base class");
    }
    public void hello()
    {
        System.out.println("Hello my friend");
    }
    abstract public void greet();// means after inheriting we've to override this method in derived class
    // it is used for creating concrete classes
}

class child extends Base
{
  @Override
  public void greet()
  { 
    System.out.println("Ohayō : Good Morning in japanese");
  }
}
class child2 extends Base
{
    @Override
    public void greet()
    {
        System.out.println("Buenos días : Good Morning in spanish");

    }
}


public class Abstract_Class {
    public static void main(String[] args) {
        // child c= new child();  // we can create object of the concrete class
        // child2 c2 = new child2();
        // Base b= new Base()    // we can't create the object of the abstract class
        // concrete class means a class which is inherited from abstract class and method is inherited
;
    }
    
}
