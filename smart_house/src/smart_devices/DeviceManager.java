package smart_devices;


public class DeviceManager implements Observer {
    private Device device;

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public void add(Device device){
        if (this.device != null) {
            this.device.setNext(device);
        }
        else{
            this.device = device;
        }
    }


    public void notify(Boolean value){
        if (this.device != null) {
            this.device.update(value);
        }
    }
}
