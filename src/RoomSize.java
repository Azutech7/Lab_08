/**
 * Tracks the name, length, width
 * and area of a room. Values are
 * immutable once set.
 * 
 * @author Mason Heuberger, mheuberger@student.sdccd.edu
 * @version 1.0
 * @since 2026-11-15
 */
public class RoomSize {
    private String name;
    private double length, width;

    /**
     * Takes in custom values to make a room.
     * 
     * @param inName name for the room
     * @param inLen length of the room
     * @param inWidth width of the room
     */
    public RoomSize(String inName, double inLen, double inWidth) {
        name = inName;
        length = inLen;
        width = inWidth;
    }

    /**
     * Safely copies an existing RoomSize.
     * 
     * @param object2 existing RoomSize to copy
     */
    public RoomSize(RoomSize object2) {
        name = object2.name;
        length = object2.length;
        width = object2.width;
    }

    /**
     * Calculates the total area of the room.
     * 
     * @return the room's area
     */
    public double getArea() {
        return length * width;
    }

    /**
     * Nicely formats the room name,
     * length, width, and area.
     * 
     * @return formatted String
     */
    public String toString() {
        String str = "";

        str += "Room Name: "+name;
        str += "\nLength: "+length;
        str += "\nWidth: "+width;
        str += "\nArea: %,.2f".formatted(getArea());

        return str;
    }
}