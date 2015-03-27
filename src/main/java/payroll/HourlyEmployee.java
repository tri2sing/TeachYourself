package payroll;

public class HourlyEmployee extends AbstractEmployee {

	private int hours;		// Number of hours worked
	
	public HourlyEmployee(String firstName, String lastName, double wage) {
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

}
