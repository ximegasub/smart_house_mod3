
public class SmartHouse {

    public static void main(String args[]) throws Exception{
        try{
            SmartRoom room = new Bedroom("middle of the house", 40, 20, "bedroom");
            System.out.println("===== Movement =====");
            Sensor sensor = SmartBuilder.buildMovement(room);
            sensor.setUnits("");
            sensor.setState("on");
            System.out.println("===== Cinema =====");
            Sensor cinemaSensor = SmartBuilder.buildCinema(room);
            cinemaSensor.setUnits("");
            cinemaSensor.setState("on");
            System.out.println("===== Temperature =====");
            Sensor temperatureSensor = SmartBuilder.buildTemperature(room);
            temperatureSensor.setUnits("celsius");
            temperatureSensor.setState("10");
            //Menu====Temperature: 10 __
        }catch (Exception e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }

    }

}

