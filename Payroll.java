import java.util.*;
import java.text.DecimalFormat;
public class Payroll 
{
    public int employeeId[] = {5658845,4520125,7895122,8777541,8451277,1302850,7580489};
    public int hours[] = {40, 41, 42, 43, 44, 45, 46};
    public double payRate[] = {13.6, 13.5, 13.4, 13.3, 13.2, 13.1, 13.0};
    public double wages[]= new double [7];

    public static void main(String args[])
    {            
        DecimalFormat df = new DecimalFormat("#.##"); 
        Payroll t = new Payroll();
        double [] w = t.getWage();

        System.out.println("employeeID       Hours         payRate         Wages");
        for (int i =0; i<7;i++)
        {

            System.out.println(t.employeeId[i] + "          "+t.hours[i]+ "            " +t.payRate[i]+ 
                "            " +df.format(w[i]));
        }
    }

    public double [] getWage()
    {
        for(int i=0;i<7;i++)
        {
            wages[i] = hours[i]*payRate[i];

        }
        return wages;
    }
}