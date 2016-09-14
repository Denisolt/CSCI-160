import java.util.Scanner;

/**
Denisolt Shakhbulatov
10/13/2015
 */

public class Lab5
{

    public static void printMenu()
    {
        System.out.println("This is a geometry calculator");
        System.out.println("Choose what you would like to calculate");
        System.out.println("1. Find the area of a circle");
        System.out.println("2. Find the area of a ractangle");
        System.out.println("3. Find the area of a triangle");
        System.out.println("4. Find the circumference of a circle");
        System.out.println("5. Find the perimeter of a rectangle");
        System.out.println("6. Find the perimeter of a triangle");
        System.out.print("   Enter the number of your choce: ");    
    }

    public static void main (String [] args)
    {
        int choice;         //the user's choice
        double value = 0;   //the value returned from the method
        char letter;        //the Y or N from the user's decision to exit
        double radius;      //the radius of the circle
        double length;      //the length of the rectangle
        double width;       //the width of the rectangle
        double height;      //the height of the triangle
        double base;        //the base of the triangle
        double side1;       //the first side of the triangle
        double side2;       //the second side of the triangle
        double side3;       //the third side of the triangle

        Scanner keyboard = new Scanner(System.in);
        do
        {
            printMenu();

            choice = keyboard.nextInt();

            if (choice==1)

            {
                radius = getPositive();
                //call the circleArea method and store the result in the value variable             
                value = circleArea(radius);
                System.out.println("The area of the circle is " + value);
            }

            else if (choice==2)
            {
                length = getPositive();
                width = getPositive();
                //call the rectangleArea method and store the result in the value variable
                value = rectangleArea(length, width);
                System.out.println("The area of the rectangle is " + value);
            }
            else if (choice==3) 
            {

                height = getPositive();

                base = getPositive();
                //call the triangleArea method and store the result in the value variable
                value = triangleArea(base, height);
                System.out.println("The area of the triangle is " + value);
            }

            else if (choice==4)
            {

                radius = getPositive();
                //call the circumference method and store the result in the value variable
                value = CircleCircumference(radius);
                System.out.println("The circumference of the circle is " + value);
            }
            else if (choice==5)
            {

                length = getPositive();

                width = getPositive();
                //call the perimeter method and store the result in the value variable
                value = rectanglePerimeter(length, width);
                System.out.println("The perimeter of the rectangle is " + value);
            }
            else if (choice==6)
            {

                side1 = getPositive();

                side2 = getPositive();

                side3 = getPositive();
                //call the perimeter method and store the result in the value variable
                value = trianglePerimeter(side1, side2, side3);
                System.out.println("The perimeter of the triangle is " + value);
            }
            else
            {
                System.out.println("You did not enter a valid choice.");
            }

            keyboard.nextLine(); //consumes the new line character after the number                     
            System.out.println("Do you want to exit the program (Y/N)?:  ");
            String answer = keyboard.nextLine();
            letter = answer.charAt(0);
        }
        while (letter != 'N' && letter != 'n');
    }

    public static double circleArea(double radius)
    {
        double value = (Math.PI*(radius*radius));
        return value;
    }

    public static double rectangleArea(double length, double width)
    {
        double value = length*width;
        return value;
    }

    public static double triangleArea(double base, double height)
    {
        double value = ((height*base)/2);
        return value;
    }
    
    public static double CircleCircumference(double radius)
    {
        double value = (Math.PI*2*radius);
        return value;
    }
    
    public static double rectanglePerimeter(double length, double width)
    {
        double value = ((2*length)+(2*width));
        return value;
    }
    
    public static double trianglePerimeter(double side1, double side2, double side3)
    {
        double value = (side1+side2+side3);
        return value;
    }
    
    public static double getPositive()
    {
        Scanner kb = new Scanner(System.in);
        double num;
        do
        {
            System.out.print("Enter a positive value: ");
            num = kb.nextDouble();
        }
        while(num<0);
        return num;
    }
}