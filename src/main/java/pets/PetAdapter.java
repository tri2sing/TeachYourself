package pets;

import moods.MoodyObject;

public class PetAdapter extends MoodyObject {

	private Pet pet;
	
	public PetAdapter(Pet pet) {
		this.pet = pet;
	}
	
	@Override
	protected String getMood() {
		return pet.speak();
	}
	
	@Override
	public void queryMood() {
		System.out.println(getMood());
	}
	
}
