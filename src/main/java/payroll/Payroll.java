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
	// Substitutability relationship enables passing any subclass as parameter.
	public void calculateTotalEmployeesPay(Employee[] employees) {
		for (int i = 0; i < employees.length; i++) {
			// Polymorphism makes it seem that AbstractEmployee has many
			// different behaviors. The calculatePay method differs for
			// each sublclass that is sent in the array parameter.
			Employee employee = employees[i];
			allEmployeesPay += employee.calculatePay();
			employee.printPay();
		}
	}

	public void payBonus(Employee[] employees) {
		for (int i = 0; i < employees.length; i++) {
			Employee employee = employees[i];
			System.out.println("Pay " + employee.getFirstName() + " "
					+ employee.getLastName() + " a bonus of $"
					+ employee.calculateBonus());
		}
	}

	// Overloading polymorphism: Need one copy of method for each employee type
	// This makes more constraining than inclusion for future subtype extension.
	public void extractEmployeeDetails(Commissioned employee) {
		allEmployeesUnits += employee.getUnitsSold();
	}

	// Overloading polymorphism: Need one copy of method for each employee type
	// This makes more constraining than inclusion for future subtype extension.
	public void extractEmployeeDetails(Hourly employee) {
		allEmployeesHours += employee.getHours();
	}

	public void printReport() {
		System.out.println("Payroll Report:");
		System.out.println("Total Hours: " + allEmployeesHours);
		System.out.println("Total Units: " + allEmployeesUnits);
		System.out.println("Total payroll: $ " + allEmployeesPay);
	}

}
