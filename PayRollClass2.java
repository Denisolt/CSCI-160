/* 
 * 03/12/2016
___________________________________________
+                PayrollClass             +
+_________________________________________+
+                -String:Name             +
+                   -int:ID               +
+                 -int: hp                +
+             -double: numofhours         +
+_________________________________________+
+ +PayRollClass(String:name, int:ID):void +
+ +setHourlyPay(double:hourpay):void      +
+            +getHourlyPay():double       +
+        +setRate(int:numofh):void        +
+               +getRate():int            +
+             +getNate():String           +
+               +getID():int              +
+            +GrossPay():double           +
___________________________________________
 */
public class PayRollClass2
{
    private String Name;
    private int ID;
    private double hp;
    private int numofhours;
    public PayRollClass2(String name, int id)
    {
        ID = id;
        Name = name;
    }
    
    public void setHourlyPay(double hourpay)
    {
        hp = hourpay;
    }
    
    public double getHourlyPay()
    {
        return hp;
    }
    
    public void setRate(int numofh)
    {
        numofhours = numofh;
    }
    
    public int getRate()
    {
        return numofhours;
    }
    
    public String getname()
    {
        return Name;
    }
    
    public int getID()
    {
        return ID;
    }
    
    public double GrossPay()
    {
      double grossPay = hp*(double)numofhours;
      return grossPay;
    }
}
