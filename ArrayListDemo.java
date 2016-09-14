import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListDemo
{
    public static void main(String[] args)
    {
        ArrayList<Integer>List = new ArrayList<Integer>();

        List.add(1);
        List.add(10);
        List.add(5);
        List.add(1000);
        List.add(20);
        List.add(300);
        for(int index = 0; index<List.size(); index++)
            System.out.println(List.get(index));
        int n = find(List);
        System.out.println("Largest number is " + n);
    }

    public static int find(ArrayList<Integer>numbers)
    {
        int highest = numbers.get(0);
        int first100=0;
        for(int i = 0; i<numbers.size();i++)
        {
            if(highest < numbers.get(i))//finds the largest number
            {
                highest = numbers.get(i);
            }
        }
        for(int i=0; i<numbers.size();i++)
        {
            if(numbers.get(i)>100)//finds the first one that is larger than 100
            {
                first100 = i;
                System.out.println("The first number larger than 100 has index of " + first100);
                break;
            }
        }
        return highest;
    }
}