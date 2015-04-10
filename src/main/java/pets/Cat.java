package pets;

public class Cat extends Pet {

	@Override
	public String speak() {
		return "meow meow meow ... as I belong to " + Cat.class;
	}

}
