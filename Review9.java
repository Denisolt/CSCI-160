public class Review9
{
    public static void main(String [] arg)
    {
        triangleTable(5);
    }

    public static void triangleTable(int num1)
    {
        for (int i=1; i<=num1; i++)
        {
            for(int si=1; si<=i;si++)
            {
                System.out.print(si + " ");
            }

            System.out.println();
        }
    }
}