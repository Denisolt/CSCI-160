import java.util.Scanner;
public class pascal
{
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("How many rows do you want to build? ");
        int numofRows = kb.nextInt();
        int num = (numofRows/2) + 2;
        int sum = 1;
        int start1 = 1;
        int start2 = 0;
        int nextInt = 0;
        System.out.println("      "+sum+"   ");
        for(int i = 1; i<=numofRows; i++)
        {
            if((i+1)%2==0)
            {
                for(int m=0; m<=num; m++)
                {
                    System.out.print(" ");
                }
                for(int m = 0; m<i;m++)
                {
                    start2 = start2 + start1;
                    System.out.print(sum + " " +start2 + " ");
                }
                for(int m=0; m<=num; m++)
                {
                    System.out.print(" ");
                }
            }
            else
            {
                for(int m=0; m<=num; m++)
                {
                    System.out.print(" ");
                }
                for(int m = 0; m<i;m++)
                {
                    System.out.print(sum + " "+start1 + " ");
                    start1 = start1 + start2;
                }
                for(int m=0; m<=num; m++)
                {
                    System.out.print(" ");
                }
            }
            num--;
            System.out.println(" ");
        }
    }
}