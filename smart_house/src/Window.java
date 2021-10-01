public class Window extends DeviceManager{

    public Window(){
        this.deviceOn = false;
    }

    public Window(Sensor observable, SmartRoom place){
        this.place = place;
        this.deviceOn = false;
        this.sensor = observable;
    }

    @Override
    public void definePlace(SmartRoom place) {
        this.place = place;
    }

    @Override
    public void defineObservable(Sensor observable) {
        this.sensor = observable;
        observable.activate(this);
    }

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
    public void update(){
        boolean sensorStatus = this.verifyState(sensor);
        if (sensorStatus){
            deviceOn("Opening windows from the "+ this.place.getName());
        }
        else{
            deviceOff("Closing windows from the "+ this.place.getName());
        }
    }
}

