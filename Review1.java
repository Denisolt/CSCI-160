import java.util.Scanner;
public class Review1
{
    public static void main(String [] arg)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int inputVal = keyboard.nextInt();
        Scanner keyboard2 = new Scanner(System.in);
        System.out.print("Enter the second number: ");
        int inputVal2 = keyboard2.nextInt();

        while(inputVal!=inputVal2)
        {System.out.println("Numbers are different");

            System.out.print("Enter the first number: ");
            inputVal = keyboard.nextInt();

            System.out.print("Enter the second number: ");
            inputVal2 = keyboard2.nextInt();

        }
        System.out.println("numbers are the same");
    }
}