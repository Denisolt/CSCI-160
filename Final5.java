import java.util.Scanner;
import java.util.LinkedList;
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Final5
{
    Scanner input = new Scanner(System.in);
    LinkedList<String>stock;
    int n;

    void getVal()
    {
        input = new Scanner(System.in);
        stock = new LinkedList<String>();
        System.out.println("Linked List - Add & Remove stock using index");
        System.out.println("\nEnter number of stock: ");
        n = input.nextInt();
        System.out.println("Enter the stock data: ");
        for(int i =0; i<n; i++)
        {
            stock.add(input.next());
        }
    }

    void display()
    {
        System.out.println(stock);
    }

    void AddIndex()
    {
        System.out.println("add using index");
        System.out.println("enter the index");
        n = input.nextInt();
        System.out.println("enter the stock data");
        n = input.nextInt();
        
    }
}
