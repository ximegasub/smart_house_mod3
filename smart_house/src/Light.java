public class Light extends DeviceManager  {

    public Light(){
        this.deviceOn = false;
    }

    public Light(Sensor observable, SmartRoom place){
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

    @Override
    public void update(){
        boolean sensorStatus = sensor.getState();
        if (sensorStatus){
            deviceOn("Turning on lights from the "+ this.place.getName());
        }
        else{
            deviceOff("Turning off lights from the "+ this.place.getName());
        }
    }
}
