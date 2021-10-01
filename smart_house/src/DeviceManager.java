public abstract class DeviceManager {

    boolean deviceOn;
    SmartRoom place;
    Sensor sensor;

    public boolean getDeviceOn(){
        return this.deviceOn;
    }

    protected void deviceOn(String message){
        System.out.println(message);
        deviceOn = true;
    }

    protected void deviceOff(String message){
        System.out.println(message);
        deviceOn = false;
    }

    public abstract void update();
    public abstract void definePlace(SmartRoom name);
    public abstract void defineObservable(Sensor observable);
}
