import java.util.Scanner;
import java.util.*;
import java.io.*;
public class Battle
{
    private int[][] game;
    private int Row;
    private int Col;
    private int input;

    public Battle()
    {
        game = new int[10][10];
    }

    public void userInput()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please choose the row: ");
        Row = keyboard.nextInt();        
        System.out.print("Now choose the column: ");
        Col = keyboard.nextInt();       
        System.out.print("Your input: ");
        System.out.println();
        game[Row-1][Col-1] = input;
    }

    public boolean checking()
    {
        int check;
        for(int row = 0; row < 9; row++)
        {
            check=0;
            for(int col = 0; col < 9; col++)
            {
                check = check + game[row][col];
                if(check==45)
                    return true;
            }
        }
        return false;
    }

    public void display()
    {
        System.out.println(" -------------------------");
        for(int row=0;row<10;row++)
        {
            System.out.print("| ");
            for(int col=0;col<10;col++)
            {
                System.out.print(""+game[row][col]+" ");
                System.out.print("| ");
            }
            System.out.println();
            System.out.println(" -------------------------");
        }
    }

    public void read() throws IOException
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the name of the game: ");
        String load = kb.nextLine() + ".txt";
        File file = new File(load);
        Scanner inFile = new Scanner(file);
        for(int row=0;row<game.length;row++)
        {
            for(int col=0;col<game[row].length;col++)
            {
                game[row][col] = inFile.nextInt();
            }
        }
        inFile.close();
    }

    public void save() throws IOException
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("How do you want your game to be saved: ");
        String save = kb.nextLine() + ".txt";
        PrintWriter filesWrited = new PrintWriter(save);
        for(int row=0;row<game.length;row++)
        {
            for(int col=0;col<game[row].length;col++)
            {
                filesWrited.print(game[row][col]+ " \t");
            }
            filesWrited.println();
        }        
        filesWrited.close();
    }

    public void setup()
    {
        System.out.println("Choose where to place your ships");
        System.out.println("You have 1L ship(3block), 2M ships(2 blocks), and 3S ships(1 block)");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please choose the row: ");
        Row = keyboard.nextInt();        
        System.out.print("Now choose the column: ");
        Col = keyboard.nextInt();       
        System.out.print("Your input: ");
        System.out.println();
        game[Row-1][Col-1] = input;
    }
}
