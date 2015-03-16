package personality;

public class PersonalityChecker {

	public void renderSpeak(Personality personality) {
		System.out.println(personality.speak());
	}

	public static void main(String[] args) {
		
		PersonalityChecker pChecker = new PersonalityChecker();
		Personality [] personalities = new Personality[5];
		
		// Substitutability: operate on an instance of child as it is a instance of the parent
		personalities[0] = new Personality();
		personalities[1] = new Extrovert();
		personalities[2] = new Introvert();
		personalities[3] = new Optimist();
		personalities[4] = new Pessimist();
		
		// Polymorphism: an object type seems to take on on the behavior of another type
		for(int i = 0; i < 5; i++) {
			System.out.print("Personality " + String.valueOf(i) + " => ");
			pChecker.renderSpeak(personalities[i]);
		}
	}

}
