package virtualpetsamok;

public class OrganicPet extends Pet {

	private int hunger;
	private int thirst;

	public OrganicPet(String name, String description) {
		super(name, description);
		this.hunger = 0;
		this.thirst = 0;
	}

	public OrganicPet(String name, String description, int hunger, int thirst) {
		super(name, description);
		this.hunger = hunger;
		this.thirst = thirst;

	}

	public int getHunger() {
		return hunger;
	}

	public void hungerDamage() {
		if (hunger >= 100) {
			addDamage();
		}
	}

	public void thirstDamage() {
		if (thirst >= 100) {
			addDamage();
		}
	}

	public int getThirst() {
		return thirst;
	}

	public void organicPetTick() {
		hunger += 10;
		thirst += 10;
		collectOrganicDamage();
		generalTick();
	}

	private void collectOrganicDamage() {
		hungerDamage();
		thirstDamage();
	}

}
