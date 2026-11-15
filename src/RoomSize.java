public class RoomSize {
    private String name;
    private double length, width;

    public RoomSize(String inName, double inLen, double inWidth) {
        name = inName;
        length = inLen;
        width = inWidth;
    }

    public RoomSize(RoomSize object2) {
        name = object2.name;
        length = object2.length;
        width = object2.width;
    }

    public double getArea() {
        return length * width;
    }

    public String toString() {
        String str = "";

        str += "Room Name: "+name;
        str += "\nLength: "+length;
        str += "\nWidth: "+width;
        str += "\nArea: %,.2f".formatted(getArea());

        return str;
    }
}