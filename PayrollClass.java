import java.util.Scanner;
/* Amitoj
 * 04/03/2016
_______________________________
+       PayrollClass          +
+______________________________
+      -int:employseid       +
+     -int[]: hours           +
+     -double[]: payRate      +
+______________________________
+     +getWages():void        +
_______________________________
 */
public class PayrollClass
{
    int[] employseid = {56588, 45201, 78951, 87775, 84512, 13028, 75804};
    int[] hours = {40, 41, 42, 43, 44, 45, 46};
    double[] payRate = {13.60, 13.50, 13.40, 13.30, 13.20, 13.10, 13.00};
    public static void main(String [] arg)
    {
        PayrollClass tx = new PayrollClass();
        tx.getWages();
    }

    public void getWages()
    {
        System.out.println("employeeld" +"\t"+"hours" +"\t"+"payRate" +"\t"+"wages");
        double[] wages = new double[employseid.length];
        for (int index=0; index<employseid.length; index++)
        {
            wages[index] = hours[index]*payRate[index];
        }

        for (int i=0; i<employseid.length; i++)
        {
            System.out.printf(employseid[i] +"\t"+"\t"+hours[i] +"\t"+  payRate[i]+"0\t" + "%,.2f%n", wages[i]);
        }
    }
}