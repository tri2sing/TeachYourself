package payroll;

public class Payroll {

	private int allEmployeesHours;
	private int allEmployeesUnits;
	private double allEmployeesPay;

	public Payroll() {
		allEmployeesHours = 0;
		allEmployeesUnits = 0;
		allEmployeesPay = 0;
	}

	// Inclusion polymorphism: calculateTotalEmployeesPay method works on any
	// employee type, as long the type inherits from AbstractEmployee.
	public void calculateTotalEmployeesPay(AbstractEmployee[] employees) {
		for (int i = 0; i < employees.length; i++) {
			AbstractEmployee employee = employees[i];
			allEmployeesPay += employee.calculatePay();
			employee.printPay();
		}
	}
	
	// Overloading polymorphism: Need one copy of method for each employee type
	public void extractEmployeeDetails(CommissionedEmployee employee) {
		allEmployeesUnits += employee.getUnits();
	}

	// Overloading polymorphism: Need one copy of method for each employee type
	public void extractEmployeeDetails(HourlyEmployee employee) {
		allEmployeesHours += employee.getHours();
	}

}
