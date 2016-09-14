//Denisolt Shakhbulatov
//31.09.2015
import java.util.Scanner;
import java.io.*;
public class readfromfile
{   public static void main(String[] arg) throws IOException
    { 
        File deposfile = new File("Deposits.txt");
        Scanner inputFile = new Scanner(deposfile);
        Double SumOfDep=0.0;
        Double SumOfWith=0.0;
        while (inputFile.hasNext())
        {  
            double number = inputFile.nextDouble();
            SumOfDep = SumOfDep + number;
        }
        inputFile.close();
        
        
        
        File withdrawalsfile = new File("Withdrawals.txt");
        Scanner withinputFile = new Scanner(withdrawalsfile);

        while (withinputFile.hasNext())
        {
            double number2 = withinputFile.nextDouble();
            SumOfWith = SumOfWith + number2;
        }
        inputFile.close();
        System.out.println("The sum of deposits is " + SumOfDep);
        System.out.println("The sum of withdrawals is " + SumOfWith);

        System.out.println("The sum of deposits is " + SumOfDep);
    }
}