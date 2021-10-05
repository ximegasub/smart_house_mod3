public class Light extends Device {

    @Override
    public void operation(Boolean value){
        if (this.connected != null){
            update(value);
        }
    }

    public void update(Boolean value){
        boolean sensorStatus = value;
        if (sensorStatus){
            System.out.println("Turning on lights");
        }
        else{
            System.out.println("Turning off lights");
        }
    }
}
