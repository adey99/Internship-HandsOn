import java.util.Scanner;
public class Main{
    public static Employee getEmployeeDetails(){
        Employee e=new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Id:");
        int id = sc.nextInt();
        sc.nextLine();
        e.setEmployeeId(id);
        System.out.println("Enter Name:");
        String name = sc.nextLine();
        e.setEmployeeName(name);
        System.out.println("Enter salary:");
        double sal = sc.nextDouble();
        sc.nextLine();
        e.setSalary(sal);
        return e;
    }
    public static int getPFPercentage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PF percentage:");
        int pf = sc.nextInt();
        sc.nextLine();
        return pf;
    }
    public static void main (String[] args) {
        Employee emp = getEmployeeDetails();
        emp.calculateNetSalary(getPFPercentage());
        System.out.println("Id : "+emp.getEmployeeId());
        System.out.println("Name : "+emp.getEmployeeName());
        System.out.printf("Salary : %.1f", emp.getSalary());
        System.out.printf("Net Salary : %.1f", emp.getNetSalary());
    }
}