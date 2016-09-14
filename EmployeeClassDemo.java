/* 24.09.2015*/

public class EmployeeClassDemo
{
    public static void main(String[] args)
    {

        EmployeeClass Employee1 = new EmployeeClass("Susan Meyers", 47899, "Accounting", "Vice President");
        EmployeeClass Employee2 = new EmployeeClass("Mark Jones", 39119, "IT", "Programmer");
        EmployeeClass Employee3 = new EmployeeClass("Joy Rogers", 81774, "Manufacturing", "Engineer");
        
        
        System.out.println( "Name            ID Number        Department             Position");

        System.out.println(Employee1.getname()+"    "+Employee1.getID()+"            "+Employee1.getDepartment()+"             "+Employee1.getPosition());
        System.out.println(Employee2.getname()+"      "+Employee2.getID()+"            "+Employee2.getDepartment()+"                     "+Employee2.getPosition());
        System.out.println(Employee3.getname()+"      "+Employee3.getID()+"            "+Employee3.getDepartment()+"          "+Employee3.getPosition());

    }
}
