package OOP.Polymorphism.Interfaces.Inheritance_In_Interfaces;

interface sample {
    public void meth1();

    public void meth2();

}

interface childSampleInterface extends sample {
    // child inherites from sample interface
    public void meth3();

    public void meth4();
}

class MyClass implements childSampleInterface {
    public void meth1() {
        System.out.println("Meth1 defined...");
    }

    public void meth2() {
        System.out.println("Meth2 defined...");
    }

    public void meth3() {
        System.out.println("Meth3 defined...");
    }

    public void meth4() {
        System.out.println("Meth4 defined...");
    }

}

public class Inheritance_In_Interfaces {
    public static void main(String[] args) {

        MyClass mc = new MyClass();
        mc.meth1();
        mc.meth2();
        mc.meth3();
        mc.meth4();

    }
}