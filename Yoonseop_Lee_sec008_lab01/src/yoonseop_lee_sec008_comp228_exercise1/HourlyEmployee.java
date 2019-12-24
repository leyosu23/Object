package yoonseop_lee_sec008_comp228_exercise1;

public class HourlyEmployee {

	// fields
	int employeeID;
	String firstName;
	String lastName;
	int hoursWorkedPerWeek;
	double hourlyRate;
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

	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		if(hourlyRate > 14)
		{
			this.hourlyRate = hourlyRate;
		}
		else
		{
			System.out.println("hourlyRate should not be less than 14.");
		}
	}
	
	public int getHoursWorkedPerWeek() {
		return hoursWorkedPerWeek;
	}
	public void setHoursWorkedPerWeek(int hoursWorkedPerWeek) {
		if(hoursWorkedPerWeek>0)
		{
			this.hoursWorkedPerWeek = hoursWorkedPerWeek;
		}
		else
		{
			System.out.println("hours worked per week should not be less than 0.");
		}
	}
	
	// method 
		public double earnings()
		{
			double employeeCommission = hoursWorkedPerWeek * hourlyRate * commissionRate;
			return employeeCommission;
		}
		
	// constructor
	public HourlyEmployee(int employeeID, String firstName, String lastName, int hoursWorkedPerWeek,
			double hourlyRate, double commissionRate) {
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
		
		if(hoursWorkedPerWeek > 0)
		{
			this.hoursWorkedPerWeek = hoursWorkedPerWeek;
		}
		else
		{
			System.out.println("hours worked per week should not be less than 0.");
		}
		
		if(hourlyRate > 14)
		{
			this.hourlyRate = hourlyRate;
		}
		else
		{
			System.out.println("hourlyRate should not be less than 14.");
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
	
	public HourlyEmployee(int employeeID, String firstName, String lastName) {
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
		return String.format("Employee ID: %s\t Employee Name: %s\t Hours Worked Per Week: %s\t Hourly Rate: $%s\t  Commission Rate: %s\t ==>  Employee Commission: $%s ", employeeID, firstName + " " + lastName, hoursWorkedPerWeek, hourlyRate, commissionRate, earnings());	
		
	}
}
