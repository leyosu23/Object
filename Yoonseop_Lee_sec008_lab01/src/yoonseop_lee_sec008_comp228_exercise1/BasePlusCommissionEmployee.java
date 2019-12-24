package yoonseop_lee_sec008_comp228_exercise1;

public class BasePlusCommissionEmployee {

	// fields
	int employeeID;
	String firstName;
	String lastName;
	double baseSalary = 200.00;
	int grossSales;
	double commissionRate= 0.1; 
	
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
	
	public double getBaseSalary() {
		return baseSalary;
	}
	
	public int getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(int grossSales) {
		if(grossSales < 0)
		{
			this.grossSales = grossSales;
		}
		else
		{
			System.out.println("grossSale should not be negative");
		}
	}
	
	public double getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(double commissionRate) {
		if(commissionRate > 0.1 && commissionRate < 1)
		{
			this.commissionRate = commissionRate;
		}
		else
		{
			System.out.println("Commission Rate should be between 0.1 and 1.");
		}
	}
	
	// method
		public double earnings()
		{
			double employeeCommission = commissionRate * grossSales / 100 + baseSalary;
			return employeeCommission;
		}
		
	// constructor
	public BasePlusCommissionEmployee(int employeeID, String firstName, String lastName, int grossSales,
			double commissionRate, double baseSalary) {
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
		
		if(baseSalary > 0)
		{
			this.baseSalary = baseSalary;
		}
		else
		{
			System.out.println("baseSalary should not be negative.");
		}
		
	}
	
	public BasePlusCommissionEmployee(int employeeID, String firstName, String lastName, double baseSalary) {
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
		
		if(baseSalary>200)
		{
			this.baseSalary = baseSalary;
		}
		else
		{
			System.out.println("baseSalary should be greater than 200.");
		}
	}
	
	@Override
	public String toString()
	{
		return String.format("Employee ID: %s\t Employee Name: %s\t Gross Sales: $%s\t Base Salary: %s\t Commission Rate: %s\t ==>  Employee Commission: $%s", employeeID, firstName + " " + lastName,  grossSales, baseSalary, commissionRate, earnings());
	}
	
}
