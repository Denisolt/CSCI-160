import java.util.Scanner;
public class custom3
{
    public static void main(String[] args)
    {
        int rows;
        int cols;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("write the number of rows; ");
        rows = keyboard.nextInt();
        System.out.println("write the number of columns; ");
        cols = keyboard.nextInt();
        
        for(int r = 0;r<rows;r++)
        {
            for(int c=0;c<=cols;c++)
                System.out.print("*");
            System.out.println();
        }
    }
}