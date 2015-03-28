package payroll;

public class Hourly extends Employee {

	private int hours;		// Number of hours worked
	
	public Hourly(String firstName, String lastName, double wage) {
		super(firstName, lastName, wage);
	}

	public int getHours() {
		return hours;
	}
	
	public void resetHours() {
		hours = 0;
	}
	
	public void addHours(int hours) {
		this.hours += hours;
	}

	@Override
	public double calculatePay() {
		return getWage() * hours;
	}

	@Override
	public double calculateBonus() {
		return 100;
	}

}
