public class AirConditioning extends DeviceManager{

    public AirConditioning(){
        this.deviceOn = false;
    }

    public AirConditioning(Sensor observable, SmartRoom place){
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
            deviceOn("Turning on air conditioning from the "+ this.place.getName());
        }
        else{
            deviceOff("Turning off air conditioning from the "+ this.place.getName());
        }
    }
}