import java.io.*;
public class MainDriver
{
    public static void main (String[] args) throws IOException
    {
        Bingo game = new Bingo();
        game.write("input1.txt");
        game.read("input1.txt");
        int x = game.playGame();
        System.out.println("the winning number is " + x);
    }
}
