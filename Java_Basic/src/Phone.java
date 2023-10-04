public class Phone {
    private String brandName ;
    private boolean hasFM ;
    private boolean hasCanera ;
    private double price ;
    private int space ;
    public void call(String n) {
        System.out.println("Calling to " + n);
    }

    public void turnOn() {
        System.out.println("On");
    }

    public void turnOff() {
        System.out.println("Off");
    }

    public static void main(String[] args) {
        Phone myDevice = new Phone();

        // เรียกใช้งานเมท็อด call() โดยส่งชื่อเป็นอาร์กิวเมนต์
        myDevice.call("Peter");

        // เรียกใช้งานเมท็อด turnOn() และ turnOff()
        myDevice.turnOn();
        myDevice.turnOff();
    }
}