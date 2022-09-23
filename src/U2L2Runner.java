import org.w3c.dom.css.Rect;

public class U2L2Runner {
    public static void main(String[] args) {
        Rectangle firstRect = new Rectangle(150, 200);
        Rectangle secondRect = new Rectangle(100);
        Rectangle thirdRect = new Rectangle();
        int newWidth = 125;
        thirdRect.setWidth(newWidth);
        secondRect.setWidth(newWidth);
        firstRect.setWidth(newWidth);
        int perimeter1stRect = firstRect.calculateperimeter(150, newWidth);
        int perimeter2ndRect = secondRect.calculateperimeter(newWidth, newWidth);
        int perimeter3rdRect = thirdRect.calculateperimeter(100, newWidth);
        int sumOfPerims = perimeter1stRect + perimeter2ndRect + perimeter3rdRect;

    }
}
