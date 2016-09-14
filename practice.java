import java.util.Scanner;
public class practice
{
    public static void main(String [] arg)
    {
        int[][] numbers = {{1,2,3,4,5,}, {5,6,7,8,9,}, {9,10,11,12,10,},{2,7,9,12,19,},{20,53,23,13,55,}};
        System.out.println("Here are the values in the array." );
        showArray(numbers);
        do
        {
            System.out.println();
            int col = inputValCol();
            System.out.println("Totals of Col");
            int totalCol = totalOfCol(numbers, col);
            System.out.println();
            int row = inputValRow();
            System.out.println("Totals of Rows");
            int totalRow = totalOfRow(numbers, row);
        }
        while(Playagain());
    }

    public static int totalOfCol(int[][]numbers, int col)
    {
        int total = 0;
        for(int col1=0; col1<numbers[col].length;col1++)//TO FIND THE TOTAL OF COLUMS IN 2D ARRAYS
        {
            for(int row=0; row<numbers.length; row++)
            {
                total +=numbers[row][col];
            }
        }
        System.out.println("total of col " + col + " is " +total);
        return total;
    }

    public static int totalOfRow(int[][]numbers, int row)
    {
        int total = 0;
        for(int row1 = 0; row1<numbers[row].length; row1++)
        {          
            total +=numbers[row][row1];
        } 
        System.out.println("total of row " + row + " is " +total);
        return total;
    }

    public static void showArray(int[][] numbers)
    { 
        for(int row=0; row<numbers.length;row++)//TO FIND THE TOTAL OF ROWS IN 2D ARRAYS
        {
            for(int col =0; col<numbers[row].length; col++)
            {
                System.out.print(numbers[row][col] + " ");
            }
            System.out.println();
        } 
    }

    public static void myMethod(int[] numbers)
    {
        for (int index = 1; index<=numbers.length; index++)
        {
            System.out.print(index+" ");
        }
    }

    public static void zero(int [] numbers)
    {
        for (int index = 0; index<numbers.length; index++)
        {
            numbers[index] = 0;
            System.out.println(numbers[index]);
        }
    }

    public static int findHighest(int [] numbers)//METHOD FIND HIGHEST
    {
        int highest = numbers[0];
        for (int i=1; i<numbers.length; i++)
        {
            if (numbers[i]>highest)
                highest = numbers[i];
        }
        System.out.println("The highest is: "+highest);
        return highest; 
    }

    public static int findLowest(int [] numbers)//METHOD FIND LOWEST
    {
        int lowest = numbers[0];
        for (int i=1; i<numbers.length; i++)
        {
            if (numbers[i]<lowest)
                lowest = numbers[i];
        }
        System.out.println("The lowest is: "+lowest);
        return lowest; 
    }

    public static double findtotal(int [] numbers)
    {
        double total = 0;
        for (int index=0; index<numbers.length; index++)
        {
            total = total+numbers[index];
        }
        System.out.println("The total is: "+total);
        return total;
    }

    public static double findaverage(int [] numbers)
    {
        double total=0;
        for (int index=0; index<numbers.length; index++)
        {
            total = total+numbers[index];
        }
        double average = total/numbers.length;
        System.out.println("The average is: "+average);
        return average;
    }

    public static double[] getArray()
    {
        double[] array = {1.2, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8, 8.9};
        return array;
    }

    public static boolean commonEnd(int[] a, int[] b) 
    {
        boolean isTrue = true;
        int start1 = a[0];
        int start2 = b[0];
        int end1=0;;
        for (int i=1; i<a.length; i++)
        {
            end1 = a[i];
        }
        int end2=0;
        for (int i=1; i<b.length; i++)
        {
            end2 = b[i];
        }
        if(start1==start2||end1==end2)
        {
            isTrue = true;
            System.out.print(isTrue);
        }
        else 
        {
            isTrue = false;
            System.out.print(isTrue);
        }
        return isTrue;
    }

    public static int inputValCol()
    {
        System.out.print("Enter a number of a column to find it's total: ");
        Scanner kb = new Scanner(System.in);
        int inputVal = kb.nextInt();
        return inputVal;
    }

    public static int inputValRow()
    {
        System.out.print("Enter a number of a row to find it's total: ");
        Scanner kb = new Scanner(System.in);
        int inputVal = kb.nextInt();
        return inputVal;
    }

    public static boolean Playagain()
    {
        String playAgain;
        do
        {
            System.out.println();
            Scanner keyboard = new Scanner (System.in);  
            System.out.print("Do you want to try again (Y/N)?:  ");
            playAgain = keyboard.nextLine();
        }
        while(!playAgain.equalsIgnoreCase("y")&&!playAgain.equalsIgnoreCase("n"));
        System.out.println();
        if (!playAgain.equalsIgnoreCase("y"))
            return false;
        else 
            return true;
    }
}