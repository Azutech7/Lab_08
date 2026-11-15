import java.util.Scanner;

public class CarpetCostDemo {
    Scanner kb = new Scanner(System.in);

    String tempName;
    double tempLength, tempWidth, tempCost;

    /* Room #1 */
    System.out.print("Enter Room Name: ");
    tempName = kb.nextLine();
    System.out.print("Enter room length: ");
    tempLength = kb.nextDouble();
    System.out.print("Enter room width: ");
    tempWidth = kb.nextDouble();
    System.out.print("Enter cost per square foot: $");
    tempCost = kb.nextDouble();

    CarpetCost room1 = new CarpetCost(new RoomSize(tempName, tempLength, tempWidth), tempCost);
    System.out.println("\n"+room1+"\n")

    /* Room #2 */
    System.out.print("Enter Room Name: ");
    tempName = kb.nextLine();
    System.out.print("Enter room length: ");
    tempLength = kb.nextDouble();
    System.out.print("Enter room width: ");
    tempWidth = kb.nextDouble();
    System.out.print("Enter cost per square foot: $");
    tempCost = kb.nextDouble();

    CarpetCost room2 = new CarpetCost(new RoomSize(tempName, tempLength, tempWidth), tempCost);
    System.out.println("\n"+room2);
}