public class Kitchen extends SmartRoom {
    double size;

    public Kitchen(String location, double length, double size, String name){
        super(location, length, size, name);
    }
    public Kitchen(){
        super("kitchen");
    }

    @Override
    void configureLocation() {
        location = "right part of the house";
    }

    @Override
    void configureSize() {
        size = length * width;
    }
}
