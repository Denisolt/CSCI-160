import java.util.Scanner;
import java.util.Random;
public class HeadsorTails
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Write how many times you want to flip the coin: ");
        int numberoftries = keyboard.nextInt();
        int totalofheads=0;
        int totaloftails=0;
        int game1 = 0;
        int game2 = 0;

        for (int count = 0; count<numberoftries;count++)
        { Random rand = new Random();
            int game = rand.nextInt(2);
            if (game == 0)
            {System.out.println("Tails");
                game1=game1+1;}
            else if (game == 1) 
            {System.out.println("Heads");
                game2 = game2+=1;}
        }

        totaloftails += game1;
        System.out.println("The total number of tails: "+totaloftails);
        totalofheads += game2;
        System.out.println("The total number of heads: "+totalofheads);
    }

}

