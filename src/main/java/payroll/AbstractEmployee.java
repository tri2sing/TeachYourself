package payroll;

public abstract class AbstractEmployee {
	
	private String firstName;
	private String lastName;
	private double wage;

	public AbstractEmployee(String firstName, String lastName, double wage) {
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
	
	public void printPay() {
		System.out.println(firstName + " " + lastName + ": $" + String.valueOf(calculatePay()));
	}
	
}
