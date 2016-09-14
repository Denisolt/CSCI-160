//Denisolt Shakhbulatov
//18.11.2015
import java.util.ArrayList;
/*
Denisolt Shakhbulatov
18.11.2015
________________________________
+          PhoneBookEntry      +
+______________________________+
+   -name:ArrayList<String>    +
+   -number:ArrayList<String>  +
+______________________________+
+       +PhoneBookEntry()      +
+  +addName(input:String):void +
+  +addNumber(num:String):void +
+          +Show():void        +
+     +main(String [] args)    +
+______________________________+
 */
public class PhoneBookEntry
{
    private ArrayList<String>name = new ArrayList<String>();
    private ArrayList<String>number = new ArrayList<String>();

    public PhoneBookEntry()
    {

    }

    public void addName(String input)
    {
        name.add(input);
    }

    public void addNumber(String num)
    {
        number.add(num);
    }

    public void Show()
    {
        for(int index = 0; index<name.size(); index++)
            System.out.println(name.get(index)+"    "+number.get(index));
    }

    public static void main(String [] args)
    {
        PhoneBookEntry myPhoneBook = new PhoneBookEntry();
        myPhoneBook.addName("AAA              ");
        myPhoneBook.addNumber("800_222_4357");
        myPhoneBook.addName("GMAC             ");
        myPhoneBook.addNumber("800_200_4622");
        myPhoneBook.addName("Allstate Roadside");
        myPhoneBook.addNumber("800_869_7997");
        myPhoneBook.addName("Sallie Mae       ");
        myPhoneBook.addNumber("800_272_5543");
        myPhoneBook.addName("USAA             "); 
        myPhoneBook.addNumber("800_531_2265");
        myPhoneBook.addName("Merrill Lynch    ");
        myPhoneBook.addNumber("800_637_7455");

        System.out.println("Name                 Phone Number");
        System.out.println("_________________________________");
        myPhoneBook.Show();
    }
}