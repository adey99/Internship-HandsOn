import java.util.*;
public class Main{
    public static Candidate getCandidateDetails() throws InvalidSalaryException{
        Candidate cd = new Candidate();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the candidate Details");
        System.out.println("Name");
        String name=sc.nextLine();
        cd.setName(name);
        System.out.println("Gender");
        String gen=sc.nextLine();
        cd.setGender(gen);
        System.out.println("Expected Salary");
        double sal=sc.nextDouble();
        if(sal<10000.0)
            throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
        else{
            cd.setExpectedSalary(sal);
            return cd;
        }
        
    }
    public static void main (String[] args)throws InvalidSalaryException {
        try{
        Candidate cd = getCandidateDetails();
        System.out.println("Registration Successful");
        }
        catch(InvalidSalaryException ise){
            System.out.println(ise.getMessage());
        }
    }
}