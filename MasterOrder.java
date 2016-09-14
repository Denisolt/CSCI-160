/*
Denisolt Shakhbulatov
18.11.2015
_______________________________________
+              MasterOrder            +
+_____________________________________+
+  -orders:ArrayList<CookieOrder>     +
+_____________________________________+
+             +MasterOrder()          +
++addOrder(theOrder:CookieOrder):void +
+        +getTotalBoxes():int         +
++removeVariety(cookieVar:String):void+
+           +showOrders():void        +
+_____________________________________+
 * 
 */
import java.util.ArrayList;
public class MasterOrder
{
    private ArrayList<CookieOrder>orders;
    public MasterOrder()
    { 
        orders = new ArrayList<CookieOrder>(); 
    }

    public void addOrder(CookieOrder input)
    { 
        orders.add(input);
    }

    public int getTotalBoxes()
    { 
        int boxes = 0;
        for (CookieOrder order : orders)
            boxes = boxes + order.getNumBoxes();
        return boxes;
    }

    public int removeVariety(String input)
    {
        int count =0;
        for (int index = 0; index < orders.size(); index++)
        {
            if (input.equalsIgnoreCase(orders.get(index).getVariety()))
            {
                count = count + orders.get(index).getNumBoxes();
                orders.remove(index).getVariety();
            }
        }
        System.out.println(count + " were removed.");
        return count;
    }

    public void showOrders()
    {
        for(int index = 0; index<orders.size(); index++)
            System.out.println(orders.get(index).getVariety() + "   " + orders.get(index).getNumBoxes());
        System.out.println("There are " + getTotalBoxes() + " boxes of cookies in total.");
    }
}