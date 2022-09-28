import org.w3c.dom.css.Rect;
import java.util.Scanner;
public class U2L2Runner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Rectangle firstRect = new Rectangle(150, 200);
        Rectangle secondRect = new Rectangle(100);
        Rectangle thirdRect = new Rectangle();
        // ^^ basic rectangle information
        int newWidth = 125;
        thirdRect.setWidth(newWidth);
        secondRect.setWidth(newWidth);
        firstRect.setWidth(newWidth);
        // new width made to our rectangle objects
        int perimeter1stRect = firstRect.calculateperimeter();
        int perimeter2ndRect = secondRect.calculateperimeter();
        int perimeter3rdRect = thirdRect.calculateperimeter();
        // perimeter method made and used to find perimeter of these rectangles
        int sumOfPerims = perimeter1stRect + perimeter2ndRect + perimeter3rdRect; // sum of perimeter lengths
        int areaRect1 = firstRect.calculateArea();
        int areaRect2 = secondRect.calculateArea();
        int areaRect3 = thirdRect.calculateArea();
        // used to calculate the area of the rectangles
        int sumOfAreas = areaRect1 + areaRect2 + areaRect3; // sum of the area lengths of our rectangles
        System.out.println("To enclose all plots of land you need " + sumOfPerims + " feet of fencing.");
        System.out.println("We need " + sumOfAreas + " square feet of seeding to cover all 3 enclosures with seeds.");


        // CONSTRUCTION PROJECT BELOW
        System.out.println("How many pieces of lumber do you need for the home you are building?");
        int numLumber = s.nextInt();
        System.out.println("How many windows do you need?");
        int numWindows = s.nextInt();
        System.out.println("What is the tax rate for your area?");
        double taxRate = s.nextDouble();
        // ^^ User input for my object
        ConstructionPricer house = new ConstructionPricer(11.50, 25.75, taxRate);
        // house object made to calculate building a house
        double houseNoTip = house.materialsCost(numLumber,numWindows);
        double houseWithTip = house.totalWithTax(houseNoTip);
        // Below are the costs for the house, lines 38 and 39 are how the cost was calculated
        System.out.printf("Total Materials Cost: $" + "%.2f" + "\n", houseNoTip);
        System.out.printf("Grand Total After Tax: $" + "%.2f" + "\n", houseWithTip);

    }
}


