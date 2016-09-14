//Denisolt Shakhbulatov
//11.16.2015
public class int2DArray
{
    public static void main(String[] args)
    {
        int[][] iarray = { { 2,1,9}, {7,3,4}, { 5,6,8} };
        System.out.println("Processing iarray.");
        System.out.println("Total : " + getTotal(iarray));
        System.out.println("Average : " + getAverage(iarray));
        for (int r =0; r < iarray.length; r++) 
        {
            System.out.println("Total of row " +r+ " : "+ getRowTotal(iarray,r));
        }
        for (int c =0; c < iarray.length; c++) 
        {
            System.out.println("Total of col " +c+ " : "+ getColTotal(iarray,c));
        }       
        for (int r =0; r < iarray.length; r++) 
        {
            System.out.println("Highest in row " +r+ " : "+ getHighestinRow(iarray,r));
        }    
        for (int r =0; r < iarray.length; r++) 
        {
            System.out.println("Lowest in row " +r+ " : "+ getLowestinRow(iarray,r));
        }
    }

    public static int getTotal(int[][] iarray)
    {
        int total = 0;
        for (int row = 0; row < iarray.length; row++)
        {
            for (int col = 0; col < iarray[row].length; col++)
                total += iarray[row][col];
        }
        return total;
    }

    public static double getAverage(int[][] iarray)
    {
        int total = 0;
        for (int row = 0; row < iarray.length; row++)
        {
            for (int col = 0; col < iarray[row].length; col++)
                total += iarray[row][col];
        }
        double average = total/(3*iarray.length);
        return average;
    }

    public static int getRowTotal(int[][] iarray, int row)
    {
        int total = 0;
        for (int r = 0; r < iarray[row].length; r++)
        {
            total += iarray[row][r];
        }
        return total;
    }

    public static int getColTotal(int[][] iarray, int col)
    {
        int total = 0;
        for (int c = 0; c < iarray.length; c++)
        {
            total += iarray[c][col];
        }
        return total;
    }

    public static int getHighestinRow(int [][] iarray, int row)//METHOD FIND HIGHEST
    {
        int highest = iarray[row][0];
        for (int i=1; i<iarray.length; i++)
        {
            if (iarray[row][i]>highest)
                highest = iarray[row][i];
        }
        return highest; 
    }

    public static int getLowestinRow(int [][] iarray, int row)//METHOD FIND LOWEST
    {
        int lowest = iarray[row][0];
        for (int i=1; i<iarray.length; i++)
        {
            if (iarray[row][i]<lowest)
                lowest = iarray[row][i];
        }
        return lowest; 
    }
}