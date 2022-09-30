import java.util.Scanner;

public class RectangleRunner {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter rectangle 1 length: ");
        int rect1Length = myScanner.nextInt();
        System.out.print("Enter rectangle 1 width: ");
        int rect1Width = myScanner.nextInt();
        System.out.print("Enter rectangle 1 height: ");
        double rect1Height = myScanner.nextDouble();
        System.out.print("Enter rectangle 2 length: ");
        int rect2Length = myScanner.nextInt();
        System.out.print("Enter rectangle 2 width: ");
        int rect2Width = myScanner.nextInt();
        System.out.print("Enter rectangle 2 height: ");
        double rect2Height = myScanner.nextDouble();

        // write the rest of your program below//
        Rectangle rect1 = new Rectangle(rect1Length, rect1Width);
        Rectangle rect2 = new Rectangle(rect2Length, rect2Width);
        int rect1area = rect1.calculateArea();
        int rect2area = rect2.calculateArea();
        double rect1vol = rect1.calculateBoxVolume(rect1Height);
        double rect2vol = rect2.calculateBoxVolume(rect2Height);

System.out.println("the first rectangle got an area of " + rect1area + "and a volume of " + rect1vol);
System.out.println("the second rectangle got an area of " + rect2area  + "and a volume of " + rect2vol);
}
}
