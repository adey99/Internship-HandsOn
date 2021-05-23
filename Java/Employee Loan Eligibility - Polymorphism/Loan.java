
public class Loan {
	
	//Implement the below method 
	
	public double calculateLoanAmount(Employee employeeObj) {
		double loan_amt;
		if(employeeObj instanceof PermanentEmployee)
		    loan_amt = employeeObj.getSalary()*0.15;
		else
		    loan_amt = employeeObj.getSalary()*0.1;
		return loan_amt;
	}

}
