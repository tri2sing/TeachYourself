package pets;

import moods.Psychiatrist;

public class PetAdapterDriver {
	
	public static void main(String [] args) {
		Psychiatrist psychiatrist = new Psychiatrist();
		PetAdapter dogAdapter = new PetAdapter(new Dog());
		PetAdapter catAdapter = new PetAdapter(new Cat());
		psychiatrist.examine(dogAdapter);
		psychiatrist.examine(catAdapter);
	}
}
