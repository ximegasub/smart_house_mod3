package smart_rooms;

public class Kitchen extends SmartRoom {
    double size;

    public Kitchen(String location, double length, double width, String name){
        super(location, length, width, name);
    }
    public Kitchen(){
        super("kitchen");
    }

    @Override
    void configureLocation() {
        this.location = "right side of the house";
    }

    @Override
    void configureSize() {
        this.size = length * width;
    }

    @Override
    void displayRoom() {
        System.out.println("Kitchen Details -> Location: "+this.location+" - Size: "+this.size+" m2");
    }
}
