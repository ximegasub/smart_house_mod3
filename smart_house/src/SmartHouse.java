import smart_rooms.Bedroom;
import smart_rooms.Kitchen;
import smart_rooms.SmartRoom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SmartHouse {

    public static void main(String args[]) throws Exception {
        try {
            System.out.println("Smart House");
            System.out.println("-------------------------");
            SmartRoom room = displayRooms();
            System.out.println("-------------------------");
            displayOptions(room);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static SmartRoom displayRooms(){
        System.out.println("Choose the room");
        System.out.println("-------------------------");
        System.out.println("1 - Bedroom");
        System.out.println("2 - Kitchen");
        System.out.println("3 - Quit");

        SmartRoom room = null;
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You choose the Bedroom....");
                room = new Bedroom();
                break;
            case 2:
                System.out.println("You choose the Kitchen....");
                room = new Kitchen();
                break;
            default:
                // The user input an unexpected choice.
        }
        return room;
    }

    public static void displayOptions(SmartRoom room) throws IOException {
        System.out.println("Choose the sensors");
        System.out.println("-------------------------");
        System.out.println("1 - Motion Sensor");
        System.out.println("2 - Temperature Sensor");
        System.out.println("3 - Cinema Sensor");
        System.out.println("4 - Quit");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You choose Motion Sensor....");
                System.out.println("-------------------------");
                System.out.println("Please set the state for the Motion sensor [on/off]:");
                BufferedReader readerOne = new BufferedReader(new InputStreamReader(System.in));
                String stateOne = "off";
                try {
                    stateOne = readerOne.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("-------------------------");
                SmartBuilder.buildMovement(stateOne, room);
                break;
            case 2:
                System.out.println("You choose Temperature Sensor....");
                System.out.println("-------------------------");
                System.out.println("Please set the value (int) for the Temperature sensor in a range between [<20 and >20]:");
                BufferedReader readerTwo = new BufferedReader(new InputStreamReader(System.in));
                String stateTwo = "0";
                try {
                    stateTwo = readerTwo.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("-------------------------");
                SmartBuilder.buildTemperature(stateTwo, "celsius", room);
                break;
            case 3:
                System.out.println("You choose Cinema Sensor....");
                System.out.println("-------------------------");
                System.out.println("Please set the state for the Cinema sensor [on/off]:");
                BufferedReader readerThree = new BufferedReader(new InputStreamReader(System.in));
                String stateThree = "off";
                try {
                    stateThree = readerThree.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("-------------------------");
                SmartBuilder.buildCinema(stateThree, room);
                break;
            default:
                // The user input an unexpected choice.
        }
    }

}

