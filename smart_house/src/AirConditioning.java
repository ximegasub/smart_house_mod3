public class AirConditioning extends Device{

    @Override
    public void operation(Boolean value){
        if (this.connected != null){
            update(value);
        }
    }

    public void update(Boolean value){
        boolean sensorStatus = value;
        if (sensorStatus){
            System.out.println("Turning on air conditioning");
        }
        else{
            System.out.println("Turning off air conditioning");
        }
    }
}