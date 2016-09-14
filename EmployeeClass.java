/* 24.09.2015
 * Denisolt Shakhbulatov
_______________________________________________________________________________
+                               EmployeeClass                                 +
+_____________________________________________________________________________+
+                          -employeeName: String                              +
+                               -IDNum: int                                   +
+                           -Department: String                               +
+                            -Position: String                                +
+____________________________________________________________________________ +
++EmployeeClass(employeeName:String,ID:int,Department:String,Position:String):+ 
+                            +getname( ): String                              +
+                              +getID( ): int                                 +
+                         +getDepartment( ): String                           +
+                          +getPosition( ): String                            +
________________________________________________________________________________
 */
public class EmployeeClass
{
    private String employeeName;
    private int IDNum;
    private String department;
    private String position;
    public EmployeeClass(String employee, int ID, String Department, String Position)
    {
        employeeName = employee;
        IDNum = ID;
        department = Department;
        position = Position;
    }

    public String getname()
    {
        return employeeName;
    }

    public int getID()
    {
        return IDNum;
    }

    public String getDepartment()
    {
        return department;
    }

    public String getPosition()
    {
        return position;
    }

    

}
