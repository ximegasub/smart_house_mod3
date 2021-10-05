public abstract class Device {
    public Device connected;

    public void add(Device device){
        if (this.connected != null) {
            this.connected.add(device);
        }else{
            this.connected = device;
        }
    }

    public void update(Boolean value){
        operation(value);
        if (this.connected != null) {
            this.connected.update(value);
        }
    }

    public abstract void operation(Boolean value);
}
