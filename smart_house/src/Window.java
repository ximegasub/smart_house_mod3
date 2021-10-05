public class Window extends Device{

    public boolean verifyState(Sensor observable){
        if (observable instanceof Cinema){
            boolean state = observable.getState();
            if (state){
                return false;
            }else{
                return true;
            }
        }
        return observable.getState();
    }

    @Override
    public void operation(Boolean value){
        if (this.connected != null){
            update(value);
        }
    }

    public void update(Boolean value){
        boolean sensorStatus = value;
        if (sensorStatus){
            System.out.println("Opening windows");
        }
        else{
            System.out.println("Closing windows");
        }
    }
}

