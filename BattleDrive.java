import java.io.*;
import java.util.Scanner;
public class BattleDrive
{
    public static void main(String [] args) throws IOException
    {
        Battle game = new Battle();
        Scanner kb = new Scanner(System.in);
        System.out.println("Welcome to the sea battle game!");
        System.out.println("Computer will try to guess them, and you will have to guess his");
        System.out.println("Whoever destroys all the ships, wins");
        System.out.print("Do you want to start new game or load your game?(new/load): ");
        String answer = kb.nextLine();
        int num;
        if(answer.equalsIgnoreCase("load"))
        {
            game.read();
        }
        do
        {
            game.userInput();
            game.display();
            System.out.print("If you want to exit and save the game press - 999: ");
            num = kb.nextInt();
            if(game.checking()==true)
                System.out.println("You won");
        }
        while(num!=999);
        game.save();
    }
}