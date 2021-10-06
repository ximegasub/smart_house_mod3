package smart_rooms;

import smart_devices.Device;
import smart_devices.DeviceManager;
import smart_sensors.Sensor;

import java.util.ArrayList;
import java.util.List;

public abstract class SmartRoom {
    List<Sensor> sensors = new ArrayList<>();
    String location;
    double length;
    double width;
    String name;
    DeviceManager deviceManager;


    public void addSensor(Sensor sensor){
        sensor.addObserver(this.deviceManager);
        this.sensors.add(sensor);
    }

    public void addDevice(Device device){
        this.deviceManager.add(device);
    }

    public SmartRoom(String name){
        this.location = "middle of the house";
        this.length = 40;
        this.width = 20;
        this.name = name;
    }

    public SmartRoom(String location, double length, double width, String name){
        this.location = location;
        this.length = length;
        this.width = width;
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public final void execute(){
        configureLocation();
        configureSize();
        displayRoom();
    }

    abstract void configureLocation();
    abstract void configureSize();
    abstract void displayRoom();

    public List<Sensor> getSensors() {
        return sensors;
    }

    public void setSensors(List<Sensor> sensors) {
        this.sensors = sensors;
    }

    public DeviceManager getDeviceManager() {
        return deviceManager;
    }

    public void setDeviceManager(DeviceManager deviceManager) {
        this.deviceManager = deviceManager;
    }
}
