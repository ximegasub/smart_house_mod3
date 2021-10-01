public class SmartBuilder {
    public static Sensor buildMovement(SmartRoom room){
        Sensor movement = new Movement();
        movement.activate(new Light(movement, room));
        movement.activate(new Camera(movement, room));
        return movement;
    }

    public static Sensor buildCinema(SmartRoom room){
        Sensor cinema = new Cinema();
        cinema.activate(new Television(cinema, room));
        cinema.activate(new Window(cinema, room));
        return cinema;
    }

    public static Sensor buildTemperature(SmartRoom room){
        Sensor temperature = new Temperature();
        temperature.activate(new AirConditioning(temperature, room));
        temperature.activate(new Window(temperature, room));
        return temperature;
    }
}
