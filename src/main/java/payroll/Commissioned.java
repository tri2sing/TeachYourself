package payroll;

public class Commissioned extends Employee {

	private int units;		// number of units sold
	double commission;		// compensation amount per unit
	
	public Commissioned(String firstName, String lastName, double wage,
			double commission) {
		super(firstName, lastName, wage);
		this.commission = commission;
	}
	
	public int getUnitsSold() {
		return units;
	}

	public void incrementUnits(int units) {
		this.units += units;
	}
	
	public void resetUnits() {
		this.units = 0;
	}
	
	public double getCommission() {
		return commission;
	}

	@Override
	public double calculateBonus() {
		return 100.0 * getUnitsSold();
	}

	@Override
	public double calculatePay() {
		return getWage() + units * commission;
	}
		
}
