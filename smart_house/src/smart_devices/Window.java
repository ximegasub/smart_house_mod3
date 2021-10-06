package smart_devices;

public class Window extends Device {
    public Window(){
        super();
    }


    @Override
    public void display(Boolean value){
        boolean sensorStatus = value;
        if (sensorStatus){
            System.out.println("Opening windows");
        }
        else{
            System.out.println("Closing windows");
        }
    }
}

