package smart_devices;

public abstract class Device {
    public Device connected;

    public Device getConnected() {
        return connected;
    }

    public void setConnected(Device connected) {
        this.connected = connected;
    }

    public void setNext(Device d){
        this.connected = d;
    }

    public void update(Boolean value){
        this.display(value);
        if (this.connected != null) {
            this.connected.update(value);
        }
    }

    public abstract void display(Boolean value);
}
