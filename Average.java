import java.util.Scanner;
import java.util.Arrays;
/* 
 * 11/05/2015
_______________________________
+        AverageClass         +
+______________________________
+         -int[]data          +
+        -double: mean        +
+______________________________
+          +Average():        +
+     +calculateMean():void   +
+      +toString():String     +
+     +selectionSort():void   +
_______________________________
 */
public class Average
{
    private int[] data =  new int [5];
    private double mean;
    public Average()
    {
        for(int index=0; index<data.length; index++)
        {
            System.out.print("Enter a " +(index+1)+ " integer: ");
            Scanner kb = new Scanner(System.in);
            int inputVal = kb.nextInt();
            data[index] = data[index] + inputVal;
        }
        selectionSort();
        calculateMean();
    }

    public void calculateMean()
    {   
        double total = 0;
        for (int index=0; index<data.length; index++)
        {
            total = total + data[index];
        }
        mean = total/data.length;
    }

    public String toString()
    {
        String returnString = " ";

        for (int i=data.length-1; i>=0; i--)  
        {
            returnString += data[i]+ " ";
        }
        returnString = ("Scores: " + returnString + " \nAverage: " + mean);
        return returnString;
    }

    public void selectionSort()
    {
        Arrays.sort(data);
        int [] array = new int [5];
        int j=0;
        for(int i=data.length-1; i>=0; i--)
        {
            if (j<=5)
            {
                array[j] = data[i];
                j++;
            }
        }
    }

}
