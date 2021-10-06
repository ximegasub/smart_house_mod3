package smart_devices;

public class Camera extends Device {
    public Camera(){
        super();
    }


    @Override
    public void display(Boolean value){
        boolean sensorStatus = value;
        if (sensorStatus) {
            System.out.println("Turning on camera");
        } else {
            System.out.println("Turning off camera");
        }
    }
}