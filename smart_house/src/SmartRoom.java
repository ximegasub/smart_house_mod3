public abstract class SmartRoom {
    String location;
    double length;
    double width;
    String name;

    public SmartRoom(String location, double length, double width, String name){
        this.location = location;
        this.length = length;
        this.width = width;
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public final void execute(){
        configureLocation();
        configureSize();
    }

    abstract void configureLocation();
    abstract void configureSize();
}
