package virtualpetsamok;

public class OrganicPet extends Pet {

	private int hunger;

	public OrganicPet(String name, String description) {
		super(name, description);
		this.hunger = 0;

	}

	public OrganicPet(String name, String description, int hunger) {
		super(name, description);
		this.hunger = hunger;
	}

	public int getHunger() {
		return hunger;
	}

}
