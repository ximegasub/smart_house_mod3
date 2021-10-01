public class Television extends DeviceManager{

    public Television(){
        this.deviceOn = false;
    }

    public Television(Sensor observable, SmartRoom place){
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
            deviceOn("Turning on television from the "+ this.place.getName());
        }
        else{
            deviceOff("Turning off television from the "+ this.place.getName());
        }
    }
}

