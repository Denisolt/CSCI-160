import java.util.Scanner;
/* Denisolt Shakhbulatov
 * 11/03/2015
_______________________________
+    ChargeAccountValidation  +
+______________________________
+     -int[]accnumbers        +
+______________________________
+      +isValid():void        +
_______________________________
 */
public class ChargeAccountValidation
{
    int[] accnumbers = {11111, 22222, 33333, 44444, 55555, 66666, 77777, 88888, 99999, 10101, 20202, 30303, 40404, 50505, 60606, 70707, 80808, 90909};
    public static void main(String [] arg)
    {
        ChargeAccountValidation tx = new ChargeAccountValidation();
        System.out.print("Enter a charge account number: ");
        Scanner kb = new Scanner(System.in);
        int inputVal = kb.nextInt();
        tx.isValid(inputVal);
    }

    public boolean isValid(int inputVal)
    {
        boolean isTrue = true;
        for (int index = 0; index < accnumbers.length; index++)
        {
            if (accnumbers[index]!=inputVal) 
            {
                isTrue =  false;
                System.out.print(isTrue);
            }
            else 
            {
                isTrue = true;
                System.out.print(isTrue);
            }
        }
        return isTrue;
    }
}