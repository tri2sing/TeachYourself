package payroll;

public class CommissionedEmployee extends AbstractEmployee {

	private int units;		// number of units sold
	double commission;		// compensation amount per unit
	
	public CommissionedEmployee(String firstName, String lastName, double wage,
			double commission) {
		super(firstName, lastName, wage);
		this.commission = commission;
	}

	@Override
	public double calculatePay() {
		return getWage() + units * commission;
	}
	
	
	public int getUnits() {
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

	

}
