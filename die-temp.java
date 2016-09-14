/* Nicholas Takyi
 * CSCI 125 M03
 * Ocotber 29, 2015
 */
import java.util.Random;
public class die
{

    private int sides = 6;
    private int value;

    public die()
    {
        roll();
    }

    public void roll()
    {
        Random rand = new Random();
        value = rand.nextInt(sides) + 1;
    }

    public int getValue()
    {
        return value;
    }

     public static int getSides()
    {
        die die = new die();  
        int rollValue = die.getValue();
        
        die.roll();
        rollValue = die.getValue();
        
        return rollValue + rollValue; 
    }
}
