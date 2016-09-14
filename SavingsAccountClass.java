import java.util.Scanner;
/* Date
 * Amitoj Jahar
_______________________________________________________________________________
+                             SavingsAccountClass                             +
+_____________________________________________________________________________+
+                             -intRate: double                                +
+                             -balance: double                                +
+____________________________________________________________________________ +
+      +SavingsAccountClass(INTRATE:double, Balance:double)                   +
+                             +deposit(): double                              + 
+                             +withdraw(): double                             +
+                              +setInt(): double                              +
+                          +addInterest(Int): double                          +
________________________________________________________________________________
 */
public class SavingsAccountClass
{
    private double intRate;
    private double balance;

    public SavingsAccountClass (double INTRATE, double Balance)
    {
        intRate = INTRATE;
        balance = Balance;
    }

    public double deposit()
    {
        balance = balance + 100;
        return balance;
    }

    public double withdraw()
    {
        balance = balance - 50;
        return balance;
    }

    public double setInt()
    {
        double Int = (intRate/12)*balance;
        double int1 = Math.round(Int*100.00)/100.00;
        return int1;
    }

    public double addInterest(double Int)
    {
        balance = balance + Int;
        return balance;
    }

    public static void main(String[] args)
    {
        SavingsAccountClass test1 = new SavingsAccountClass(0.00, 500.00);
        SavingsAccountClass test2 = new SavingsAccountClass(0.12, 500.00);
        SavingsAccountClass test3 = new SavingsAccountClass(0.24, 500.00);
        System.out.println( "Starting   Annual     Months   Deposits   Withdrawals   Interest   Ending");
        System.out.println( "Balance    int.rate                                     earned     balance");
        double Int;
        
        Int = test1.setInt();
        test1.deposit();
        test1.withdraw();
        test1.addInterest(Int);
        System.out.println("500"+"        "+test1.intRate+"        1        100        50            "+test1.setInt()+"        "+test1.balance);

        Int = test2.setInt();
        test2.deposit();
        test2.withdraw();
        test2.addInterest(Int);
        System.out.println("500"+"        "+test2.intRate+"       1        100        50            "+test2.setInt()+"       "+test2.balance);

        Int = test3.setInt();
        test3.deposit();
        test3.withdraw();     
        test3.addInterest(Int);
        System.out.println("500"+"        "+test3.intRate+"       1        100        50            "+test3.setInt()+"       "+test3.balance);

    }
}
