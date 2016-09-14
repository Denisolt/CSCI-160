/* Denisolt Shakhbulatov
 * 11/03/2015
_______________________________
+       RainfallClass         +
+______________________________
+      -String[]months        +
+     -double[]: rain         +
+     -double[]: total        +
+______________________________
+     +getTotal():double      +
+     +getAverage():double    +
+     +getMax():double        +
+      +getMin():double       +
_______________________________
 */
public class RainfallClass
{
    String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    double[] rain = {0.40, 0.94, 3.21, 3.74, 1.73, 1.03, 1.27, 2.58, 6.98, 6.90, 2.80, 2.53};
    public static void main(String [] arg)
    {
        RainfallClass tx = new RainfallClass();
        double total = tx.totalrain();
        double average = tx.averagerain(total);
        double min = tx.min();
        double max = tx.max();
        tx.showresult();
        System.out.println("total   " + total);
        System.out.println("average " + average);
        System.out.println("max     " + max);
        System.out.println("min     " + min);

    }

    public double totalrain()
    {
        double total = 0;
        for (int index=0; index<rain.length; index++)
        {
            total = total+rain[index];
        }
        return total;
    }

    public double averagerain(double total)
    {
        double average = total/rain.length;
        return average;
    }

    public double min()
    {
        double min=0;
        for (int index=0; index<rain.length;index++)
        {
            if(min<=rain[index])
                min = rain[index];
            break;
        }
        return min;
    }

    public double max()
    {
        double max=0;
        for (int index=0; index<rain.length;index++)
        {
            if(max<=rain[index])
                max = rain[index];
        }
        return max;
    }

    public void showresult()
    {
        for (int index=0; index<rain.length; index++)
        {
            System.out.println(months[index] +"\t"+ rain[index]);
        }
    }
}