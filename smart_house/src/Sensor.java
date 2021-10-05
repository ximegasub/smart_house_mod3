import java.util.ArrayList;
import java.util.List;

public abstract class Sensor implements Observable {
    List<Observer> observers = new ArrayList<>();
    protected boolean state;
    protected String units;

    abstract void setState(String state);
    abstract boolean getState();
    abstract void setUnits(String units);
    abstract String getUnits();
    abstract boolean verifyState(String state);

    public void activate(DeviceManager device){
        this.observers.add(device);
    }

    public void deactivate(DeviceManager device){
        this.observers.remove(device);
    }

    public void notifyAll(Boolean value){
        for (Observer observer : this.observers){
            observer.notify(value);
        }
    }

    public void addObserver( Observer observer){
        this.observers.add(observer);
    }

}
