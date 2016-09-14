//10.12.2015
import java.util.Scanner;
public class Prof5_1PA
{

    public static void main (String [] args) 
    {
        displayData();
    }
    
    public static void displayData()
    {   System.out.println("Fahrenheit" + "\t" +"Celsius");
        for (double tempF = 32; tempF >= 32 && tempF<=212;)
        {   
            double tempC=((tempF-32)*5)/9;
            System.out.println("______________________");
            System.out.printf("  "+tempF + "\t\t" + "%.2f\n", tempC);
            tempF=tempF+20;
        }
    }
}