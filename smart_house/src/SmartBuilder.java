import smart_devices.*;
import smart_rooms.SmartRoom;
import smart_sensors.Cinema;
import smart_sensors.Movement;
import smart_sensors.Sensor;
import smart_sensors.Temperature;

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

    public static void buildTemperature(String state, String units, SmartRoom room){
        Sensor temperature = new Temperature();
        DeviceManager deviceManager = new DeviceManager();
        room.execute();
        room.setDeviceManager(deviceManager);
        room.addDevice(new AirConditioning());
        room.addDevice(new Window());
        room.addSensor(temperature);
        temperature.setUnits(units);
        temperature.setState(state);
    }

    public static void buildCinema(String state, SmartRoom room){
        Sensor cinema = new Cinema();
        DeviceManager deviceManager = new DeviceManager();
        room.execute();
        room.setDeviceManager(deviceManager);
        room.addDevice(new Television());
        room.addSensor(cinema);
        cinema.setState(state);
    }
}
