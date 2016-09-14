//09.22.2015
import java.util.Scanner;
public class AreasOfRectangles
{
    public static void main(String[] args)
    {
        double height1;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the length for the first rectangle: ");
        height1 = keyboard.nextDouble();

        double width1;
        System.out.print("Enter the width for the first rectangle: ");
        width1 = keyboard.nextDouble();

        double height2;
        System.out.print("Enter the length for the second rectangle: ");
        height2 = keyboard.nextDouble();

        double width2;
        System.out.print("Enter the width for the second rectangle: ");
        width2 = keyboard.nextDouble();

        double area1;
        double area2;

        area1 = height1 * width1;
        area2 = height2 * width2;

        if (area1 == area2)
            System.out.println("The area of first " + area1 + " is same as area of second " +area2);
        else if (area1 > area2)
            System.out.println("First area " + area1 + " is larger than the second area " + area2);
        else if (area1 < area2)
            System.out.println("Second area " + area2 + " is larger than the first area " + area1);
    }
}