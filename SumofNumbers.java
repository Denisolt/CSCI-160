//Denisolt Shakhbulatov
//29.09.2015
import java.util.Scanner;
public class SumofNumbers
{
    public static void main(String[] args)
    {
        int inputVal;
        int sum = 0;
        int start;
        start = 1;
        System.out.print("Please write a positive integer value: ");
        Scanner keyboard = new Scanner(System.in);
        inputVal = keyboard.nextInt();
        do
        {   sum = sum + start;
            ++start;

        
        }
        while (inputVal >= start);
        System.out.println(sum);
    }
}