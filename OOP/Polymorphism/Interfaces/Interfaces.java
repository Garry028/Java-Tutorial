package OOP.Polymorphism.Interfaces;

interface Animal// interface is group of abstract methods
{
    public void animalSound();// interface method does not have body
    public void sleep();
    int a=11; // this is by default final means cant be change

}
interface Food// interface is group of abstract methods
{
    public void food();// interface method does not have body
    
}
class dog implements Animal,Food // implements keyword is used when we use interface
{
    public void animalSound(){
        // the body of animalSound()
        System.out.println("Dog says: bho bho");
    }
    public void sleep()
    {
        // body of sleep()
        System.out.println("Dog Sleeps : Zzz");
    }
    public void food()
    {
        System.out.println("Dog Eats : Biscuits");
    }
}

public class Interfaces {
 public static void main(String[] args) {
     dog mydog=new dog();
     mydog.animalSound();
     mydog.sleep();
     mydog.food();
     //mydog.a=22;  we cannot modify the values in interface
     
 }   
}
