package OOP.Polymorphism.Dynamic_Method_Dispatch;

class Phone
{
   public void name ()
   {
       System.out.println("My name is phone");
   }
}

class SmartPhone extends Phone
{
    @Override
   public void name()
   {
       System.out.println("My name is SmartPhone");
   }
}

public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
    //  Phone obj=new Phone();
    //  SmartPhone smobj=new SmartPhone();
    //  obj.name();   

    Phone obj = new SmartPhone();  // derived class object base class reference
    // SmartPhone obj = new Phone(); we cannot do like this

    obj.name();  // smartphones name will be called
    }

}
