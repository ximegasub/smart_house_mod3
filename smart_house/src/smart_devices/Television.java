package smart_devices;

public class Television extends Device {
    public Television(){
        super();
    }

    @Override
    public void display(Boolean value){
        boolean sensorStatus = value;
        if (sensorStatus){
            System.out.println("Turning on television");
        }
        else{
            System.out.println("Turning off television");
        }
    }
}

