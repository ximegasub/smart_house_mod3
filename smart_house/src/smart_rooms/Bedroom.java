package smart_rooms;

public class Bedroom extends SmartRoom {
    double size;

    public Bedroom(String location, double length, double size, String name){
        super(location, length, size, name);
    }
    public Bedroom(){
        super("bedroom");
    }

    @Override
    void configureLocation() {
        this.location = "left side of the house";
    }

    @Override
    void configureSize() {
        this.size = length * width;
    }

    @Override
    void displayRoom() {
        System.out.println("Bedroom Details -> Location: "+this.location+" - Size: "+this.size+" m2");
    }
}
