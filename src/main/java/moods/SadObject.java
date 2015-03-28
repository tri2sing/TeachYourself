package moods;

public class SadObject extends MoodyObject {

	@Override
	protected String getMood() {
		return "sad";
	}
	
	public void cry() {
		System.out.println("boo hoo hoo ... sob sob sob ...");
	}

}
