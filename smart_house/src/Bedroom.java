public class Bedroom extends SmartRoom {
    double size;

    public Bedroom(String location, double length, double size, String name){
        super(location, length, size, name);
    }

    @Override
    void configureLocation() {
        location = "123456+1245";
    }

    @Override
    void configureSize() {
        size = length * width;
    }
}
