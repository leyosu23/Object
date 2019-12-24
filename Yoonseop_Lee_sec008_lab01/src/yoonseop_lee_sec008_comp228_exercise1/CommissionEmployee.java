package yoonseop_lee_sec008_comp228_exercise1;

public class CommissionEmployee {

	// fields
	int employeeID;
	String firstName;
	String lastName;
	int grossSales;
	double commissionRate = 0.1; 
	
	// getters and setters
	public int getEmployeeID() {
		return employeeID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	
	public double getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(float commissionRate) {
		if(commissionRate > 0.1 && commissionRate < 1)
		{
			this.commissionRate = commissionRate;
		}
		else
		{
			System.out.println("Commission Rate should be between 0.1 and 1.");
		}
	}
	
	public int getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(int grossSales) {
		if(grossSales > 0)
		{
			this.grossSales = grossSales;
		}
		else
		{
			System.out.println("Gross Sales should not be negative.");
		}
	}
	
	// method
	public double earnings()
	{
		double employeeCommission = commissionRate * grossSales / 100;
		return employeeCommission;
	}
	
	// constructor
	public CommissionEmployee(int employeeID, String firstName, String lastName, int grossSales, double commissionRate) {
		if(employeeID > 0)
		{
			this.employeeID = employeeID;
		}
		else
		{
			System.out.println("employee ID should not be negative.");
		}
		
		if(firstName != null)
		{
			this.firstName = firstName;
		}
		else
		{
			System.out.println("first name should not be null.");
		}
		
		if(lastName != null)
		{
			this.lastName = lastName;
		}
		else
		{
			System.out.println("last name should not be null.");
		}
		
		if(grossSales > 0)
		{
			this.grossSales = grossSales;
		}
		else
		{
			System.out.println("grossSales should not be negative.");
		}
		
		if(commissionRate > 0.1 && commissionRate <1)
		{
			this.commissionRate = commissionRate;
		}
		else
		{
			System.out.println("commissionRate should be between 0.1 and 1.");
		}
	}
	
	public CommissionEmployee(int employeeID, String firstName, String lastName) {
		if(employeeID > 0)
		{
			this.employeeID = employeeID;
		}
		else
		{
			System.out.println("employee ID should not be negative.");
		}
		
		if(firstName != null)
		{
			this.firstName = firstName;
		}
		else
		{
			System.out.println("first name should not be null.");
		}
		
		if(lastName != null)
		{
			this.lastName = lastName;
		}
		else
		{
			System.out.println("last name should not be null.");
		}
	}
	
	@Override
	public String toString()
	{
		return String.format("Employee ID: %s\t Employee Name: %s\t Gross Sales: $%s\t Commission Rate: %s\t   ==>  Employee Commission: $%s ", employeeID, firstName + " " + lastName, grossSales, commissionRate, earnings());
	}
}
