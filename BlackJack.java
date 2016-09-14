//10.27.2015
//Denisolt
import java.util.Random;  
import java.util.Scanner;

public class BlackJack
{
    public static void main(String [] args)
    {
        Die1 game1 = new Die1(10);
        int randomCard = game1.getValue();
        do
        {
            Random rand = new Random ();
            System.out.println("This is the blackjack card game");
            int usertotal=0;
            int sumcard=0;
            int comptotal=0;
            int userNum = randomCard + randomCard;
            do
            {
                comptotal = compchoice(comptotal, randomCard);
                usertotal = usertotal + randomCard; 
                System.out.println("You have " + usertotal);
                System.out.println("Dealer has " + comptotal);
                
            }
            while(Playagain());
            result(comptotal, usertotal);
            System.out.println();
            System.out.println();
        }
        while(Playagain2());
    }

    public static boolean Playagain()
    {
        String playAgain;
        do
        {
            Scanner keyboard = new Scanner (System.in);
            System.out.print("Do you want to continue (Y/N)?:  ");
            playAgain = keyboard.nextLine();
        }
        while(!playAgain.equalsIgnoreCase("y")&&!playAgain.equalsIgnoreCase("n"));
        if (!playAgain.equalsIgnoreCase("y"))
            return false;
        else 
            return true;
    }

    public static int compchoice(int comptotal, int randomCard)
    {
        while (comptotal<=17)
        { 
            int compNum = randomCard;
            comptotal = comptotal + compNum;
        }
        return comptotal;
    }

    public static void result(int comptotal, int usertotal)
    {
        if (comptotal==usertotal)
            System.out.println("It's draw, dealer has " + comptotal+ " and you have " + usertotal);
        else if (usertotal==21)
            System.out.println("You won, dealer has " + comptotal + " and you have " + usertotal);
        else if(comptotal<=21&&usertotal<=21)
        {
            if((21-comptotal)<(21-usertotal))
                System.out.println("Dealer won, he has " + comptotal+ " and you have " + usertotal);
            else
                System.out.println("You won, dealer has " + comptotal + " and you have " + usertotal);
        }   
        else if (comptotal<=21&&usertotal>=21)
            System.out.println("Dealer won, he has " + comptotal+ " and you have " + usertotal);
        else if(comptotal>=21&&usertotal<=21)
            System.out.println("You won, dealer has " + comptotal + " and you have " + usertotal);

    }

    public static boolean Playagain2()
    {
        String playAgain2;
        do
        {
            Scanner keyboard = new Scanner (System.in);

            System.out.print("Do you want to play again (Y/N)?:  ");
            playAgain2 = keyboard.nextLine();
        }
        while(!playAgain2.equalsIgnoreCase("y")&&!playAgain2.equalsIgnoreCase("n"));
        if (!playAgain2.equalsIgnoreCase("y"))
            return false;
        else 
            return true;
    }
}