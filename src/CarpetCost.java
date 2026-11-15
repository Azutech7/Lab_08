/**
 * Stores a RoomSize and cost (per sq ft)
 * allowing for cost calculations.
 * 
 * @author Mason Heuberger, mheuberger@student.sdccd.edu
 * @version 1.0
 * @since 2026-11-15
 */
public class CarpetCost {
    private RoomSize size;
    private double costPerSqFt;

    /**
     * Creates a cost quote from a
     * given room area and cost
     * (per sq ft).
     * 
     * @param area the size of the room, as a RoomSize
     * @param cost the cost of carpet per sq ft
     */
    public CarpetCost(RoomSize area, double cost) {
        size = new RoomSize(area);
        costPerSqFt = cost;
    }

    /**
     * Calculates the cost of the carpeting.
     * 
     * @return the cost of the carpeting.
     */
    public double getCost() {
        return size.getArea() * costPerSqFt;
    }

    /**
     * Nicely formats the room
     * information, cost per sq ft
     * of carpet, and the total cost.
     * 
     * @return formatted String
     */
    public String toString() {
        String str = size.toString();

        str += "\nThe cost per sq ft is: $%,.2f".formatted(costPerSqFt); // , probably not necessary unless you're in Monaco
        str += "\nThe total cost is: $%,.2f".formatted(getCost());

        return str;
    }
}