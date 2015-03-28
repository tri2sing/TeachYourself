package payroll;

public abstract class Employee {
	
	private String firstName;
	private String lastName;
	private double wage;

	public Employee(String firstName, String lastName, double wage) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.wage = wage;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public double getWage() {
		return wage;
	}

	public abstract double calculatePay();
	
	public abstract double calculateBonus();
	
	public void printPay() {
		System.out.println(firstName + " " + lastName + ": $" + String.valueOf(calculatePay()));
	}
	
	public String toString() {
		return(firstName + " " + lastName);
	}
}
