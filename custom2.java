import java.util.Scanner;
public class custom2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Y, or y, or n, or N: ");
        String character = keyboard.nextLine();            
        while(!(character.equalsIgnoreCase("y")||character.equalsIgnoreCase("n")))
        {
            System.out.println("retard...");
            System.out.print("try again: ");
            character = keyboard.nextLine();
        }
        System.out.println("Good Job, You got it. You know alphabet");
    }
}