public class Employee{
    private int employeeId;
    private String employeeName;
    private double salary,netSalary;
    public int getEmployeeId(){
        return this.employeeId;
    }
    public void setEmployeeId(int id){
        this.employeeId = id;
    }
    public String getEmployeeName(){
        return this.employeeName;
    }
    public void setEmployeeName(String name){
        this.employeeName=name;
    }
    public double getSalary(){
        return this.salary;
    }
    public void setSalary(double sal){
        this.salary = sal;
    }
    public double getNetSalary(){
        return this.netSalary;
    }
    public void setNetSalary(double netsal){
        this.netSalary = netsal;
    }
    public void calculateNetSalary(int pfpercentage){
        this.netSalary=(1- pfpercentage*0.01)*this.salary;
    }
}