import java.util.ArrayList;
public class practicefortest
{
    public static void main(String [] args)
    {
        int[] arr = {1,2,3,4};
        int[][] numbers = {{1,2,3,4}, {10,20,30,40}};
        System.out.println(getAverage(arr));
        System.out.println(tenOrLarger(arr));
        System.out.println(findIt(arr, 2));
        System.out.println(largestIndex(arr));
        System.out.println(isSorted(arr));
    }

    public static double getAverage(int[]arr)
    {
        double average = 0.0;
        double total = 0;
        for(int i = 0; i<arr.length; i++)
            total += arr[i];
        average = total/arr.length;
        return average;
    }

    public static int tenOrLarger(int[]arr)
    {
        int num = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>10)
                num = num+1;
        }
        return num;
    }

    public static boolean findIt(int[]arr, int n)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==n)
                return true;
        }
        return false;
    }

    public static int largestIndex(int[]arr)
    {
        int highest = arr[0];
        for(int i=0; i<arr.length; i++)
            if(highest<arr[i])
                highest=i;
        return highest;
    }

    public static boolean isSorted(int[]arr)
    {
        for(int i=0; i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
                return false;
        }
        return true;
    }
}