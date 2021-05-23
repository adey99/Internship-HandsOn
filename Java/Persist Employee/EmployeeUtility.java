import java.io.*;
import java.util.*;
public class EmployeeUtility{
    public  boolean  addEmployee(String fileName,ArrayList<Employee>  employeeList){
        try{
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(employeeList);
            out.close();
            file.close();
            return true;
        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
            return false;
        }
    }
    public Employee viewEmployeeById(String fileName,int employeeId){
        ArrayList<Employee> list =null;
        try{
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file);
            list = (ArrayList<Employee>)in.readObject();
            in.close();
            file.close();
            for(Employee e:list){
                if(e.getEmployeeId()==employeeId)
                    return e;
            }
            return null;
        }
        catch(Exception ex)
        {
            System.out.println("IOException is caught");
            return null;
        }
    }
    
}