package pets;

public class Dog extends Pet {

	@Override
	public String speak() {
		return "woof woof woof ... as I belong to " + Dog.class;
	}

}
