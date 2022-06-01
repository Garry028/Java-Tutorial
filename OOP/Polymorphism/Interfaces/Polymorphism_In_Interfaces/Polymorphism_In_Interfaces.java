package OOP.Polymorphism.Interfaces.Polymorphism_In_Interfaces;

interface Camera {
    public void takeSnap();

    public void recordVideo();

    private void greet() {
        System.out.println("Ohayo");

    }

    default void Record4k() {
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

public class Polymorphism_In_Interfaces {
    public static void main(String[] args) {
        Camera c = new SmartPhone();// this is an smartphone use it as camera
        c.takeSnap();
        c.recordVideo();
        c.Record4k();
        // for camera reference only camera's methods will run

        MyWiFi m = new SmartPhone();
        String[] arr = m.getNetworks();
        for (String item : arr) {
            System.out.println(item);
        }
        m.connectToNetwork();
        // for wifi reference only wifi's methods will run

        
        SmartPhone s = new SmartPhone(); // smartphone can access all methods of phone
        s.Record4k();
        s.callNumber(9112);
        s.Record4k();
        arr = s.getNetworks();
        for (String item : arr) {
            System.out.println(item);
        }
        s.connectToNetwork();
    }
}
