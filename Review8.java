public class Review8
{
    public static void main(String[] arg)
    {
        multiplicationTable(5);
    }

    public static void multiplicationTable(int rows)
    {

        for (int i=1; i<=rows; i++)
        {
            for(int si=1; si<=rows;si++)
            {
                System.out.print(si*i + " ");
            }
            System.out.println(" ");
        }
    }
}