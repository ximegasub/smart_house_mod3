package smart_devices;

public class Light extends Device {

    public Light(){
        super();
    }

    @Override
    public void display(Boolean value){
        boolean sensorStatus = value;
        if (sensorStatus){
            System.out.println("Turning on lights");
        }
        else{
            System.out.println("Turning off lights");
        }
    }
}
