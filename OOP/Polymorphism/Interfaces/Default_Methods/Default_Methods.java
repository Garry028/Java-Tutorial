package OOP.Polymorphism.Interfaces.Default_Methods;

interface Camera {
    public void takeSnap();

    public void recordVideo();

    private void greet()
    {
        System.out.println("Ohayo");
        // this private method can be called only within the local methods
        // private method cannot called directly
    }
    default void Record4k() // like this we ccan implement here
    {
        greet();
        System.out.println("Recording in 4k...");
    }

}

interface MyWiFi {
    public String[] getNetworks();

    public void connectToNetwork();

}

class MyCellPhone {

    public void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

}

class SmartPhone extends MyCellPhone implements MyWiFi, Camera {
    public void takeSnap() {
        System.out.println("Taking snap ");
    }

    public void recordVideo() {
        System.out.println("Recording video");

    }

    public void connectToNetwork() {
        System.out.println("Connecting to network...");
    }

    public String[] getNetworks() {
        System.out.println("Getting list of networks...");
        String[] networkList = { "Garry", "harry", "Poco-x2" };
        return networkList;
    }

}

public class Default_Methods {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        String[] arr = sp.getNetworks();
        for (String item : arr) {
            System.out.println(item);
        }
        sp.connectToNetwork();
        sp.recordVideo();
        sp.takeSnap();
        sp.Record4k();
    }
}
