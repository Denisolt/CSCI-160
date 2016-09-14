import java.util.Scanner;

/**
 *
 * @author Arshit
 */
public class simple {
    public static void main(String [] args)
    {
        System.out.print("Enter volume of the cylinder:");
        Scanner keyboard = new Scanner(System.in);
        int volume = keyboard.nextInt();
        System.out.print("Enter radius of the cylinder:");
        Scanner input = new Scanner(System.in);
        int radius = input.nextInt();
        double height;
        double cost;
        while (volume >= 1 && radius >= 1)
        { 
            height = volume/(Math.PI*(radius*radius));
            cost = 2 * Math.PI * radius * (radius + height);
            System.out.printf("height is: %.2f\n",height); 
            System.out.printf("cost is: %.2f\n",cost);
            break;
        }
    }
}
