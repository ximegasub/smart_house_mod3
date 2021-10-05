public class DeviceManager implements Observer {
    private Device device;

    public void add(Device device){
        if (this.device != null) {
            this.device.add(device);
        }else{
            this.device = device;
        }
    }


    public void notify(Boolean value){
        if (this.device != null) {
            this.device.update(value);
        }
    }
}
