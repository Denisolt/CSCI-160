//Denisolt Shakhbulatov
import java.util.Scanner;
class ExtraWork
{
    public static void main(String args[])
    {
        String letter;
        do
        {
            int length = 0;
            int reverse = 0;
            
            System.out.print("Enter the number to get a reverse of it: ");
            Scanner keyboard = new Scanner(System.in);
            int inputVal = keyboard.nextInt();
            int inputValforRev = inputVal;

            reverse = reverseNum(inputValforRev, reverse);
            System.out.println("Reverse of entered number is " + reverse);

            length = numberofdigits(inputVal, length);
            System.out.println("The number of digits are: " + length);

            System.out.print("Enter the index of input: ");
            int indexNum = keyboard.nextInt();
            indexofinput(inputVal, indexNum);

            System.out.println();
            keyboard.nextLine();                      
            System.out.println("Do you want to run the program again (Y/N)?:  ");
            letter = keyboard.nextLine();
        }
        while (letter.equalsIgnoreCase("y"));

    }

    public static int reverseNum(int inputValforRev, int reverse)
    {
        while( inputValforRev != 0 )
        {   
            reverse = reverse * 10;
            reverse = reverse + inputValforRev%10;
            inputValforRev = inputValforRev/10;
        }
        return reverse;
    }

    public static int numberofdigits(int inputVal, int length)
    {
        length = ((int)Math.log10(inputVal))+1;
        return length;
    }

    public static void indexofinput(int inputVal, int indexNum)
    {
        String s = Integer.toString(inputVal);
        System.out.print("the index of " + indexNum + " is " + s.substring(indexNum,indexNum+1));
    }
}