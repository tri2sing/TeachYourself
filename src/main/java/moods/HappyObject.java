package moods;

public class HappyObject extends MoodyObject {

	@Override
	protected String getMood() {
		return "happy";
	}
	
	public void laugh() {
		System.out.println("he he he ... ha ha ha ...");
	}

}
