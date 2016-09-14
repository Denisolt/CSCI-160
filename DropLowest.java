import java.util.Scanner;
public class DropLowest
{
    public static void main(String [] args)
    {  
        int lowest;
        int score1 = getScore();
        int score2 = getScore();
        int score3 = getScore();
        int score4 = getScore();
        int score5 = getScore();

        lowest=findLowest(score1,score2,score3,score4,score5);
        calcAverage(score1,score2,score3,score4,score5,lowest);
    }

    public static int findLowest(int score1, int score2, int score3, int score4, int score5)
    { 
        int highest = score1;
        if(score1<highest)
            lowest = score1;
        if(score2<highest)
            lowest = score2;
        if(score3<highest)
            lowest = score3;
        if(score4<highest)
            lowest = score4;
        if(score5<highest)
            lowest = score5;
        return lowest;
    }

    public static void calcAverage(int score1, int score2, int score3, int score4, int score5, int lowest)
    {
        double average = ((score1+score2+score3+score4+score5-lowest)/4);
        if (average < 60)
            System.out.println("Your test average is " + average + " and your grade is F.");
        else if (average <= 69)
            System.out.println("Your test average is " + average + " and your grade is D.");
        else if (average <= 79)
            System.out.println("Your test average is " + average + " and your grade is C.");
        else if (average <= 89)
            System.out.println("Your test average is " + average + " and your grade is B.");
        else if (average <= 100)
            System.out.println("Your test average is " + average + " and your grade is A.");
    }

    public static int getScore()
    {
        Scanner kb = new Scanner(System.in);
        int score;
        do
        {
            System.out.print("Enter a score from 0 to 100: ");
            score = kb.nextInt();
        }
        while(score<0||score>100);
        return score;
    }

}
