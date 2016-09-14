
public class PayRollClassDemo2
{
    public static void main(String[] args)
    {
        PayRollClass2 Employee1 = new PayRollClass2("Joe Shmo", 1111);
        Employee1.setHourlyPay(15);
        Employee1.setRate(50);
        
        PayRollClass2 Employee2 = new PayRollClass2("Sally Smith", 2222);
        Employee2.setHourlyPay(20);
        Employee2.setRate(50);
        
        PayRollClass2 Employee3 = new PayRollClass2("Juan Lola", 3333);
        
        Employee3.setHourlyPay(25);
        Employee3.setRate(40);
        
        
        System.out.println( "ID     Name        rate/hr   hrs/worked    Gross pay");
        System.out.println("__________________________________________________");
        System.out.println(Employee1.getID()+"   "+Employee1.getname()+"        "+Employee1.getHourlyPay()+"        "+Employee1.getRate()+"        "+Employee1.GrossPay()  );
        System.out.println(Employee2.getID()+"   "+Employee2.getname()+"     "+Employee2.getHourlyPay()+"        "+Employee2.getRate()+"        "+Employee2.GrossPay()  );
        System.out.println(Employee3.getID()+"   "+Employee3.getname()+"       "+Employee3.getHourlyPay()+"        "+Employee3.getRate()+"        "+Employee3.GrossPay()  );
    }
}