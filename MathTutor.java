//Denisolt Shakhbulatov
//29.09.2015
import java.util.Scanner;
public class MathTutor
{
    public static void main(String[] args)
    {
        int rnum1 = (int)(40*Math.random())+11;
        int rnum2 = (int)(40*Math.random())+11;
        int total = rnum1+rnum2;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Our program picked two random numbers from 10 to 50 and added them up");
        System.out.println("Can you guess the sum?");
        System.out.print("Write your guess here: ");
        int total2 = keyboard.nextInt();

        if (total2 == total)
        {
            System.out.println("Good Job. The sum is " + total);
        }
        else
            System.out.println("Sorry, you got it wrong. The sum is " +total);

    }
}