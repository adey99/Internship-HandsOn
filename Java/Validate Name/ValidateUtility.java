import java.util.*;
public class ValidateUtility
{
    public static void main(String args[])
    {
        //fill code here
        Scanner sc = new Scanner(System.in);
        String empname,prodname;
        empname = sc.nextLine();
        prodname = sc.nextLine();
        Validate v = validateEmployeeName();
        if(v.validateName(empname))
            System.out.println("Employee name is valid");
        else
            System.out.println("Employee name is invalid");
        Validate v2=validateProductName();
        if(v2.validateName(prodname))
            System.out.println("Product name is valid");
        else
            System.out.println("Product name is invalid");
    }
    
    public static Validate validateEmployeeName() 
    {
        //fill code here
        Validate v= (String name)->name.matches("[\\sA-Za-z]{5,20}");
        return v;
    }
    
    public static Validate validateProductName() 
    {
        //fill code here
        Validate v = (String name)->name.matches("[A-Za-z]{1}[0-9]{5}");
        return v;
    }
}