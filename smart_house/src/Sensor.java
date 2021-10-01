import java.util.ArrayList;
import java.util.List;

public abstract class Sensor {
    List<DeviceManager> devices = new ArrayList<>();
    protected boolean state;
    protected String units;

    abstract void setState(String state);
    abstract boolean getState();
    abstract void setUnits(String units);
    abstract String getUnits();
    abstract boolean verifyState(String state);

    public void activate(DeviceManager device){
        this.devices.add(device);
    }

    public void deactivate(DeviceManager device){
        this.devices.remove(device);
    }

    public void notifyObservers(){
        for (DeviceManager device : this.devices){
            device.update();
        }
    }
}
