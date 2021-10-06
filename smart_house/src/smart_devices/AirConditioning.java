package smart_devices;

public class AirConditioning extends Device {

    @Override
    public void display(Boolean value){
        boolean sensorStatus = value;
        if (sensorStatus){
            System.out.println("Turning on air conditioning");
        }
        else{
            System.out.println("Turning off air conditioning");
        }
    }
}