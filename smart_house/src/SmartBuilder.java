public class SmartBuilder {
    public static void buildMovement(String state, SmartRoom room){
        Sensor movement = new Movement();
        DeviceManager deviceManager = new DeviceManager();
        room.execute();
        room.setDeviceManager(deviceManager);
        room.addDevice(new Light());
        room.addDevice(new Camera());
        room.addSensor(movement);
        movement.setState(state);
    }
}
