package moods;

public class Psychiatrist {

	// Inclusion polymorphism to generically examine any moody object
	public void examine(MoodyObject mObj) {
		System.out.println("Psychiatrist: Tell me, " + mObj.getClass().getName() + ", how do you feel today");
		System.out.println(mObj.getClass().getName() + ": I feel " + mObj.getMood());
		System.out.println();
	}
	
	// overloading: same name but different method based on subclass type
	public void observe(HappyObject happy) {
		System.out.println("Psychiatrist: Can you laugh " + happy.getClass().getName() + "?");
		System.out.print(happy.getClass().getName() + ": ");
		happy.laugh();
		System.out.println("Psychiatrist: Hmm, object seems happy");
		System.out.println();
	}

	// overloading: same name but different method based on subclass type
	public void observe(SadObject sad) {
		System.out.println("Psychiatrist: Can you cry " + sad.getClass().getName() + "?");
		System.out.print(sad.getClass().getName() + ": ");
		sad.cry();;
		System.out.println("Psychiatrist: Hmm, object seems sad");
		System.out.println();
	}

}
