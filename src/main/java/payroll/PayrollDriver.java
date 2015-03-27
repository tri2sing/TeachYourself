package payroll;

public class PayrollDriver {

	public static void main(String[] args) {
		Payroll payroll = new Payroll();
		CommissionedEmployee comm1 = new CommissionedEmployee("Joe", "Sales", 75000, 750);
		CommissionedEmployee comm2 = new CommissionedEmployee("Jane", "Sales", 100000, 1000);
		HourlyEmployee hourly1 = new HourlyEmployee("Jack", "Retail", 8.50);
		HourlyEmployee hourly2 = new HourlyEmployee("Jill", "Retail", 8.50);

		comm1.incrementUnits(7);
		comm2.incrementUnits(9);
		hourly1.addHours(20);
		hourly2.addHours(40);
		
		// Use overloaded methods
		payroll.extractEmployeeDetails(comm1);
		payroll.extractEmployeeDetails(comm2);
		payroll.extractEmployeeDetails(hourly1);
		payroll.extractEmployeeDetails(hourly2);
		
		AbstractEmployee [] employees = new AbstractEmployee[4];
		employees[0] = comm1;
		employees[1] = comm2;
		employees[2] = hourly1;
		employees[3] = hourly2;
		// Inclusion overloading
		payroll.calculateTotalEmployeesPay(employees);
		payroll.printReport();
	}
}
