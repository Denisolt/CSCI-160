//Denisolt Shakhbulatov
import java.util.ArrayList;
import java.util.Scanner;
public class WordList
{
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        ArrayList<Integer>myList = new ArrayList<Integer>();
        System.out.print("Enter the first number for the arraylist: ");
        int num1 = kb.nextInt();
        System.out.print("Enter the second number for the arraylist: ");
        int num2 = kb.nextInt();
        
        myList.add(num1);
        myList.add(num2);
        
        int highest = myList.get(0);
        for (int index = 0; index < myList.size(); index++)
        {
            if(highest<myList.get(index))
            {
                highest = myList.get(index);
            }
        }
        System.out.println(highest);
    }
}