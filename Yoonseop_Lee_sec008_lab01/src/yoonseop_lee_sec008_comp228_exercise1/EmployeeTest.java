package yoonseop_lee_sec008_comp228_exercise1;

public class EmployeeTest {

	public static void main(String[] args) {
		BasePlusCommissionEmployee employee1 = new BasePlusCommissionEmployee(246813579, "Happy", "Employee", 10000, 0.9 , 5000);
		CommissionEmployee employee2 = new CommissionEmployee(123456789, "John", "Dow", 3000, 0.5);
		HourlyEmployee employee3 = new HourlyEmployee(135792468, "Who", "Ever", 40, 30, 0.4);
		
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
	}
}
