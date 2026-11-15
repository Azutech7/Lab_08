public class CarpetCost {
    private RoomSize size;
    private double costPerSqFt;

    public CarpetCost(RoomSize area, double cost) {
        size = new RoomSize(area);
        costPerSqFt = cost;
    }

    public double getCost() {
        return size.getArea() * costPerSqFt;
    }

    public String toString() {
        String str = size.toString();

        str += "\nThe cost per sq ft is: $"+costPerSqFt;
        str += "\nThe total cost is: $"+getCost();

        return str;
    }
}