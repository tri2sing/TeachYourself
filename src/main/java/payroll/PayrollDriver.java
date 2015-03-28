package payroll;

public class PayrollDriver {

	public static void main(String[] args) {
		Payroll payroll = new Payroll();
		Commissioned comm1 = new Commissioned("Joe", "Sales", 75000, 750);
		Commissioned comm2 = new Commissioned("Jane", "Sales", 100000, 1000);
		Hourly hourly1 = new Hourly("Jack", "Retail", 8.50);
		Hourly hourly2 = new Hourly("Jill", "Retail", 8.50);

		comm1.incrementUnits(7);
		comm2.incrementUnits(9);
		hourly1.addHours(20);
		hourly2.addHours(40);
		
		// Use overloaded methods
		payroll.extractEmployeeDetails(comm1);
		payroll.extractEmployeeDetails(comm2);
		payroll.extractEmployeeDetails(hourly1);
		payroll.extractEmployeeDetails(hourly2);
		
		Employee [] employees = new Employee[4];
		employees[0] = comm1;
		employees[1] = comm2;
		employees[2] = hourly1;
		employees[3] = hourly2;
		// Inclusion overloading
		payroll.calculateTotalEmployeesPay(employees);
		payroll.printReport();
		payroll.payBonus(employees);
	}
}
