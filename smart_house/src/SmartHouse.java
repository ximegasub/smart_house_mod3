import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SmartHouse {

    public static void main(String args[]) throws Exception{
        try{
            System.out.println("===Smart House===");
            System.out.println("Please define the room [Bedroom/Kitchen]:");
            BufferedReader readerRoom = new BufferedReader(new InputStreamReader(System.in));
            String name = readerRoom.readLine();
            SmartRoom room = (SmartRoom) Class.forName(name).newInstance();
            System.out.println("Please set the state for the Motion sensor [on/off]:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String state = reader.readLine();
            SmartBuilder.buildMovement(state, room);

        }catch (Exception e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }

    }

}

