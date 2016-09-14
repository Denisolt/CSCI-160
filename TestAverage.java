//Deni Shakhbulatov
//09.17.2015
import java.util.Scanner;
public class TestAverage
{
    public static void main(String[] args)
    {
        double score1;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter test score 1: ");
        score1 = keyboard.nextDouble();

        double score2;

        System.out.print("Enter test score 2: ");
        score2 = keyboard.nextDouble();

        double score3;

        System.out.print("Enter test score 3: ");
        score3 = keyboard.nextDouble();

        double TestAve = (score1 + score2 + score3) / 3;

        if (TestAve < 60)
            System.out.println("Your test average is " + TestAve + " and your grade is F.");
        else if (TestAve <= 69)
            System.out.println("Your test average is " + TestAve + " and your grade is D.");
        else if (TestAve <= 79)
            System.out.println("Your test average is " + TestAve + " and your grade is C.");
        else if (TestAve <= 89)
            System.out.println("Your test average is " + TestAve + " and your grade is B.");
        else if (TestAve <= 100)
            System.out.println("Your test average is " + TestAve + " and your grade is A.");

    }
}