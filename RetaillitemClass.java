/* 01.11.2015
_______________________________________________________________________________
+                               RetaillitemClass                              +
+_____________________________________________________________________________+
+                            -description: String                             +
+                             -unitsOnHand: int                               +
+                              -price: double                                 +
+____________________________________________________________________________ +
+      +RetaillitemClass(Description:String, UnitsOnHand:int, Price:double)   +
+                            +RetaillitemClass()                              + 
+                         +getdescription(): String                           +
+                          +getnumberOfUnits(): int                           +
+                            +getPrice(): double                              +
________________________________________________________________________________
 */
public class RetaillitemClass
{
    private String description;
    private int unitsOnHand;
    private double price;
    public RetaillitemClass()
    {
        description = "Jacket";
        unitsOnHand = 12;
        price = 59.95;
    }
    
    public RetaillitemClass(String Description, int UnitsOnHand, double Price)
    {
        description = Description;
        unitsOnHand = UnitsOnHand;
        price = Price;
    }

    public String getdescription()
    {
        return description;
    }

    public int getnumberOfUnits()
    {
        return unitsOnHand;
    }

    public double getPrice()
    {
        return price;
    }

    public static void main(String[] args)
    {

        RetaillitemClass Item1 = new RetaillitemClass();
        RetaillitemClass Item2 = new RetaillitemClass("Designer Jeans", 40, 34.95);
        RetaillitemClass Item3 = new RetaillitemClass("Shirt", 20, 24.95);
        System.out.println( "         Description        Units on Hand      Price");
        System.out.println( "         _____________________________________________________");

        System.out.println("Item #1  "+Item1.getdescription()+"             "+Item1.getnumberOfUnits()+"                 "+Item1.getPrice());
        System.out.println("Item #2  "+Item2.getdescription()+"     "+Item2.getnumberOfUnits()+"                 "+Item2.getPrice());
        System.out.println("Item #3  "+Item3.getdescription()+"              "+Item3.getnumberOfUnits()+"                 "+Item3.getPrice());

    }
}
