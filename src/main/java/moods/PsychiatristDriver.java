package moods;

public class PsychiatristDriver {
	
	public static void main(String [] args) {
		HappyObject happy = new HappyObject();
		SadObject sad = new SadObject();
		Psychiatrist psych = new Psychiatrist();
		
		psych.examine(happy);
		psych.examine(sad);
		psych.observe(happy);
		psych.observe(sad);
	}
}
